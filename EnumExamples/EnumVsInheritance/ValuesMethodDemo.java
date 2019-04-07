enum Month {
	JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NUM, DEC;
}
class ValuesMethodDemo {
	public static void main(String[] args) {
		Month[] monRef = Month.values();
		for(Month mon : monRef) {
			System.out.println(mon);	
		}
	}
}

/*
Every enum emplicitely contain "values()" method to list out all the values(named constant) present inside enum.

"values()" method not present in java.lang.Enum and Object classes. enum keyword itself/implicitely provide this method.
*/