package pack2;
import pack1.Fish;
public class Test {

	public static void main(String[] args) {
		Fish f = Fish.GUPPY;
		System.out.println("normal import: "+f);
	}
} 

/*
 OUTPUT:
-----------
In the above example, We are using Fish class/enum directly from pack2.
hence required import statement is: import pack1.Fish;(explicit) / import pack1.*;(implicit)

At class level.
-------------------------------

If we want to access class and interfaces directly from outside package then required import statement is normal import.

If we want to access static member without class name from outside package then required import statement is static import.

*/