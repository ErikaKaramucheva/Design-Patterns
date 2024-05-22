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
		System.out.println(traineeName + " е запознат/а с промяната в тренировъчния режим.");   
	}
	
	/*public void updateTrainee(ITrainingModeStrategy strategy) {
		System.out.println(traineeName + " е запознат/а с промяната в тренировъчния режим.");   
		this.strategy=strategy;
	}*/
	
	public void setTrainingProgram(ITrainingProgram program) {
        this.program = program;
        System.out.println(traineeName + " има нова тренировъчна програма- "+program.Description());
    }
	
	public void getTrainingProgram() {
		System.out.println(traineeName+" има следната програма: "+program.Description());
	}
	
}
