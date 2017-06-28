package Lesson_0_11;

public class Manager extends Employee{
	double bonus;
	Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus=1000;
	}
	@Override
	public double getSalary(){
		return super.getSalary()+bonus;
	}
}
