public class TerneryOperatorForApptitude2{
	public static void main(String argv[]){
		System.out.println(false?-7.78F:967); //gives 967.0
		System.out.println(false?-7.78:967); //gives 967.0 according to double.
		System.out.println(false?'r':967); //gives ASCII charcter of 967.
		System.out.println(false?897989:'t'); //gives 116 cycle repeat comes under range of char.
		System.out.println(false?-7898766866L:967); //gives 967 according long.
		/*System.out.println(false?:967); //gives 967.0
		System.out.println(false?-7.78F:967); //gives 967.0
		System.out.println(false?-7.78F:967); //gives 967.0
		System.out.println(false?-7.78F:967); //gives 967.0
		System.out.println(false?-7.78F:967); //gives 967.0
		System.out.println(false?-7.78F:967); //gives 967.0*/
	}//End of main method.
}//End of class.