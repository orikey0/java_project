package servlet;

import bean.Hero;
import dao.HeroDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author 海绵宝宝
 * @create 2020- 03- 06 23:21
 **/
public class HeroEditServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        servlet实现
//        request.setCharacterEncoding("UTF-8");
//        int id = Integer.parseInt(request.getParameter("id"));
//        Hero hero = new HeroDAO().get(id);
//        StringBuffer format = new StringBuffer();
//        response.setContentType("text/html; charset=UTF-8");
//        format.append("<!DOCTYPE html>");
//        format.append("<form action='updateHero' method='post'>");
//        format.append("名字 ： <input type='text' name='name' value='%s' > <br>");
//        format.append("血量 ： <input type='text' name='hp'  value='%f' > <br>");
//        format.append("伤害： <input type='text' name='damage'  value='%d' > <br>");
//        format.append("<input type='hidden' name='id' value='%d'>");
//        format.append("<input type='submit' value='更新'>");
//        format.append("</form>");
//        String html = String.format(format.toString(), hero.getName(), hero.getHp(), hero.getDamage(), hero.getId());
//
//        response.getWriter().write(html);
        int id = Integer.parseInt(request.getParameter("id"));
        Hero hero = new HeroDAO().get(id);
        request.setAttribute("hero", hero);
        request.getRequestDispatcher("editHero.jsp").forward(request, response);

    }
}
