document.addEventListener("DOMContentLoaded", function() {
    var links = document.querySelectorAll(".form-header a");
    links.forEach(function(link) {
        link.addEventListener("click", function() {
            if (!link.classList.contains("active")) {
                links.forEach(function(item) {
                    item.classList.remove("active");
                });
                link.classList.add("active");
            }
        });
    });
});