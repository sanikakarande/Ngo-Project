document.addEventListener("DOMContentLoaded", function () {
    let dropdowns = document.querySelectorAll(".dropdown");

    dropdowns.forEach((dropdown) => {
        let timeout;

        dropdown.addEventListener("mouseenter", function () {
            clearTimeout(timeout);
            this.querySelector(".dropdown-menu").style.display = "block";
        });

        dropdown.addEventListener("mouseleave", function () {
            timeout = setTimeout(() => {
                this.querySelector(".dropdown-menu").style.display = "none";
            }, 300); // 300ms delay before closing
        });

        dropdown.querySelector(".dropdown-menu").addEventListener("mouseenter", function () {
            clearTimeout(timeout);
        });

        dropdown.querySelector(".dropdown-menu").addEventListener("mouseleave", function () {
            timeout = setTimeout(() => {
                dropdown.querySelector(".dropdown-menu").style.display = "none";
            }, 300);
        });
    });
});
