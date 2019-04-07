enum Month {
	JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NUM, DEC;
}
class ValuesAndOrdinalMethodDemo {
	public static void main(String[] args) {
		Month[] monRef = Month.values();
		for(Month mon : monRef) {
			System.out.println(mon+"......"+mon.ordinal());	
		}//End of for each loop/inhenced loop
	}//End of main method.
}//End of class.

/*Select text and clic on secondary click(right click) or ENTER key to copy selected text in command prompt. For past: Again right click where you want to past selected text or Ctrl+V /* 

/*
Every enum emplicitely contain "values()" method to list out all the values(named constant) present inside enum.

"values()" method not present in java.lang.Enum and Object classes. enum keyword itself/implicitely provide this method.

Ordinal value is 0 based like array.
--------------------------------------------
Inside enum the order of constants are important and we can represent this order by ordinal value. We can find ordinal value of enum constant by using "ordinal()" method.
------------------
Prototype of ordinal() method is:
__________________________
pubic final int ordinal()
__________________________
*/