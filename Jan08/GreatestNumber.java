public class GreatestNumber{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Enter your first number...");
		int firstNumber = refVar.nextInt();
		System.out.println("Enter your second number...");
		int secondNumber = refVar.nextInt();
		System.out.println("Enter your third number...");
		int thirdNumber = refVar.nextInt();
		if(firstNumber>secondNumber){
			if(firstNumber>thirdNumber){
				System.out.println("Greatest number is: "+firstNumber);			
			}else{
				System.out.println("Greatest number is: "+thirdNumber);
			}
		}else{
			if(secondNumber>thirdNumber){
				System.out.println("Greatest number is:"+secondNumber);
			}else{
				System.out.println("Greatest number is: "+thirdNumber);
			}
		}
	}//End of main method.
}//End of class.