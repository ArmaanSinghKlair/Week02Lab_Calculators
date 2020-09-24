<%-- 
    Document   : agecalculator.jsp
    Created on : Sep 24, 2020, 2:16:44 PM
    Author     : 839645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        <link rel="stylesheet" href="base-style.css"/>
    </head>
    <body>
        <div class="main-container">
            <h1>Age Calculator</h1>
            
            <form method="post" action="AgeCalculatorServlet">
                
                <label for="age">
                    Enter your age: 
                    <input id="age" name="age" value="${age}" />
                </label>
                
                 <input type="submit" value="Age next birthday"/>
            </form>
                
                <div class="message">
                    ${message}
                </div>
                <a href="arithmetic">
                    Arithmetic Calculator
                </a>
        </div>
    </body>
</html>
