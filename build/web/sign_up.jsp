<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sign Up</title>
        <!-- Styles -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Desafio_Everymind/css/sign_in.css">
        <!-- Scripts -->
        <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body
        <div class="container" style="margin-top:40px">
            <div class="row">
                <div class="col-sm-6 col-md-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong> Sign Up</strong>
                        </div>
                        <div class="panel-body">
                            <form role="form" name="formValidation" action="createUser" method="POST" id="formValidation">
                                <fieldset>
                                    <!-- Logo -->
                                    <div class="row">
                                        <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                            <!-- Name -->
                                            <div class="form-group">
                                                <label for="name">Full Name</label>
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-info-sign"></i>
                                                    </span> 
                                                    <input class="form-control" name="name" type="text" id="name" pattern="^[A-Za-z -]+$" title="Name only accepts text" required minlength="5" maxlength="100">
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
                                                    <input class="form-control alert-sucess" name="username" type="text" id="username" autofocus required pattern="^[a-z0-9_-]{3,15}$" title="Use only lowercase letters and numbers. Number of characters, minimum 3 and max 15">
                                                </div>
                                            </div>
                                            <!-- Password -->
                                            <div class="form-group">
                                                <label for="password">Password</label>

                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-lock"></i>
                                                    </span>
                                                    <input class="form-control"  name="password" type="password" id="password" required pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\S+$).{6,20}$" title="Use lowercase and uppercase letters, numbers, and special characters. Number of characters, minimum 6 and max 20">
                                                </div>
                                            </div>
                                            <!-- Confirm Password -->
                                            <div class="form-group">
                                                <label for="confirmpassword">Confirm Password</label>
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-lock"></i>
                                                    </span>
                                                    <input class="form-control"  name="confirm_password" type="password" id="confirm_password" required pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\S+$).{6,20}$" title="Use lowercase and uppercase letters, numbers, and special characters. Number of characters, minimum 6 and max 20">
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
