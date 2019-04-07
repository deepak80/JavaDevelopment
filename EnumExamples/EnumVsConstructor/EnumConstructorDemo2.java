enum Beer {
	KF(70), KO(80), RC(90), FO;
	int price;
	Beer(int price) {
		this.price = price;
	}
	Beer() {
		this.price = 60;
		System.out.println("Price of Beers are:");
	}
	public int getPrice() {
		return price;
	}
}
public class EnumConstructorDemo2 {

	public static void main(String[] args) {
		Beer[] beerRef = Beer.values(); 
		for(Beer beerRef1 : beerRef) {
			System.out.println(beerRef1+"......"+beerRef1.getPrice());
		}
	}
} 

/*

OUTPUTS:
-------------------
Price of Beers are:
KF......70
KO......80
RC......90
FO......60

If we creating a paramitrized Constructor explicitely then it's recommanded to add no arguement constructor so that program executed smoothly without any error.

There may a situation when you are not passing any arguement, In this situation you will got compile time error. if you're program does't contain any no arguement constructor. B'z compiler does't add default constructor if program contain any user defined constructor.

Otherwise we will get compile time error. 
*/

/*
Every enum can contain Constructor, enum Constructor will be executed seprately for each and every enum constants at the time of enum class loading, automatically.

Becuase every enum constants are "public static final", static members will be indentified,created and executed at the time of class loading.

We are know that Constructor will be executed at the time of object creation.

*/

/*

We can't create enum object directly and hence we can't invoke enum Constructor implicitely.

If we trying to create enum object by using "new" operator then we will get compile time error saying: "enum types may not be instantiated"

*/