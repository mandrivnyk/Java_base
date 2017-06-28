package Lesson_0_9;

public class Outer {
	public String outerPublic = "outerPublic";
	private String outerPrivate = "outerPrivate";
	
	Outer(){
		System.out.println(new Inner().getInner());
	}
	
	void getOuter(){
		System.out.println("outer something");
	}
			
	class Inner{
		public String innerPublic = "innerPublic";
		private String innerPrivate = "innerPrivate";
		
		Inner(){
			System.out.println(outerPublic);
			System.out.println(outerPrivate);
			getOuter();
		}
		
		void getInner(){
			System.out.println("inner something");
		}	
	}
	
}
