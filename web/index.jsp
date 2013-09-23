<%-- 
    Document   : index
    Created on : Sep 19, 2013, 5:38:21 PM
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
        <title>AASA</title>
    </head>
    <body>

        <!--first row-->
        <div class ="row" style ="height: 200px"> 

            <!--logo-->
            <div class = "large-3 columns" id ="logopreview">
                <img src ="img/logo.png" />
            </div>

            <div class = "large-7 columns" id="header-title">
                    <h2><font color ="white" align ="center">Let Your Dream to Fly Come True !!</font></h2>
                <div class = "large-4 large-centered columns">
                    <a href="register.jsp" class="round button">Register</a>
                </div>
            </div>

            <!--login button-->
            <div class ="large-2 columns" id ="buttonlogin">
                <a href="#" data-dropdown="drop2" class="small secondary radius button dropdown">Login</a>
                <ul id="drop2" class="f-dropdown content" data-dropdown-content>
                    <label>Username :</label>
                    <input type="text" placeholder="username">
                    <label>Password :</label>
                    <input type="password" placeholder="password">
                    <a href="#" class="tiny button">Log in</a>
                </ul>

            </div>

        </div>

        <div class ="row" style ="height: 50px">
            <div id ="search-property">
                <div class ="large-2 large-offset-7 columns">
                    <input type="text" placeholder="Search">
                </div>
                <div class ="large-1 columns">
                    <a href="#" class="prefix button">Search</a>
                </div>
                <div class ="large-2 columns">
                    <p></p>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="large-7 columns">S

                <!--orbit view-->
                <div class="slideshow-wrapper" id = "orbit-custom" align="center">
                    <span class="preloader"></span>
                    <ul id="featured1" data-orbit data-options="pause_on_hover:false; timer_speed:2000; slide_number:true;">
                        <li>
                            <img src="img/3girls.jpg" />
                            <div class="orbit-caption">
                                Lorem ipsum dolor sit amet A
                            </div>
                        </li>
                        <li>
                            <img src="img/aurakasih.jpg" />
                            <div class="orbit-caption">
                                Lorem ipsum dolor sit amet B
                            </div>
                        </li>
                        <li>
                            <img src="img/neng.jpg" />
                            <div class="orbit-caption">
                                Lorem ipsum dolor sit amet C
                            </div>
                        </li>
                        <li>
                            <img src="img/fans.jpg" />
                            <div class="orbit-caption">
                                Lorem ipsum dolor sit amet D
                            </div>
                        </li>
                    </ul>
                </div>

            </div>

            <hr />
        </div>

        <script>
            $(document).foundation();
        </script>
    </body>
</html>
