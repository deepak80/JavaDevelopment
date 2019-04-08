public class LoopWithDate{
	public static void main(String args[])throws Exception{
		boolean usedIncondition=true;
		System.out.println("The current date and time is: ");
		/*while(usedIncondition){
			Thread.sleep(1000);
			System.out.println(refOfDateObj);//Not Show each second of time. If date Object created outside of the loop.
		}*/
		while(usedIncondition){
			java.util.Date refOfDateObj = new java.util.Date(); //Date object creation. Each and every time created whenever loop repeat.
			Thread.sleep(1000);
			System.out.println(refOfDateObj);//Show each second of time.
		}
		
	}//End of main method.
}//End of class.