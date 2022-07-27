package co.grandcircus.DonutAPILab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.DonutAPILab.models.Donut;
import co.grandcircus.DonutAPILab.service.DonutApiService;

@Controller
public class DonutController {

	@Autowired
	private DonutApiService donutService;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		List<Donut> donuts = donutService.getDonuts();
		model.addAttribute("donuts", donuts);
		
		return "index";
	}
	
	@RequestMapping("/donut")
	public String donutInfo(Model model, @RequestParam int id) {
		Donut donut = donutService.getDonut(id);
		model.addAttribute("donut", donut);
		model.addAttribute("extrasLength", donut.getExtras().length);
		
		return "donut-info";
	}
	
}
