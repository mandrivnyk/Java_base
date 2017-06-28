package Lesson_0_9;

public class UseCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Euroasia c = new Euroasia();
		c.getCountries();
		System.out.println();
		Euroasia c1 = new Euroasia(){
			void getCountries(){
					for (String c : countries) {
						if(!c.equals("Russia")){
							System.out.println(c);
						}
					}
			}
		};
		c1.getCountries();
	}

}
