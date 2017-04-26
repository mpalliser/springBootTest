package org.foobarspam.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mariano.palliser on 25/04/2017.
 */
@Service
public class PersRealService {

	private List<Pers> persList = new ArrayList<>(Arrays.asList(
			new Pers("1", "Mario", "description"),
			new Pers("2", "Juan", "description"),
			new Pers("3", "Laura", "description"),
			new Pers("4", "Marta", "description"),
			new Pers("5", "Mar", "description")
			));

	public List<Pers> getAllPers() {
		return persList;
	}

	public Pers getPers(String name) {
		return persList.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public void addPers(Pers pers) {
		persList.add(pers);
	}

	public void updatePers(String name, Pers pers) {

		for(int i = 0; i < persList.size(); i++) {
			Pers p = persList.get(i);
			if(p.getName().equals(name)){
				persList.set(i, pers);
				return;
			}
		}

	}

	public void deletePers(String name) {
		persList.removeIf(t -> t.getName().equals(name));
	}
}
