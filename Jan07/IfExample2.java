public class IfExample2{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("are generic words always...true/false");
		boolean userInput = refVar.nextBoolean();
		if(userInput){
			System.out.print("You're right...!!");
		}//End of if block.
	}//End of main method.
}//End of class.