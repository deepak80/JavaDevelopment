enum Beer {
	KF, KO, RC, FO;
	Beer() {
		System.out.println("Enum:Constructor()");
	}
}
public class EnumConstructorDemo1 {

	public static void main(String[] args) {
		Beer beerRef = Beer.FO; //-->1
		//Beer beer = new Beer(); Can't be use.
		System.out.println("Hello World!!!!");
	}

} 

/*

OUTPUTS:
-------------------
Enum:Constructor()
Enum:Constructor()
Enum:Constructor()
Enum:Constructor()
Hello World!!!!

If we comment line 1 then the output is: Hello World!!!!

*/

/*
Every enum can contain Constructor, enum Constructor will be executed seprately for each and every enum constants at the time of enum class loading, automatically.

Becuase every enum constants are "public static final" static members will be indentified,created and executed at the time of class loading.

We are know that Constructor will be executed at the time of object creation.

*/

/*

We can't create enum object directly and hence we can't invoke enum Constructor implicitely.

If we trying to create enum object by using "new" operator then we will get compile time error saying: "enum types may not be instantiated"

*/