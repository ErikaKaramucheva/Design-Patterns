package course_project;

public class StrengthTrainingDecorator extends TrainingDecorator {
	private String exercise;

	public StrengthTrainingDecorator(ITrainingProgram program, String exercise) {
		super(program);
		this.exercise=exercise;
	}

	@Override
	public String Description() {
		return super.Description()+", "+exercise;
		//return "Силови упражнения";
	}




}
