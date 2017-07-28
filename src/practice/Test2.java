package practice;

public class Test2 {
	
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch=1;
		answer = 1;
		} else {
		answer = 2;
		onlyOneBranch=2;//it had to be initialized in both block of if else
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch); // DOES NOT COMPILE
		}
     public static void main(String[] args) {
    	 
    	  Test2 test = new Test2();
    	 test.findAnswer(false);
	}
}
