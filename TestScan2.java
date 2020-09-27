import java.util.Scanner;
import java.io.IOException;

public class TestScan2{
	
	public static String getfullName(String firstName,String lastName){
		StringBuffer sb = new StringBuffer();
		String full = firstName + " " + lastName;
		return full;
	}	


	public static String getInfo(Scanner userIn){
		System.out.println("Enter first name");
		String firstName = userIn.nextLine();

		System.out.println("Enter last name");
		String lastName = userIn.nextLine();

		String fullName = getfullName();
		String details =  "Name" + "is" + full + "." ;
		return details;

	}

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		TestScan2 obj = new TestScan2();

		obj.getInfo(userIn);		

	}

}