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
        <link rel="stylesheet" media="screen" href="css/datepicker.css">
        <link rel="stylesheet" media="screen" href="css/style.css">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/foundation.min.js"></script>
        <script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
        <title>AASA</title>
        <!--jquery-->
        <script type="text/javascript" charset="utf-8">
            $(document).ready(function() {
                $('.datepicker').datepicker();
            });
            $(document)
            .foundation('orbit', {
                bullets: false
            }, function(response){
                console.log(response.errors);
            });
        </script>
    </head>
    <body>
        <!--first row-->
        <div class ="row" style ="height: 200px"> 

            <!--logo-->
            <div class = "small-offset-1 medium-offset-1 large-offset-1 large-3 medium-3 small-3 columns">
                <img src ="img/logo.png" />
            </div>

            <div class = "large-5 medium-5 small-5 columns" id="header-title">
                <img src ="img/header.png" />
            </div>

            <!--login button-->
            <div class ="large-2 medium-2 small-2 columns" style="float:left;">
                <a href="#" data-dropdown="drop2" class="small secondary radius button dropdown">Login/Daftar</a>
                <ul id="drop2" class="f-dropdown content" width="100px" data-dropdown-content>
                    <label>Username :</label>
                    <input type="text" placeholder="username">
                    <label>Password :</label>
                    <input type="password" placeholder="password">
                    <a href="#" class="tiny button">Log in</a> <br />
                    <font size ="1">Belum punya akun? <br /><a href ="register.jsp"><u>Sok atuh daftar</u></a></font>
                </ul>
            </div>

        </div>

        <div class ="row collapse" style ="height: 50px">
            <div id ="search-property">
                <div class ="large-2 medium-2 small-2 small-offset-0 medium-offset-0 large-offset-6  columns">
                    <input type="text" placeholder="Search">
                </div>
                <div class ="large-1 medium-1 small-1 columns" style="float:left;">
                    <span class="postfix button" style="width:50px;"><img src ="img/magnifier.png" /></span>
                </div>
            </div>
        </div>

        <div class="row collapse">
            <div class="small-offset-1 medium-offset-1 large-offset-1 large-3 medium-3 small-3 columns">
                <form class="custom">
                    <fieldset id ="fieldset-custom">
                        <legend><font size ="4">Jadwal</font></legend>
                        <div class ="row">
                            <div class="large-1 medium-1 small-1 columns">
                                <label for="radio1">
                                    <input name="radio1" type="radio" id="radio1" CHECKED>
                                    <span class="custom radio checked"></span> Pulang pergi
                                </label>
                            </div>
                            <div class="large-1 medium-1 small-1 columns" style="padding-right: 50px;">
                                <label for="radio1">
                                    <input name="radio1" type="radio" id="radio1">
                                    <span class="custom radio"></span> Sekali jalan
                                </label>
                            </div>
                        </div>
                        <br />
                        <div class="row">
                            <input type="text" placeholder="Asal" /> 
                            <input type="text" placeholder="Tujuan" /> 
                            <input type="text" class="datepicker" placeholder="Tanggal Berangkat">
                            <input type="text" class="datepicker" placeholder="Tanggal Kembali">
                            <input type="text" placeholder="Mata Uang" /> 
                            <a href="schedule.jsp" class="tiny button" style="float : right">Cari</a> <br />
                        </div>

                    </fieldset>
                </form>
            </div>

            <div class="small-offset-1 medium-offset-1 large-offset-1 large-4 medium-4 small-4 columns" >
                <!--orbit view-->
                <div class="row collapse slideshow-wrapper" id = "orbit-custom">
                    <span class="preloader"></span>
                    <ul id="featured1" data-orbit data-options="pause_on_hover:false; timer_speed:2000; slide_number:true;">
                        <li>
                            <img src="img/1.png" />
                        </li>
                        <li>
                            <img src="img/2.png" />
                        </li>
                        <li>
                            <img src="img/3.png" />
                        </li>
                    </ul>
                </div>
                <div class ="row collapse">
                    <hr />
                </div>
                <div class ="row collapse">
                    <img src="img/kualalumpur1.jpg" />
                </div>    
                <br />
            </div>
            <hr />
        </div>

        <div class="row">
            <font color="white" style ="float:right;padding-right:20px;">&copy; 2013 Badut.Inc</font>
        </div>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
