package pack4;
import pack1.Fish;
import static pack1.Fish.GUPPY;
public class Test3 {

	public static void main(String[] args) {
		Fish f = Fish.STAR;
		System.out.println(f); // Fish enum refrence.
		System.out.println(GUPPY); //GUPPY static member
	}
} 

/*
 OUTPUT:
-----------
In the above example, We are using static variable/contant GUPPY as well as class Fish directly from outside package pack4.

hence required import statement is:
1.) import static pack1.Fish.GUPPY;(explicit) / import static pack1.Fish.*;(implicit)
2.) import pack1.Fish; / import pack1.*;
At class level.
-------------------------------

If we want to access class and interfaces directly from outside package then required import statement is normal import.

If we want to access static member without class name from outside package then required import statement is static import.

*/