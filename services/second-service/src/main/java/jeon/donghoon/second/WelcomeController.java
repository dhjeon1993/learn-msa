package jeon.donghoon.second;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/second-service")
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the Second service.";
	}

	@GetMapping("/message")
	public String message(@RequestHeader("second-request") String header) {
		log.info("second-request: {}", header);
		return "Hello World in First Service.";
	}

	@GetMapping("/check")
	public String check() {
		return "Hi, there. This is a message from Second Service.";
	}

}
