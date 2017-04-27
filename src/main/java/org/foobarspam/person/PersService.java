package org.foobarspam.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mariano.palliser on 25/04/2017.
 */
@Service
public class PersService {

	@Autowired
	private PersRepository personRepository;

	public List<Pers> getAllPers() {

		List<Pers> persList = new ArrayList<>();
		personRepository.findAll().forEach(persList::add);
		return persList;

	}

	public Pers getPers(String id) {
		return personRepository.findOne(id);
	}

	public void addPers(Pers pers) {
		personRepository.save(pers);
	}

	public void updatePers(String id, Pers pers) {
		personRepository.save(pers);
	}

	public void deletePers(String id) {
		personRepository.delete(id);
	}
}
