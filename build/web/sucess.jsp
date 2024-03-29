<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sucess</title>
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
                        <div class="panel-heading">
                            <strong> 
                                ${User.name}, Successfully registered!</strong>
                            <script>
                                alert("Successfully registered, ${User.name} you can now login!");
                            </script>
                        </div>
                        <div class="panel-body">
                            <input type="button" class="btn btn-lg btn-primary btn-block" value="Go to sign in!" onclick="window.location.href = 'sign_in.jsp';">
                        </div>
                    </div>
                </div>
                </body>
                </html>
