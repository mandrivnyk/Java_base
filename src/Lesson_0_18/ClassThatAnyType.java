package Lesson_0_18;



	public class ClassThatAnyType<T> {
		T ob;
		ClassThatAnyType(T ob){
			this.ob = ob;
		}
		
		public void getInfo(){
			System.out.println("TEST");
		}
		
		public void showType(){
			System.out.println("Obj type: "+ob.getClass().getName());
		}
		
		// TODO Auto-generated method stub

	}


