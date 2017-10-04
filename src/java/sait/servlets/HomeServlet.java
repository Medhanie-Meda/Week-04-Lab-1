package sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.User;

public class HomeServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {   
        String url = "/WEB-INF/home.jsp";
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
         
        if(user == null)
        {
            //user = new User();
            response.sendRedirect("login");
            return;
        }
        else
        {
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
       
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       //getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }
}
