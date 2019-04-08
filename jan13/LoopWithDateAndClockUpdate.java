public class LoopWithDateAndClockUpdate{
	public static void main(String args[])throws Exception{
		boolean usedIncondition=true;
		System.out.println("The current date and time is: ");
		/*while(usedIncondition){
			Thread.sleep(1000);
			System.out.println(refOfDateObj);//Show each second of time.
		}*/
		while(usedIncondition){
			java.util.Date refOfDateObj = new java.util.Date(); //Date object creation.
			Thread.sleep(1000);
			System.out.print("\r"+refOfDateObj);//Show each second of time. in a single line using carrige return.
		}
		
	}//End of main method.
}//End of class.