enum Color {
	RED{
		Color() {
			System.out.println("Dangerous Color");	
		}
	}, GREEN, BLUE;
	Color() {
		System.out.println("Universal Color");	
	}
}
public class EnumConstructorDemo3 {

	public static void main(String[] args) {
		Color c = Color.RED;
		System.out.println("main():method");
	}
} 

/*
 OUTPUT:
-----------
invalid method declaration; return type required

Compiler always try to find method.

We can't override Constructor.

There is no need of overriding constructor.
*/