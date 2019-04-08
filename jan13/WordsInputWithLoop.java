public class WordsInputWithLoop{
	public static void main(String arga[])throws Exception{
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		String storedString = "";
		boolean runAlwaysTrue = true;
		while(runAlwaysTrue){
			System.out.println("Enter your words...");
			storedString = storedString + refVar.nextLine() + "\n";
			System.out.println("Do you want to add more words...Yes/No");
			String userChoise = refVar.nextLine();
			if("Yes".equalsIgnoreCase(userChoise) == false){
				System.out.println("Thank You for using it.");
				Thread.sleep(1000);
				break;	
			}
		}
		System.out.println("Your have entered following words:");
		System.out.print(storedString);
	}//End of main method.
}//End of class.