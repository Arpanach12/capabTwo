import java.util.*;
public class password {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = new String();
		String mid = new String();
		String last = new String();
		String pwd = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		first = sc.nextLine();
		System.out.print("Enter middle name : ");
		mid = sc.nextLine();
		System.out.print("Enter last name : ");
		last = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Password = "+first.charAt(0)+mid.charAt(0)+last.charAt(0)+age);
		
	}

}
