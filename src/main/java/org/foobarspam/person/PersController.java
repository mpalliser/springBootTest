package org.foobarspam.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mariano.palliser on 25/04/2017.
 */
@RestController
public class PersController {

	@Autowired
	private PersService persService;

	@RequestMapping("/person")
	public List<Pers> getAllTopics() {
		return persService.getAllPers();
	}

	@RequestMapping("/person/{id}")
	public Pers getPers(@PathVariable String id) {
		return persService.getPers(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/person")
	public void addPers(@RequestBody Pers pers) {
		persService.addPers(pers);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/person/{id}")
	public void updatePers(@RequestBody Pers pers, @PathVariable String id) {
		persService.updatePers(id, pers);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/person/{id}")
	public void deletePers(@PathVariable String id) {
		persService.deletePers(id);
	}

}
