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
public class AgeCalculatorServlet extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="/WEB-INF/agecalculator.jsp";
        
        String userAge = request.getParameter("age");
        
            
        if(userAge == null || userAge.trim().equals("")){
            request.setAttribute("message","You must give your current age.");
     
        } else if(!userAge.matches("[0-9]+")){
            request.setAttribute("message","You must enter a number.");
            
        } else {
            request.setAttribute("message","Your age next birthday will be "+(Integer.parseInt(userAge.trim())+1)+".");
        }
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);

       
    }

  
  

}
