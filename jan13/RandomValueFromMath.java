public class RandomValueFromMath{
	public static void main(String args[]){
		double randomValue = Math.random();
		int randomValue1 = (int)(randomValue*10); //Gives number between 0-9
		int randomValue2 = (int)(randomValue*100); //Gives number between 0-99
		int randomValue3 = (int)(randomValue*1000); //Gives number between 0-999
		int randomValue4 = (int)(randomValue*10000); //Gives number between 0-9999
		int randomValue5 = (int)(randomValue*100000); //Gives numbre between 0-99999
		System.out.println("(int)(randomValue*10) gives: "+randomValue1);
		System.out.println("(int)(randomValue*100) gives: "+randomValue2);
		System.out.println("(int)(randomValue*1000) gives: "+randomValue3);
		System.out.println("(int)(randomValue*10000) gives: "+randomValue4);
		System.out.println("(int)(randomValue*100000) gives: "+randomValue5);
	}//End of main method.
}//End of class.
//Almost used that concept to generating number in casino or satta.