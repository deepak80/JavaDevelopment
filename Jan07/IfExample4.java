public class IfExample4{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Is it true that Header,Footer and Sidebar always fixed in almost all websites ...true/false");
		boolean userInput = refVar.nextBoolean();
		if(userInput){
			System.out.println("You are wrong..");
		}//End of if block.
		System.out.print("It's fixed approximately..");
	}//End of main method.
}//End of class.