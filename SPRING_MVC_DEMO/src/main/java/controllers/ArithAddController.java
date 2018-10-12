package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArithAddController {

	@RequestMapping(value="/add")
	public ModelAndView arithAdd(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("I am doing arith addition of two numbers");
		
		int num1 = Integer.parseInt(request.getParameter("t1"));
		int num2 = Integer.parseInt(request.getParameter("t2"));
		int arithAdd = num1+num2;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("arithAddResult", arithAdd);
		mv.setViewName("display.jsp");
		
		return mv;
		
	}
}
