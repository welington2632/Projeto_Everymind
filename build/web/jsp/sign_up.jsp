<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sign Up</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="/Desafio_Everymind/css/sign_in.css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
<body>
    <div class="container" style="margin-top:40px">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <strong> Sign Up</strong>
                    </div>
                    <div class="panel-body">
                        <form role="form" name="userForm" action="../createUser" method="POST" id="formValidation">
                            <fieldset>
                                <!-- Logo -->
                                <div class="row">
                                    <div class="center-block">
                                        <img class="profile-img"
                                             src="data:image/png;base64,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" alt="">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                        <!-- Name -->
                                        <div class="form-group">
                                            <label for="name">Full Name</label>
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-info-sign"></i>
                                                </span> 
                                                <input class="form-control" name="name" type="text" id="name" autofocus required>
                                            </div>
                                        </div>
                                        <!-- E-mail -->
                                        <div class="form-group">
                                            <label for="email">E-mail</label>
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-envelope"></i>
                                                </span> 
                                                <input class="form-control" name="email" type="email" id="email" autofocus required>
                                            </div>
                                        </div>
                                        <!-- Username -->
                                        <div class="form-group">
                                            <label for="username">Username</label>
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-user"></i>
                                                </span>
                                                <input class="form-control alert-sucess" name="username" type="text" id="usuername" autofocus required>
                                            </div>
                                        </div>
                                        <!-- Password -->
                                        <div class="form-group">
                                            <label for="password">Password</label>

                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-lock"></i>
                                                </span>
                                                <input class="form-control"  name="password" type="password" id="password" value="" required>
                                            </div>
                                        </div>
                                        <!-- Confirm Password -->
                                        <div class="form-group">
                                            <label for="confirmpassword">Confirm Password</label>
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-lock"></i>
                                                </span>
                                                <input class="form-control"  name="confirm_password" type="password" id="confirm_password" value="" required>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" id="submit" class="btn btn-lg btn-primary btn-block" onClick="return validar_form()" value="Sign up">
                                        </div>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                    <div class="panel-footer ">
                        Have an account!
                        <a href="sign_in.jsp"> Sign In Here </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
