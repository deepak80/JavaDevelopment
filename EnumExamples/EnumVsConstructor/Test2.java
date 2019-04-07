package pack3;
import pack1.Fish.GUPPY;
public class Test2 {

	public static void main(String[] args) {
		System.out.println(GUPPY);
	}
} 

/*
 OUTPUT:
-----------
In the above example, We are using static variable/contant GUPPY directly from outside package pack3.

hence required import statement is: import static pack1.Fish.GUPPY;(explicit) / import static pack1.Fish*;(implicit)

At class level.
-------------------------------

If we want to access class and interfaces directly from outside package then required import statement is normal import.

If we want to access static member without class name from outside package then required import statement is static import.

*/