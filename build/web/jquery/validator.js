function validar_form() {
    var nome = userForm.name;
    var email = userForm.email;
    var birthday = userForm.birthday;
    var splitDate = birthday.split("/");
    var birthdayDate = new Date(splitDate[2], splitDate[1], splitDate[0]);
    var username = userForm.username;
    var password = userForm.password;
    var confirm_password = userForm.confirm_password;
    var today = new Date().toDateString();

    if (password.value != confirm_password.value) {
        alert("As senhas não são iguais.");
        userForm.password.focus();
        return false;
    } else {
        alert(birthdayDate);
        userForm.birthday.focus();
    }

}