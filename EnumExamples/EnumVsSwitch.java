public enum EnumVsSwitch {
	KF,KO,RC,FO;
}

class TestVsSwitch {
	public static void main(String[] args) {
		EnumVsSwitch beer = EnumVsSwitch.KO;
		switch(beer){
			case KF:
				System.out.println("It is children Brand.");
				break;
			case KO:
				System.out.println("It's not too chill.");
				break;
			case RC:
				System.out.println("It's too good for youngster.");
				break;
			case FO:
				System.out.println("By one get one free.");
				break;
			default:
				System.out.println("No other beer brand recommanded.");
		}
		
	}
}


/* Case label must be valid enum constant otherwise we will get CTE saying:
unqualified enumarator constant name required


Example: EnumVsSwitch.java:30: error: class, interface, or enum expected
unqualified enumarator constant name required
^
1 error


*/