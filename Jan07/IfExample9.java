public class IfExample9{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Empty bottle filled or not yes/no");
		String userInput = refVar.next();
		if(userInput.equalsIgnoreCase("yes")){
			System.out.println("You are right..");
		}//End of if block.
		System.out.print("It's filled..");
	}//End of main method.
}//End of class.