package Lesson_0_3;

public class Bigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myCash = 50;
		int myChoise = 0;
		int leffe = 40;
		int hoegarden = 30;
		int chernig = 20;
		int obolon = 7;
		
		if(myCash >= leffe){
			myChoise = leffe;
		}else if(myCash >= hoegarden){
			myChoise = hoegarden;
		}else if(myCash >= chernig){
			myChoise = chernig;
		}else if(myCash >= obolon){
				myChoise = obolon;
		}
					
		System.out.println(myChoise);
		
		
		int krepostj = 15;
	
		System.out.println("napitok "+(krepostj >=20 ? "vodka" : (krepostj <=5 ? "beer" : "wine"))); 
		int day = 8;
		switch (day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Thursday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Error day");
				break;
		}
	}

}
