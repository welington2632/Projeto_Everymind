<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sign In</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="../css/sign_in.css" rel="stylesheet" type="text/css" />
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <script>
            alert("Login was a success!");
        </script>
        <div class="container" style="margin-top:40px">
            <div class="row">
                <div class="col-sm-6 col-md-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <c:if test="${User != null}">
                                <strong> Hello ${User.name}, you are logged in!</strong>
                            </c:if>
                        </div>
                        <div class="panel-body">
                                                        <input type="button" class="btn btn-lg btn-primary btn-block" value="Back to Login page" onclick="window.location.href='jsp/sign_in.jsp';">

                        </div>
                    </div>
                </div>
            </div>
    </body>
</html>