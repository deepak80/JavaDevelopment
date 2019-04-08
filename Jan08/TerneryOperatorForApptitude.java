public class TerneryOperatorForApptitude{
	public static void main(String argv[]){
		System.out.println(true?'A':66);  //char more periority than int.
		System.out.println(true?'A':66.7); //changed according to double.
		System.out.println(false?'A':66.5);
	System.out.println(true?'A':'B'); 	System.out.println(true?'A':"Bal");
	System.out.println(true?45667:'B');//char 2 bytes in Java. 			
	}//End of main method.
}//End of class.