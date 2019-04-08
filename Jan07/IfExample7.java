public class IfExample7{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Are the books provide the knowledge, how will be real world(things) would be...yes/no");
		String userInput = refVar.next();
		if(userInput.equalsIgnoreCase("yes")){
			System.out.println("You are right..");
		}//End of if block.
		System.out.print("It's provide..");
	}//End of main method.
}//End of class.