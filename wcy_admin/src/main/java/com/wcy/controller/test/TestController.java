package com.wcy.controller.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wcy.service.test.TestService;
import com.wcy.test.Test;

@Controller
public class TestController {
	@Autowired//spring自身提供的，默认只根据类型注入
//	@Resource  //apache提供的注解，默认根据名称注入，名称找不到时，再根据type进行注入
	private TestService testServie;
	@RequestMapping("getlist")
	public String getlist(HttpServletRequest request){
		List<Test> listlist=testServie.getlist();
		request.setAttribute("listlist", listlist);
		return "list";
	}
} 
