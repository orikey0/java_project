import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String name = request.getParameter("name");
        String password = request.getParameter("password");
 
        String html = null;
 
        if ("admin".equals(name) && "123".equals(password)){
            response.sendRedirect("listHero");
            return;

        }

        else
            html = "<div style='color:red'>fail</div>";
 
        PrintWriter pw = response.getWriter();
        pw.println(html);
 
    }
 
}