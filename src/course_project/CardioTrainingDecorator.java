package course_project;


public class CardioTrainingDecorator extends TrainingDecorator {
	
	private String exercise;

	public CardioTrainingDecorator(ITrainingProgram program, String exercise) {
		super(program);
		this.exercise=exercise;
	}

	@Override
	public String Description() {
		return super.Description()+", "+exercise;
	}


	


	

}
