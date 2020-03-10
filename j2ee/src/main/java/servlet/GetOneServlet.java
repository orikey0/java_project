package servlet;

import bean.Hero;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

/**
 * @author 海绵宝宝
 * @create 2020- 03- 07 15:56
 **/
public class GetOneServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse res
    ) throws IOException {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setHp(353);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hero", JSONObject.fromObject(hero));
        res.setContentType("text/html;charset=utf-8");
        res.getWriter().print(jsonObject);


    }
}
