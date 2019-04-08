public class GreatestNumber2{
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
				if(thirdNumber>firstNumber){
					System.out.println("Greatest number is: "+thirdNumber);			}else{
					System.out.println("Greatest numbers are: "+firstNumber+" and "+thirdNumber+" both are equals.");
				}
			}
		}else{
			if(secondNumber>firstNumber){
				if(secondNumber>thirdNumber){
					System.out.println("Greatest number is: "+secondNumber);			
				}else{
					if(thirdNumber>secondNumber){
						System.out.println("Greatest number is: "+thirdNumber);
					}else{
						System.out.println("Greatest numbers are: "+secondNumber+" and "+thirdNumber+" both are equals.");
					}
				}
			}else{
				if(secondNumber==thirdNumber){
					System.out.println("Greatest Number is: "+firstNumber+" All are equal.");	
				}else{
					if(secondNumber>thirdNumber){
						System.out.println("Greatest Number is: "+secondNumber+" First and second number are equal.");
					}else{
						System.out.println("Greatest Number is: "+thirdNumber);	
					}
				}
			}
		}
		//You can create it using ternary operator.
	}//End of main method.
}//End of class.