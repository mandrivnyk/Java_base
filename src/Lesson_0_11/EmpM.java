package Lesson_0_11;

public class EmpM {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Huskar", 2300, 2011, 7, 4);
		staff[1] = new Employee("Crystal Maiden", 2600, 2010, 4, 13);
		Manager boss=new Manager("Chen", 2900, 2008, 9, 23);
		staff[2] = boss;

		for (Employee emp : staff) {
		
			System.out.println(emp.getName() + ";" + emp.getSalary() + 
					";" + emp.getHireDay());
		}
	}

}
