package course_project;

public class FitnessMain {

	public static void main(String[] args) {
		Gym gym=Gym.getInstance();
		
		Instructor instructor1= new Instructor("Иван");
		Instructor instructor2= new Instructor("Мария");
		gym.addInstructor(instructor1);
		gym.addInstructor(instructor2);
		
		Trainee t1=new Trainee("Асен");
		Trainee t2=new Trainee("Анна");
		Trainee t3=new Trainee("Гергана");
		instructor1.addTrainee(t1);
		instructor2.addTrainee(t2);
		instructor2.addTrainee(t3);
		instructor2.removeTrainee(t3);
		
		
		TrainingMode mode=new TrainingMode();
		
		mode.execute(new FatLossStrategy(), instructor1);
		ITrainingProgram cardioDecorator=new BasicTrainingProgram();		
		ITrainingProgram cardioProgram1 = new CardioTrainingDecorator(cardioDecorator,"клек");
        t1.setTrainingProgram(cardioProgram1);
        mode.execute(new MuscleGainStrategy(), instructor1);
		ITrainingProgram strengthDecorator=new BasicTrainingProgram();	
        ITrainingProgram strengthProgram1 = new StrengthTrainingDecorator(strengthDecorator,"лицеви опори");
        t1.setTrainingProgram(strengthProgram1);
        
        System.out.println("--------Instructor 2--------");
        
		mode.execute(new FatLossStrategy(), instructor2);
        ITrainingProgram cardioProgram2 = new CardioTrainingDecorator(cardioDecorator,"бърпи");
		t2.setTrainingProgram(cardioProgram2);
		
		System.out.println();
		t1.getTrainingProgram();
		
		
	}

}
