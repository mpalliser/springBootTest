package org.foobarspam.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mariano.palliser on 27/04/2017.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByPersId(String persId);

}
