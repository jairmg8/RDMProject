 const themeToggle = document.getElementById('theme-toggle');
        const themeIcon = document.getElementById('theme-icon');
        const htmlElement = document.documentElement;

        function toggleTheme() {
            const currentTheme = htmlElement.getAttribute('data-bs-theme');
            let newTheme;
            let newIcon;

            if (currentTheme === 'dark') {
                newTheme = 'light';
                newIcon = 'bi-moon-fill';
            } else {
                newTheme = 'dark';
                newIcon = 'bi-sun-fill';
            }

            htmlElement.setAttribute('data-bs-theme', newTheme);
            themeIcon.className = 'bi ' + newIcon;
            localStorage.setItem('theme', newTheme);
        }

        function initTheme() {
            const savedTheme = localStorage.getItem('theme') || 'light';
            htmlElement.setAttribute('data-bs-theme', savedTheme);

            if (savedTheme === 'dark') {
                themeIcon.className = 'bi bi-sun-fill';
            } else {
                themeIcon.className = 'bi bi-moon-fill';
            }
        }

        themeToggle.addEventListener('click', toggleTheme);
        initTheme();