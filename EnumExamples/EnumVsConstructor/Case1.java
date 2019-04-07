enum Color {
	RED, GREEN, BLUE;
}
public class Case1 {

	public static void main(String[] args) {
		Color[] c = Color.values();
		for(Color c1 : c){
			System.out.println("hashCode of constant:"+c1+"..."+c1.hashCode());
		}
		System.out.println("Color.RED.hashCode()>Color.GREEN.hashCode() : "+(Color.RED.hashCode()>Color.GREEN.hashCode()));
		System.out.println("Color.RED.ordinal()>Color.GREEN.ordinal() : "+(Color.RED.ordinal()>Color.GREEN.ordinal()));
		System.out.println("Color.RED.equals(Color.GREEN): "+Color.RED.equals(Color.GREEN));
	}
} 

/*
 OUTPUT:
-----------
hashCode of constant:RED...366712642
hashCode of constant:GREEN...1829164700
hashCode of constant:BLUE...2018699554
Color.RED.hashCode()>Color.GREEN.hashCode() : false
Color.RED.ordinal()>Color.GREEN.ordinal() : false
Color.RED.equals(Color.GREEN): false


Every enum constants are represent an object of enum type. hence whatever method we are apply on normal object, can be applicable for enum constants.

Color.RED.hashCode()>Color.GREEN.hashCod() 
Color.RED.ordinal()>Color.GREEN.ordinal()
Color.RED.equals(Color.GREEN);       
--------------------------------------------------
bad operand types for binary operator '>'
                System.out.println("Color.RED.hashCode()>Color.GREEN.hashCode() : "+Color.RED.hashCode()>Color.GREEN.hashCode());

String + int--->String

*/