public class IfElseExample1{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Have you username...yes/no");
		String userInput = refVar.next();
		if(userInput.equalsIgnoreCase("yes")){
			System.out.print("You can procced with it...");
		}else{
			System.out.print("You can create new one...");
		}//End of if else block.
	}//End of main method.
}//End of class.