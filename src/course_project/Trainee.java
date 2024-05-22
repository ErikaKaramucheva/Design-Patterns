package course_project;

public class Trainee implements IObserver{
	String traineeName;
	ITrainingProgram program;
	//ITrainingModeStrategy strategy;
	

	public Trainee(String traineeName) {
		super();
		this.traineeName = traineeName;
	}
	
	public void updateTrainee() {
		System.out.println(traineeName + " � ��������/� � ��������� � ������������� �����.");   
	}
	
	/*public void updateTrainee(ITrainingModeStrategy strategy) {
		System.out.println(traineeName + " � ��������/� � ��������� � ������������� �����.");   
		this.strategy=strategy;
	}*/
	
	public void setTrainingProgram(ITrainingProgram program) {
        this.program = program;
        System.out.println(traineeName + " ��� ���� ������������ ��������- "+program.Description());
    }
	
	public void getTrainingProgram() {
		System.out.println(traineeName+" ��� �������� ��������: "+program.Description());
	}
	
}
