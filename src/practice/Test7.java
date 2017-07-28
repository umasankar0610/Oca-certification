package practice;

public class Test7 {
		public static void main(String[] args)
		{ try 
		{ String[] arr =new String[4];
		arr[1] = "Unix"; arr[2] = "Linux";
		arr[3] = "Solarios";
		for (String car : arr) { System.out.print(car + " ");
		}
		} catch(Exception e)
		{ System.out.print (e.getClass());
		}
		}

}
