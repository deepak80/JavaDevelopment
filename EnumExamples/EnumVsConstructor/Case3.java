enum Color {
	RED{
	public String info() {
		return "Dangerous Color";
	}
}, GREEN, BLUE;
	public String info() {
		return "Universal Color";
	}
}
public class Case3 {

	public static void main(String[] args) {
		Color[] c = Color.values();
		for(Color c1 : c){
			System.out.println(c1.info()); 	//-->1
		}
		
	}
} 

/*
 OUTPUT:
-----------
If info() method declared as "public void info()" then we will get compile time error at line 1.

CTE:'void' type not allowed here

B'z println() method takes String type as a arguement.

Instead of Sopln statement use c1.info() directly and declared method as "public void info()"
*/