package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import service.ShohinService;

public class LoginController extends HttpServlet{

    HttpServletRequest request;
    HttpServletResponse response;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException,ServletException {
    					String name = request.getParamater("name");
    					String password = request.getParamater("pass");
    					System.out.println(name);
    					System.out.println(pass);
    						
    					

    }

}








