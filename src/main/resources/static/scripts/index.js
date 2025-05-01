const button = document.querySelector(".btn");

button.addEventListener("click",() => {
    if (button.innerHTML === "Clicked") {
        button.innerHTML = "Click Me";
    } else {
        button.innerHTML = "Clicked";
    }

});

