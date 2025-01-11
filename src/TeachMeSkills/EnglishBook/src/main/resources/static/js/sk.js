function showRegistration() {
    document.getElementById('loginForm').style.display = 'none';
    document.getElementById('registrationForm').style.display = 'block';
}

function showLogin() {
    document.getElementById('registrationForm').style.display = 'none';
    document.getElementById('loginForm').style.display = 'block';
}
const formContainer = document.querySelector('.form-container')
const closeIcon = document.querySelector('.close-icon');
const navBtn = document.querySelector('.navbar-btn');

navBtn.addEventListener('click', ()=>{
    formContainer.classList.add('active-popup');
});
closeIcon.addEventListener('click', ()=> {
    formContainer.classList.remove('active-popup');
});



