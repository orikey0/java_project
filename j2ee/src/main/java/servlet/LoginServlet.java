package servlet;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 海绵宝宝
 * @create 2020- 03- 10 22:52
 **/
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID =1L;
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String password =request.getParameter("password");
        if ("admin".equals(name)&&"123".equals(password)){
            request.getSession().setAttribute("userName", name);
            response.sendRedirect("listHero");
        }
        else {
            response.sendRedirect("login.html");
        }
    }
}
