<%-- 
    Document   : arithmeticcalculator.jsp
    Created on : Sep 24, 2020, 3:01:54 PM
    Author     : 839645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link rel="stylesheet" href="base-style.css"/>
    </head>
    <body>
        <div class="main-container">
            <h1>Arithmetic Calculator</h1>
            
            <form method="post" action="arithmetic">
                
                <label for="firstNumber">
                    First:  
                    <input id="age" name="firstNumber" value="${firstNumber}" />
                </label>
                
                <label for="age">
                    Second: 
                    <input id="age" name="secondNumber" value="${secondNumber}" />
                </label>
                
                 <input type="submit" name="operation" value="+" class="inline-button"/>
                 <input type="submit" name="operation" value="-" class="inline-button"/>
                 <input type="submit" name="operation" value="*" class="inline-button"/>
                 <input type="submit" name="operation" value="%" class="inline-button"/>
                 
                 
            </form>
                
                <div class="message">
                    Result: ${message}
                </div>
                <a href="AgeCalculatorServlet">
                    Age Calculator
                </a>
        </div>
    </body>
</html>
