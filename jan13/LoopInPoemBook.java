public class LoopInPoemBook{
	public static void main(String args[])throws Exception{
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		final int MIN_PAGE = 1; //Creating final varible, using final keyword.
		final int MAX_PAGE = 10;
		int currentPage = MIN_PAGE;  // Generouly said that we are first page.
		while(currentPage<=10){
			
			//First step

			System.out.println("Do you want to read currrent page..Yes/No");
			String firstUserInput = refVar.nextLine();
			if("Yes".equalsIgnoreCase(firstUserInput) == false){
				System.out.println("Than continue to next page...");
				continue;
			}else{
				System.out.println("Reading by user...");
				Thread.sleep(2000); //Method for delay.
			}
			
			//Second step.

		 	System.out.println("Do you want to stop reading...Yes/No");
			String secondUserInput = refVar.nextLine();  //taking input from reader..
			if("Yes".equalsIgnoreCase(secondUserInput) == true){
				System.out.println("Thank You for using it.");
				Thread.sleep(2000);
				break;
			}
		currentPage++;
		}//End of loop.
		
	}//End of main method.
}//End of class.