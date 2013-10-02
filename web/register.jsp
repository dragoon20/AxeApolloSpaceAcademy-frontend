<%-- 
    Document   : register
    Created on : Sep 22, 2013, 11:30:21 PM
    Author     : Vincentius Martin
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
        <title>AASA-register</title>
    </head>
    <body>
        <div class ="row" style ="height: 200px"> 

            <!--logo-->
            <div class = "large-3 columns" id ="logopreview">
                <img src ="img/logo.png" />
            </div>
        </div>

        <div class ="row" style="height: 400px; padding-top: 20px;" >
            <div class="large-7 columns" style="background-color: lightgray">
                <form class="custom">
                    <div style="padding-top: 20px">
                        <h3>Member Registration Form</h3>
                        <input type="text" placeholder="Email" />
                        <input type="password" placeholder="Sandi" />
                        <input type="password" placeholder="Konfirmasi Sandi" />
                        <input type="text" placeholder="Nama Lengkap" />
                        <input type="text" placeholder="No Telephone" />
                        <input type="text" placeholder="Alamat" style="height:10%" />
                        <a href="emailverification.jsp" class="tiny round button">Submit</a>
                    </div>
                </form>
            </div>
        </div>
        <div class="row">
            <br />
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
