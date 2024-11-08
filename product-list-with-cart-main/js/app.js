// Fonction asynchrone pour charger les données du fichier JSON
async function loadProducts() {
    try {
        // Appel du fichier JSON
        const productData = await fetch('../product-list-with-cart-main/data.json');

        // Vérification de la réponse
        if (!productData.ok) {
            throw new Error('Erreur de chargement du fichier JSON');
        }

        // Chargement des données du fichier JSON
        const products = await productData.json();

        // Récupérer tous les éléments .plat
        const platCollection = document.querySelectorAll('.plat');
        const imageDescription = document.querySelectorAll('.image-content');
        const AllButton = document.querySelectorAll(".buttonAddCarT");

        // Boucle pour chaque plat dans le tableau de produits
        products.forEach((product, index) => {
            if (platCollection[index]) { // S'assurer qu'il y a une div .plat correspondante
                const newImage = document.createElement('img');
                newImage.src = product.image.desktop;
                newImage.alt = product.name;
                platCollection[index].appendChild(newImage);

                const newCategory = document.createElement('p');
                newCategory.textContent = product.category;
                imageDescription[index].appendChild(newCategory);

                const newName = document.createElement('h2');
                newName.textContent = product.name;
                imageDescription[index].appendChild(newName);

                const newPrice = document.createElement('p');
                newPrice.classList.add('price');
                newPrice.textContent = `$${product.price.toFixed(2)}`;
                imageDescription[index].appendChild(newPrice);
            }
        });

        AllButton.forEach((button, index) => {
            button.addEventListener('click', () => {
                // Vérifier si le bouton a déjà été activé pour éviter la réinitialisation du HTML à chaque clic
                if (!button.classList.contains('active')) {
                    platCollection[index].classList.add("active");
                    AllButton[index].classList.add("active");

                    AllButton[index].innerHTML = `
                        <span class="AddMinus">
                            <svg xmlns="http://www.w3.org/2000/svg" width="10" height="2" fill="none" viewBox="0 0 10 2">
                                <path fill="#fff" d="M0 .375h10v1.25H0V.375Z" class="minus"/>
                            </svg>
                        </span>
                        <span class="count">0</span>
                        <span class="AddMinus">
                            <svg xmlns="http://www.w3.org/2000/svg" width="10" height="10" fill="none" viewBox="0 0 10 10">
                                <path fill="#fff" d="M10 4.375H5.625V0h-1.25v4.375H0v1.25h4.375V10h1.25V5.625H10v-1.25Z" class="add"/>
                            </svg>
                        </span>`;

                    // Initialiser le compteur à 1 car l'ajout a déjà été fait
                    let count = 0;

                    // Récupérer les éléments SVG après l'injection HTML
                    const add = AllButton[index].querySelector('.add');
                    const minus = AllButton[index].querySelector('.minus');
                    const countDisplay = AllButton[index].querySelector('.count');

                    // Gérer l'ajout du compteur
                    add.addEventListener('click', () => {
                        count++;
                        countDisplay.innerHTML = count;

                        // Mise à jour du panier
                        updateCart(AllButton, platCollection);
                    });

                    // Gérer la réduction du compteur
                    minus.addEventListener('click', () => {
                        if (count > 0) { // Ne pas descendre en dessous de 1
                            count--;
                            countDisplay.innerHTML = count;
                        }

                        // Si le compteur atteint 0, retirer la classe "active"
                        if (count === 0) {
                            platCollection[index].classList.remove("active");
                            AllButton[index].classList.remove("active");
                        }

                        // Mise à jour du panier
                        updateCart(AllButton, platCollection);
                    });

                    // Mise à jour du panier pour le premier clic
                    updateCart(AllButton, platCollection);
                }
            });
        });

    } catch (error) {
        console.log('Erreur:', error); // Gérer les erreurs
    }
}

// Fonction pour mettre à jour le panier
function updateCart(AllButton, platCollection) {
    let taches = document.createElement("ul");
    const cart = document.querySelector(".default");
    cart.innerHTML = ""; // Réinitialiser le panier pour éviter les doublons
    cart.appendChild(taches);

    let totalQuantity = 0;

    // Parcourir tous les plats actifs
    document.querySelectorAll('.active').forEach((plat, idx) => {
        let productPriceElem = plat.querySelector('.price');
        let productCountElem = AllButton[idx].querySelector('.count');

        // Vérifier si .price et .count existent
        if (productPriceElem && productCountElem) {
            let productPrice = productPriceElem.textContent;
            let productCount = parseInt(productCountElem.textContent);
            let totalPrice = parseFloat(productPrice.slice(1)) * productCount;

            let li = document.createElement("li");
            li.textContent = `${productCount} x @${productPrice} = $${totalPrice.toFixed(2)}`;
            taches.appendChild(li);

            totalQuantity += productCount; // Mise à jour du nombre total d'articles dans le panier
        }
    });

    // Mettre à jour le compteur de produits dans le titre du panier
    document.querySelector('.cartNumber').textContent = totalQuantity;

    // Si le panier est vide, afficher un message par défaut
    if (totalQuantity === 0) {
        cart.innerHTML = `<img src="../product-list-with-cart-main/assets/images/illustration-empty-cart.svg" alt="Empty cart">
                          <p>Your cart empty will appear here.</p>`;
    }
}

// Appel de la fonction pour charger les produits
loadProducts();
