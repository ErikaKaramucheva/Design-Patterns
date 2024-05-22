package course_project;

public abstract class TrainingDecorator implements ITrainingProgram {
	
	protected ITrainingProgram program;

	public TrainingDecorator(ITrainingProgram program) {
		super();
		this.program = program;
	}

	@Override
	public String Description() {
		return this.program.Description();
	}

	

}

