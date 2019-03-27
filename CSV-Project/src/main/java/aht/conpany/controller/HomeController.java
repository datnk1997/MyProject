package aht.conpany.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aht.company.service.CSVService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private CSVService csv;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "upload" )
	public String uploadFile(@RequestParam("path") String path, Model model) {
		System.out.println("Helloooo");
		try {
			csv.readCSV(path);
			model.addAttribute("mess", "ok!");
		} catch (IOException e) {
			model.addAttribute("mess", "loi roi");
			e.printStackTrace();
		}
		return "home";

	}

}
