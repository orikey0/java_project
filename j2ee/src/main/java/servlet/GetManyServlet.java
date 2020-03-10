package servlet;

import bean.Hero;
import com.sun.deploy.net.HttpRequest;
import net.sf.json.JSONSerializer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 海绵宝宝
 * @create 2020- 03- 07 16:21
 **/
public class GetManyServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Hero>heroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero hero = new Hero();
            hero.setName("name"+i);
            hero.setHp(500+i);
            heroes.add(hero);
        }
        String result = JSONSerializer.toJSON(heroes).toString();
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(result);
    }
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero hero = new Hero();
            hero.setName("name"+i);
            hero.setHp(500+i);
            heros.add(hero);
        }

        System.out.println(JSONSerializer.toJSON(heros).toString());
    }
}
