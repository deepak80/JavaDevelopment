public class GreatestNumberUsingTernary2{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Enter your first number...");
		int firstNumber = refVar.nextInt();
		System.out.println("Enter your second number...");
		int secondNumber = refVar.nextInt();
		System.out.println("Enter your third number...");
		int thirdNumber = refVar.nextInt();
		int greatestNumber = firstNumber>secondNumber?(firstNumber>thirdNumber?firstNumber:(thirdNumber>firstNumber?thirdNumber:firstNumber)):(secondNumber>firstNumber?(secondNumber>thirdNumber?secondNumber:(thirdNumber>secondNumber?thirdNumber:secondNumber)):(secondNumber==thirdNumber?firstNumber:(secondNumber>thirdNumber?secondNumber:thirdNumber)));
		System.out.println("Greatest number is: "+greatestNumber);
		}//End of main method.
}//End of class.