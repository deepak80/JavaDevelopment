public class IfExample5{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Is it true computer CPU works as human brain ...true/false");
		boolean userInput = refVar.nextBoolean();
		if(userInput){
			System.out.println("You are right..");
		}//End of if block.
		System.out.print("of course is it.");
	}//End of main method.
}//End of class.