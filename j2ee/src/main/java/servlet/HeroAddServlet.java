package servlet;

import bean.Hero;
import dao.HeroDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author 海绵宝宝
 * @create 2020- 03- 06 22:55
 **/
public class HeroAddServlet extends HttpServlet {
    protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        Hero hero = new Hero();
        hero.setName(request.getParameter("name"));
        hero.setHp((Float.parseFloat(request.getParameter("hp"))));
        hero.setDamage(Integer.parseInt(request.getParameter("damage")));
        new HeroDAO().add(hero);
        response.sendRedirect("/listHero");

    }
}
