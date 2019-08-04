/* global userForm */

function validar_form() {
    var password = userForm.password;
    var confirm_password = userForm.confirm_password;
    if (password.value != confirm_password.value) {
        alert("As senhas não são iguais.");
        userForm.password.focus();
        return false;
    }
}