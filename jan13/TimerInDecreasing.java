public class TimerInDecreasing{
	public static void main(String args[])throws Exception{
		java.util.Scanner refVar = new java.util.Scanner(System.in);
		System.out.println("How many second required?");
		int timeRequired = refVar.nextInt();
		while(timeRequired != 0){
			Thread.sleep(1000);
			if(timeRequired%5 == 0){
				System.out.println("***Second ["+timeRequired+"]");				}else{
				if(timeRequired==1){
					System.out.print("___Second ["+timeRequired+"]");	
				}else{
					System.out.println("___Second ["+timeRequired+"]");	
				}
			}
			timeRequired--;	
		}//End of while loop.
	}//End of main method.
}//End of class.