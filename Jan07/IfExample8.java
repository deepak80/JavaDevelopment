public class IfExample8{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Keep going to work, don't worry about result...true/false");
		boolean userInput = refVar.nextBoolean();
		if(userInput){
			System.out.println("You are right..");
		}//End of if block.
		System.out.print("It's true..");
	}//End of main method.
}//End of class.