public class  MyThirdProgram{
	public static void main(String argv[]){
		System.out.println("Success is sure");
		System.out.println("'Success is sure'");
		System.out.println("\"Success is sure\"");
		System.out.println("job\\carrer");
		System.out.println("job\\new") ;
	}//End of main method
}//End of the class

//In the list of the error topmost error is points exactly in which position real error is being present.(Observe carefully.)

//Other is to expected by the compiler these can be.

//If you are done mistake to write class keyword, it's gives an error: class, interface, or enum expected..................(this is my first mistake in first greeting message.)

//If u forget to enclosed string literal within double quotes it's gives an error : unclosed string literal...................

/*Name of the file must be same as ClassName otherwise it's gives an error:MyThirdProgram.java:1: error: class MyThirdProgram is public, should be declared in a file named MyThirdProgram.java
public class  MyThirdProgram{
       ^
1 error

It's shows filename same as class name but filename is different from ClassName. If any of them are diffrent compiler shows same error.
*/

//At the time of passing .class to JVM don't write extension of class file. otherwise it's gives an erroe:Could not find or load main class MySecondProgram.class

//When you are forget to write semicolon at the end ot any statement.

/*MySecondProgram.java:7: error: ';' expected
                System.out.println("job\\new")
                                                                                    ^
     1 error
/*
/*

MySecondProgram.java:1: error: '{' expected
public class  MySecondProgram(){
                                                                  ^
1 errors

error tells us '{' left curly bracket is expected inplace of '()' in public class MySecondProgram(){
		            ^
//This is the second mistake done by me in a first day(at the time of compiling the surce code which is done in Written secondExample) of class.
*/