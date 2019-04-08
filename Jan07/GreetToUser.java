public class GreetToUser{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		java.util.Date dateObj = new java.util.Date();
		System.out.println("Are you engineer..Yes/No");
		String userInput = refVar.next();
		if(userInput.equalsIgnoreCase("yes")){
			System.out.println("Welcome engineer...\nYou are creator");
		}
		System.out.println("Current date and time is :"+dateObj);
		System.out.println("Thank you Mr./Mrs. :"+System.getenv("USERNAME"));
	}//End of main method.
}//End of class.