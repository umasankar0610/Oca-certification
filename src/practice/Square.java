package practice;

public class Square extends Shape{
	public Square(){
		super();
	}
	public Square(String label){
		System.out.println("Square: constructor");
	}
	public void foo(){
		super.foo();
	}
	public void foo(String label){
		System.out.println("Square: foo");
	}
}

