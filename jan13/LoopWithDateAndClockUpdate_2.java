public class LoopWithDateAndClockUpdate_2{
	public static void main(String args[])throws Exception{
		boolean usedIncondition=true;
		System.out.println("The current date and time is: ");
		/*while(usedIncondition){
			Thread.sleep(1000);
			System.out.println(refOfDateObj);//Show each second of time.
		}*/
		while(usedIncondition){
			java.util.Date refOfDateObj = new java.util.Date(); //Date object creation.
			String strObj = ""+refOfDateObj;	
			//System.out.println(strObj);
			Thread.sleep(1000);
			System.out.print("\r"+strObj.substring(11,19));//Show only time. in a single line using carrige return and substring method.
		}
		
	}//End of main method.
}//End of class.