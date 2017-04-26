package org.foobarspam.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mariano.palliser on 25/04/2017.
 */
@RestController
public class PersController {

	@Autowired
	private PersRealService persService;

	@RequestMapping("/pers")
	public List<Pers> getAllTopics() {
		return persService.getAllPers();
	}

	@RequestMapping("/pers/{name}")
	public Pers getPers(@PathVariable String name) {
		return persService.getPers(name);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/pers")
	public void addPers(@RequestBody Pers pers) {
		persService.addPers(pers);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/pers/{name}")
	public void updatePers(@RequestBody Pers pers, @PathVariable String name) {
		persService.updatePers(name, pers);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/pers/{name}")
	public void deletePers(@PathVariable String name) {
		persService.deletePers(name);
	}

}
