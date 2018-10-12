package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Multiplication {

	@RequestMapping(value="/mul")
	public static ModelAndView doMultiplication(HttpServletRequest request , HttpServletResponse response) {
		
		int num1 = Integer.parseInt(request.getParameter("t1"));
		int num2 = Integer.parseInt(request.getParameter("t2"));
		
		int Result = num1*num2;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("MultiplicationResult", Result);
		mv.setViewName("display.jsp");
		
		return mv;
		
	}

}
