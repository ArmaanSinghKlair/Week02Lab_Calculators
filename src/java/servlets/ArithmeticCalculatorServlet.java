/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 839645
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message",this.getServletConfig().getInitParameter("initialValue"));
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/WEB-INF/arithmeticcalculator.jsp";
        
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        String action = request.getParameter("operation");
        
        String message="";
        
        if(firstNumber == null || secondNumber == null || firstNumber.trim().equals("") || secondNumber.trim().equals("") || !firstNumber.matches("[0-9]+") || !secondNumber.matches("[0-9]+")){
            message = "Invalid";
        } else{
            switch(action){
                case "+":
                    message = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)+"";
                    break;
                case "-":
                    message = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber)+"";
                    break;
                case "*":
                    message = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber)+"";
                    break;
                case "%":
                    message = Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber)+"";
                    break;
            }
            
            
        }
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("secondNumber",secondNumber);
        request.setAttribute("message",message);
        this.getServletContext().getRequestDispatcher(url).forward(request,response);
        
    }

  
}
