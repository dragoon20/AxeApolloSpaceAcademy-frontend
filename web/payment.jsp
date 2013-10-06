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
                <div id="paymentprocess">
                    <table>
                        <thead>
                            <tr>
                                <th colspan="2" style="text-align: center;">Pilihan</th> 
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="width:90%;">Harga berangkat</td> 
                                <td>12000</td> 
                            </tr>
                            <tr>
                                <th style="float : left;">Total</th> 
                                <th></th>
                            </tr>
                        </tbody>
                    </table>

                    <div class="section-container auto" data-section>
                        <section class="active">
                            <p class="title" data-section-title><a href="#panel1">Credit Card</a></p>
                            <div class="content" data-section-content>
                                <div class="row">
                                    <div class ="large-4 columns">
                                        <font>Tipe Kartu</font>
                                    </div>
                                    <div class ="large-3 columns"  style="float:left;">
                                        <select>
                                            <option>Visa</option>
                                            <option>Credit</option>
                                        </select>
                                    </div>
                                </div>
                                <input type="text" class="text" placeholder="Card Number" />
                                <input type="text" class="text" placeholder="Holder's Name" />
                                <input type="text" class="text" placeholder="Expired date" />
                                <input type="text" class="text" placeholder="CID" />
                                <input type="text" class="text" placeholder="Card Publisher" />
                                <input type="text" class="text" placeholder="Card's Country" />

                                <font style="font-family: Times New Roman;">
                                    Note : Expired or not registered card will not be processed.
                                </font>
                            </div>
                        </section>
                    </div>
                    
                    <a href="#" class="tiny button" style="float:right;"> Payment</a> <br />
                </div>
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
