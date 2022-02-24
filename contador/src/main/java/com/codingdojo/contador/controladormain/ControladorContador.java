package com.codingdojo.contador.controladormain;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorContador {
	
	@RequestMapping("/your_server")
	public String yourServer(HttpSession session) {
		
		
		if(session.getAttribute("count") == null) {
			//inicializamos el contador 
			int contador=0;
			//creamos contador en la session 
			session.setAttribute("count",contador);
			System.out.println(session.getAttribute("count"));
		}
		else {
			//obtenemos el valor del contador 
			Integer conteo = (Integer) session.getAttribute("count");
			//actualizamos en 1 el valor del contador 
			conteo+=1;
			//actualizamos el valor del contador 
			session.setAttribute("count", conteo);
			System.out.println(session.getAttribute("count"));
		}
		return "index.jsp";
	}
	
	
	
	@RequestMapping("/your_server_dos")
	public String yourServer2(HttpSession session) {
		
		
		if(session.getAttribute("count2") == null) {
			//inicializamos el contador 
			int contador1=0;
			//creamos contador en la session 
			session.setAttribute("count2",contador1);
			System.out.println(session.getAttribute("count2"));
		}
		else {
			//obtenemos el valor del contador 
			Integer conteo1 = (Integer) session.getAttribute("count2");
			//actualizamos en 1 el valor del contador 
			conteo1+=2;
			//actualizamos el valor del contador 
			session.setAttribute("count2", conteo1);
			System.out.println(session.getAttribute("count2"));
		}
		return "counter2.jsp";
	}
	
	@RequestMapping("/your_server/counter")
	public String showcounter(HttpSession session, Model model) {
		
		Integer visitas=(Integer) session.getAttribute("count");
		model.addAttribute("contadorDeVisitas", visitas);
		
		Integer visitas2=(Integer) session.getAttribute("count2");
		model.addAttribute("contadorDeVisitas2", visitas2);
		
		return "counter.jsp";
	}
	@RequestMapping("/delete")
	public String delete(HttpSession session,Model model) {
		Integer conteo =(Integer) session.getAttribute("count");
		conteo=0;
		session.setAttribute("count",conteo);
		Integer visitas=(Integer) session.getAttribute("count");
		model.addAttribute("contadorDeVisitas", visitas);
		return "counter.jsp";
	}
	@RequestMapping("/delete1")
	public String delete1(HttpSession session,Model model) {
		Integer conteo1 =(Integer) session.getAttribute("count2");
		conteo1=0;
		session.setAttribute("count2",conteo1);
		Integer visitas2=(Integer) session.getAttribute("count2");
		model.addAttribute("contadorDeVisitas2", visitas2);
		return "counter.jsp";
	}
}
