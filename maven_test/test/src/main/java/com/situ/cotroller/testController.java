package com.situ.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@RequestMapping("index")
	public String index(ModelMap m) {
		m.put("list", new String[] {"QAAAAA","GGGGGGGG"});
		return "index";
	}
}
