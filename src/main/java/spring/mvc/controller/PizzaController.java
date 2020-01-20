package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
	
	@RequestMapping("/ola/{nome}")
	public String Hello(@PathVariable String nome) {
		return "Olá" + nome;
	}
	
}
