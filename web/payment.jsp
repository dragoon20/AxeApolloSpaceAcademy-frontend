<%-- 
    Document   : payment
    Created on : Oct 1, 2013, 9:54:21 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" media="screen" href="css/foundation.css">
        <link rel="stylesheet" media="screen" href="css/style.css">
        <script src="js/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <title>AASA-payment</title>
    </head>
    <body>
        <div class ="row"> 
            <!--logo-->
            <div class = "large-4 columns" id ="logopreview">
                <a href="index.jsp"><img src ="img/logo.png" /></a>
            </div>
        </div>

        <div class="row">
            <div class = "large-offset-3 large-4 columns">
                <table>
                    <thead>
                        <tr>
                            <th colspan="2" style="text-align: center;">Pilihan</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Harga berangkat</td> 
                            <td>12000</td> 
                        </tr>
                        <tr>
                            <th>Total</th> 
                            <th></th>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="row">
            <hr />
            <font color="white" style ="float:right;padding-right:20px;">&copy; 2013 Badut.Inc</font>
        </div>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
