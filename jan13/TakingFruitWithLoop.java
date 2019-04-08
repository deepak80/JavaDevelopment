public class TakingFruitWithLoop{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		final int TOTAL_REQUIRED_FRUIT_NUM = 5;
		int counterVar = 1;
		String fruitNameContainer = "";
		while(counterVar<=TOTAL_REQUIRED_FRUIT_NUM){
			System.out.println("Enter your "+counterVar+" fruit name..");
			fruitNameContainer = fruitNameContainer + refVar.nextLine() + "\n";
			/*System.out.println("Do you want to add more fruit...Yes/No");
			String userInput = refVar.next();
			if("Yes".equalsIgnoreCase(userInput) == false){
				System.out.println("Thank You for using it.");
				break;
			}*/
			counterVar++;	
		}
		System.out.println("You have entered following fruit names:\n"+fruitNameContainer);
		
	}//End of main method.
}//End of class.