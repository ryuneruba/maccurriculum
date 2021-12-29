package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EnrollService;

//import service.ShohinService;

public class EnrollController extends HttpServlet{

    HttpServletRequest request;
    HttpServletResponse response;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException,ServletException {

        request.setCharacterEncoding("utf-8");
        try {
          String username = request.getParameter("username");
          String password = request.getParameter("password");
           EnrollService EnrollService = new EnrollService();
           EnrollService.search(username, password);

//           request.setAttribute("login", UserService.pullUserInfo(id,password));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ServletContext context = this.getServletContext();
            RequestDispatcher dispatcher = context.getRequestDispatcher("/login.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            } catch (IOException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
        }
    }

}

