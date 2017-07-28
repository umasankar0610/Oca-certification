package practice;

public class Sample2 extends Sample1 {
	private int numberOfFins = 8;
	public Sample2(int age) 
	{
		super(age);
	this.size = 4;
	}
	public void displaySharkDetails() {
	System.out.print("Shark with age: "+getAge());
	System.out.print(" and "+size+" meters long");
	System.out.print(" with "+numberOfFins+" fins");
	
	}
	public static void main(String[] args) {
		Sample2 s = new Sample2(4);
		s.displaySharkDetails();
		
			}
}
