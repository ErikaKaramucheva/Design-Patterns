package course_project;

public class TrainingMode {
	
	public void execute(ITrainingModeStrategy strategy, Instructor instructor) {
		strategy.execute();
		instructor.notifyTrainee();
	}

}
