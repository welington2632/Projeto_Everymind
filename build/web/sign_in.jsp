<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sign In</title>
        <!-- Styles -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Desafio_Everymind/css/sign_in.css">
        <!-- Scripts -->
        <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <c:if test="${loggedUser == null}">
            <div class="container" style="margin-top:40px">
                <div class="row">
                    <div class="col-sm-6 col-md-4 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <strong> Sign in to continue</strong>
                            </div>
                            <div class="panel-body">
                                <form role="form" action="signIn" method="POST">
                                    <fieldset>
                                        <div class="row">
                                        <div class="row">
                                            <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                                <!-- Username -->
                                                <div class="form-group">
                                                    <label>Username</label>
                                                    <div class="input-group">
                                                        <span class="input-group-addon">
                                                            <i class="glyphicon glyphicon-user"></i>
                                                        </span> 
                                                        <input class="form-control" name="username" type="text" autofocus required>
                                                    </div>
                                                </div>
                                                <!-- Password -->
                                                <div class="form-group">
                                                    <label>Password</label>
                                                    <div class="input-group">
                                                        <span class="input-group-addon">
                                                            <i class="glyphicon glyphicon-lock"></i>
                                                        </span>
                                                        <input class="form-control" name="password" type="password" value="" required>
                                                    </div>
                                                </div>
                                                <c:if test="${messageError != null}">
                                                    <div><span>${messageError}</span></div>
                                                </c:if>
                                                <div class="form-group">
                                                    <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in">
                                                </div>
                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                            <div class="panel-footer ">
                                Don't have an account! <a href="sign_up.jsp"> Sign Up Here </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:if>
        <c:if test="${loggedUser != null}">
            <script>
                window.location.href = "userArea.jsp";
            </script>
        </c:if>
    </body>
</html>