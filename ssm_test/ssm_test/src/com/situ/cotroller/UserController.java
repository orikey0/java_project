package com.situ.cotroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.dao.ClassDao;
import com.situ.dao.UserDao;
import com.situ.entity.User;
import com.situ.utils.JsonInfo;
import com.situ.utils.SearchInfo;

@Controller
@RequestMapping("User")
public class UserController {
	
	@Autowired
	UserDao dao;
	
	@Autowired
	ClassDao cdao;
	//定义了一个dao对象，自动注入，找一找有没有这种语句,必须营造容器中获取

	@RequestMapping("index")
	public String index(@RequestParam(defaultValue="",value="txt") String t,SearchInfo info,ModelMap m) {
		if(t.length()>0)
			info.setWhere("where user.name like '%"+t+"%' ");
		m.put("list", dao.select(info));
		m.put("search", info);
		m.put("txt",t);
		return "User/index";
	}
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		dao.delete(id);
		return index("",new SearchInfo(),m);
	}
	@RequestMapping("insert")
	public @ResponseBody JsonInfo insert(User u,ModelMap m) {//string name= User u
		dao.insert(u);
		return new JsonInfo(1);
	}
	@RequestMapping("update")
	public @ResponseBody JsonInfo update(User u,ModelMap m) {//string name= User u
		dao.update(u);
		return new JsonInfo(1);
	}
	
	@RequestMapping("add")
	public String add(ModelMap m) {//string name= User u
		m.put("sexs",User.sexs);
		m.put("classlist",cdao.select());
		return "User/edit";
	}
	@RequestMapping("edit")
	public String edit(int id,ModelMap m) {//string name= User u
		m.put("info", dao.getById(id));
		return add(m);
	}
	
	@RequestMapping("login")
	public String login(User u,ModelMap m,HttpServletRequest req) {//string name= User u
		User user=dao.login(u);
		if(user==null&&u.getPass()!=null) {
			return "redirect:../login.html";
		}else {
			HttpSession s=req.getSession();
			s.setMaxInactiveInterval(10000);
			s.setAttribute("user", user);
			return "redirect:../index.jsp";
		}
	}
}
 