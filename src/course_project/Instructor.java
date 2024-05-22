package course_project;

import java.util.ArrayList;
import java.util.List;

public class Instructor  implements IObservable{
	protected String instructorName;
	protected List<Trainee> trainees;
	
	public Instructor(String name) {
		this.instructorName=name;
		this.trainees=new ArrayList<>();
	}

	public void addTrainee(Trainee t) {
		if(trainees.add(t)) {
			System.out.println( "За инструктора "+instructorName+" е добавен нов трениращ- "+t.traineeName);
			
		}else{
			System.out.println( "За съжаление не успяхме да добавим новия трениращ- "+t.traineeName);
			
		}
	}
	
	public void removeTrainee(Trainee t) {
		if(trainees.remove(t)) {
			System.out.println( "За инструктора "+instructorName+" е премахнат трениращ- "+t.traineeName);
			
		}else{
			System.out.println( "За съжаление не успяхме да премахнем трениращ- "+t.traineeName);
			
		}
	}
	
	public void notifyTrainee() {
		for(Trainee trainee:trainees) {
			trainee.updateTrainee();
		}
	}
	
	/*public void notifyTrainee(Trainee trainee) {
			trainee.updateTrainee();
		}*/
	
	
	
	
	

}
