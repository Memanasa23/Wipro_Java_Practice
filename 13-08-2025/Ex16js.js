let images = [
    "https://images.pexels.com/photos/33217722/pexels-photo-33217722.jpeg",
    "https://images.pexels.com/photos/25682006/pexels-photo-25682006.jpeg",
    "https://images.pexels.com/photos/18373303/pexels-photo-18373303.jpeg",
    "https://images.pexels.com/photos/33253231/pexels-photo-33253231.jpeg"
];

let currentIndex = 0;

let imgElement = document.getElementById("galleryImage");
imgElement.src = images[currentIndex];

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    imgElement.src = images[currentIndex];
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    imgElement.src = images[currentIndex];
}
