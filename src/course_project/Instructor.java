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
			System.out.println( "�� ����������� "+instructorName+" � ������� ��� ��������- "+t.traineeName);
			
		}else{
			System.out.println( "�� ��������� �� ������� �� ������� ����� ��������- "+t.traineeName);
			
		}
	}
	
	public void removeTrainee(Trainee t) {
		if(trainees.remove(t)) {
			System.out.println( "�� ����������� "+instructorName+" � ��������� ��������- "+t.traineeName);
			
		}else{
			System.out.println( "�� ��������� �� ������� �� ��������� ��������- "+t.traineeName);
			
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
