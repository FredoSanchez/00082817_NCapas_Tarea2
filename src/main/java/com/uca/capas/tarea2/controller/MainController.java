package com.uca.capas.tarea2.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

//import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		String texto = "Nombre: Fredy Alexander Sánchez Pérez  Carnet: 00082817  Carrera: Ingenieria informática  Año: 4";
		return texto;		
	}
	
	@RequestMapping("/fecha")
	public @ResponseBody String fecha(HttpServletRequest request) {
		int day		=	Integer.parseInt(request.getParameter("day")), 
			month	=	Integer.parseInt(request.getParameter("month")), 
			year	=	Integer.parseInt(request.getParameter("year"));
		String dia;

	    Calendar c = Calendar.getInstance();
	    c.set(year, month - 1, day, 0, 0);
	    
	    
	    int dayOfTheWeek = c.get(Calendar.DAY_OF_WEEK);
	    
		switch (dayOfTheWeek) {
			case 1: 
				dia="Domingo";
				break;
			case 2: 
				dia="Lunes";
				break;
			case 3: 
				dia="Martes";
				break;
			case 4: 
				dia="Miercoles";
				break;
			case 5: 
				dia="Jueves";
				break;
			case 6: 
				dia="Viernes";
				break;
			case 7: 
				dia="Sabado";
				break;
			default: 
				dia = "IMPOSIBLE!";	    
		}
		
		return "Dia de la semana: " + dia;

	}
}
