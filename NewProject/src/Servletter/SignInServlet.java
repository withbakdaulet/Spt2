package Servletter;

import Classes.DB;
import Classes.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/signIn")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        boolean existUser = DB.checkUser(email,password);
        Users currentUser = DB.getUser(email);

        HttpSession session = req.getSession();
        session.setAttribute("current",currentUser);
        if(existUser){
            resp.sendRedirect("/profile.jsp");
        }else {
            resp.sendRedirect("/error");
        }
    }
}
