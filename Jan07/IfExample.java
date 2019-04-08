public class IfExample10{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Human body more complex structure than a machine true/false");
		boolean userInput = refVar.nextBoolean();
		if(userInput){
			System.out.println("You are right..");
		}//End of if block.
		System.out.print("Yes it is..");
	}//End of main method.
}//End of class.