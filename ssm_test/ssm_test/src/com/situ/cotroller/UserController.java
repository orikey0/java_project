package com.situ.cotroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.dao.ClassDao;
import com.situ.dao.UserDao;
import com.situ.entity.User;

@Controller
@RequestMapping("User")
public class UserController {
	
	@Autowired
	UserDao dao;
	//定义了一个dao对象，自动注入，找一找有没有这种语句,必须营造容器中获取
	@Autowired
	ClassDao cdao;

	@RequestMapping("index")
	public String index(ModelMap m) {
		m.put("list", dao.select());		
		return "User/index";
	}
	
	
	
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		dao.delete(id);
		return index(m);
	}
	@RequestMapping("insert")
	public String insert(User u,ModelMap m) {//string name= User u
		dao.insert(u);
		return index(m);
	}
	
	@RequestMapping("update")
	public String update(User u,ModelMap m) {//string name= User u
		dao.update(u);
		return index(m);
	}
	
	@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("sexs", User.sexs);
		m.put("classlist", cdao.select());
		return "User/edit";
	}
	
	@RequestMapping("edit")//获取界面
	public String edit(int id,ModelMap m) {//string name= User u
		m.put("info", dao.getById(id));
		
		return add(m);
	}
//	@RequestMapping("login")
//	public String login(int id,ModelMap m,HttpServletRequest req) {
//		User user=dao.login(u);
//		if (user==null&&u.getPass!=NULL) {
//			return "redirect:login.html";
//		}
//		else {
//			HttpSession s=req,getsSession();
//			s.setMaxInactiveInterval(10);
//			s.setAttribute("user", user);
//			return "redirect:../index.jsp";
//		}
//	}
}
 