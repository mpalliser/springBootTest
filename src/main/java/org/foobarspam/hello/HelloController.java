package org.foobarspam.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mariano.palliser on 25/04/2017.
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi(){
		return "<div>Hi</div>";
	}

}
