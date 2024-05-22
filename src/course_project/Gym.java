package course_project;

import java.util.ArrayList;
import java.util.List;


public class Gym {

	private static Gym instance;
	private List<Instructor> instructors=new ArrayList<>();
	
	private Gym() {
		instructors= new ArrayList<>();
	}
	
	public static Gym getInstance() {
		if(instance==null) {
			instance=new Gym();
		}
		return instance;
		}
	
	public void addInstructor(Instructor instructor) {
		if(instructors.add(instructor)) {
			System.out.println( "Новият инструктор "+instructor.instructorName+" е добавен успешно!");
		}else {
			System.out.println( "За съжаление не успяхме да добавим новия инструктор "+instructor.instructorName+" ! Моля, опитайте отново!");
		}
		
	}
}
