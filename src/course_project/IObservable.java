package course_project;

public interface IObservable {

	void addTrainee(Trainee trainee);
	void removeTrainee(Trainee trainee);
	void notifyTrainee();
	//void notifyTrainee(Trainee trainee);
}
