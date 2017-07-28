package practice;

public class Test1 {
	
	public void notValid() {
		 int y = 10;
		 int x=2;        //local variable must be initialized before used
       int reply = x + y; // DOES NOT COMPILE
		 System.out.println(reply);

		 }

	public static void main(String[] args) {
		
		Test1 test = new Test1();
		test.notValid();  //the method is called using the reference variable
		
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}
