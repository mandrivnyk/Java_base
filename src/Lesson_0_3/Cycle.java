package Lesson_0_3;

import java.util.Scanner;

public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Бесконечный цикл for(;;){ }; 		

//		int i = 0;
//		for(i = 0; i<100; i++){
//			if(i == 5) {
//				continue;
//			}
//			
//			System.out.println(i);			
//		}
//		System.out.println(i);
		
//		while(true){
//			
//		}
		int  num = 56781;
		int y=1;
		int ost = 0;
		int ostCurrent = 0;
		int summa;
		int summ4 = 0;
		int summN4 = 0;
		
		while(true) {
			ostCurrent = num%10;
			if(ostCurrent == 0) {
				 
			} else {
				
			}
			
			
			ost  = ost + ostCurrent;
			num = num/10;
			System.out.println("ostCurrent = "+ostCurrent);
			System.out.println("num = "+num);
			if(num < 1) break;
			
			
			y++;
		}
		System.out.println(y);
		System.out.println(ost);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		System.out.println("You entered: "+ num);
		int number  = (int)(Math.random()*101);
		
		
	}

}
