public class GreatestNumberUsingTernary{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Enter your first number...");
		int firstNumber = refVar.nextInt();
		System.out.println("Enter your second number...");
		int secondNumber = refVar.nextInt();
		System.out.println("Enter your third number...");
		int thirdNumber = refVar.nextInt();
		int greatestNumber = firstNumber>secondNumber?(firstNumber>thirdNumber?firstNumber:thirdNumber):(secondNumber>thirdNumber?secondNumber:thirdNumber);
		System.out.println("Greatest number is: "+greatestNumber);
		//If you are removed parenthesis, then it's absolutely work.
		//Ternary operator given for testing purpose.(look like complex without parenthesis.)
		//If anything is complex in java, java said that don't use it.
	}//End of main method.
}//End of class.