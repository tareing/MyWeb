        var rotateContainer = document.querySelector('.circle-container');

        function stopRotate() {
            rotateContainer.style.animationPlayState = 'paused';
        }

        function startRotate() {
            rotateContainer.style.animationPlayState = 'running';
        }