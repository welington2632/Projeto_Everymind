<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>User Area</title>
        <!-- Styles -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Desafio_Everymind/css/sign_in.css">
        <!-- Scripts -->
        <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
</head>
<body>
    <div class="container" style="margin-top:40px">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <c:if test="${loggedUser != null}">
                        <c:if test="${loggedUser.endereco == null}">
                            <div class="panel-heading">
                            <strong>${loggedUser.name} Você ainda não tem um endereço cadastrado, que tal cadastrá-lo agora?</strong>
                        </div>
                            <div class="panel-body">
                            <form role="form" name="formValidation" action="CadastraEndereco" method="POST" id="formValidation">
                                <fieldset>
                                    <!-- Logo -->
                                    <div class="row">
                                        <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                            <!-- Name -->
                                            <div class="form-group">
                                                <label for="name">Logradouro</label>
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-info-sign"></i>
                                                    </span> 
                                                    <input class="form-control" name="logradouro" type="text" id="name">
                                                </div>
                                            </div>
                                            <!-- E-mail -->
                                            <div class="form-group">
                                                <label for="email">CEP</label>
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-envelope"></i>
                                                    </span> 
                                                    <input class="form-control" name="cep" type="text" id="email" autofocus required>
                                                </div>
                                            </div>
                                            <!-- Username -->
                                            <div class="form-group">
                                                <label for="username">Número</label>
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-user"></i>
                                                    </span>
                                                    <input class="form-control alert-sucess" name="numero" type="text" id="username" autofocus required >
                                                </div>
                                            </div>
                                            <!-- Password -->
                                            <div class="form-group">
                                                <label for="password">Complemento</label>

                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-lock"></i>
                                                    </span>
                                                    <input class="form-control"  name="complemento" type="text" id="password" required >
                                                </div>
                                            </div>
                 
                                            <div class="form-group">
                                                 <input type="hidden" id="userId" name="userId" value="${loggedUser.id}">

                                                <input type="submit" id="submit" class="btn btn-lg btn-primary btn-block" onClick="return validar_form()" value="Cadastrar agora">
                                                
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                                <form role="form" name="userForm" action="logout" method="POST" id="formValidation">
                                <input type="submit" class="btn btn-lg btn-block btn-block" value="Voltar">
                            </form>
                        </div>
                        </c:if>
                        <c:if test="${loggedUser.endereco != null}">
                            <div class="panel-heading">
                            <strong> Hello ${loggedUser.name}, you are logged in!</strong>
                        </div>
                        <div class="panel-body">
                            <form role="form" name="userForm" action="logout" method="POST" id="formValidation">
                                <input type="submit" class="btn btn-lg btn-primary btn-block" value="Logout">
                            </form>
                        </div>
                        </c:if>
                    </c:if>
                    <c:if test="${loggedUser == null}">
                        <script>
                            alert("Please login to access this area.");
                            window.location.href = "sign_in.jsp";
                        </script>
                    </c:if>
                </div>
            </div>
        </div>
</body>
</html>
