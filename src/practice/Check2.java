package practice;

public class Check2 {
	public static void main(String[] args) {
		String name="spot";
		int age=4;
	/*	String str ="my dog"+" "+name+" "+"is"+" "+age;
		System.out.println(str);*/
		StringBuilder sb = new StringBuilder();
	//	sb.append("my dog ").append(name).append(" is ").append(age);
		sb.append("my dog "+name+" is "+age);
		System.out.println(sb);
		}

}
