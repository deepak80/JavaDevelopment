public class IfExample3{
	public static void main(String args[]){
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("Do you enter optional input field...yes/no");
		String userInput = refVar.next();
		if(userInput.equalsIgnoreCase("yes")){
			System.out.println("It's not mandatory..");
		}//End of if block.
		/*if(userInput=="yes"){
			System.out.println("It's not mandatory..");
		}//End of if block.*/
		//userInput=="yes" gives always 'Well..It's ok' because one string(userInput) create in heap memory and second one("yes") is in String constant pool.
		System.out.print("Well...It's ok");
	}//End of main method.
}//End of class.