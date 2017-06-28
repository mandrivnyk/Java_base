package Lesson_0_16;

public class ProjectExample {
	
	public void MyMetod(int a, int b) throws MyOwnException{
		if(b==0){
			MyOwnException e = new MyOwnException();
			throw e;
			
		}
		else {
			System.out.println(a/b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectExample p = new ProjectExample();
		try {
			p.MyMetod(1, 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		
	}

}
