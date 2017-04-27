package org.foobarspam.course;

import org.foobarspam.person.Pers;
import org.foobarspam.person.PersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mariano.palliser on 27/04/2017.
 */
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/person/{id}/courses")
	public List<Course> getallCourses(@PathVariable String id) {
		return courseService.getallCourses(id);
	}

	@RequestMapping("/person/{persId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/person/{persId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String persId) {
		course.setPers(new Pers(persId, "", ""));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/person/{persId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String persId) {
		course.setPers(new Pers(persId, "", ""));
		courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/person/{persId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

}

