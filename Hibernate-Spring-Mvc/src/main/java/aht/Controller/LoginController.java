package aht.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);
	@RequestMapping("/dang-nhap")
	public String login(@RequestParam("error") String error) {	
		logger.error(error);
		return "login";
	}
}
