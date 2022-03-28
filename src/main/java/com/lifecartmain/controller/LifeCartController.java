package com.lifecartmain.controller;

import java.net.http.HttpRequest;

import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lifecartmain.dao.UserRepo;
import com.lifecartmain.models.User;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.websocket.Session;

@Controller
public class LifeCartController {
	@Autowired
	UserRepo userRepo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/register")
	public String registerGet(@ModelAttribute("User") User user, Model model) {
		return "register";
	}
	@RequestMapping("/saveUser")
	public String registerPost(@ModelAttribute("User") User u){
		userRepo.save(u);
		return "redirect:login";
	}
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/loginService")
	public String login(String username, String password, HttpSession session) {
		int exists = userRepo.userExists(username, password);
		System.out.println(exists);
		String s="redirect:";
		if(exists == 1) {
			session.setAttribute("username", username);
			s+="/";
		}
		else {
			s+="/login";
		}
		return s;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.invalidate();
		return "redirect:/";
	}
}
