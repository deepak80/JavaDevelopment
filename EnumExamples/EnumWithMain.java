enum Beer {
	KingFisher,Knokout,RoyarChallenge,Foster;
	public static void main(String[] args) {
		System.out.println("Inside Enum");
	}
//semicolon optional.
//If we want to a group of named constant then we should go for enum.
}

enum Month {

	JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NUM, DEC;
}

//The main objective of enum is to define our own date types(enumarated data types).
//Enum concept intruduced in 1.5v. java enum is more powerful than old languages enum concept.
//We can group variables, methods & classes inside enum. These type of facilities are not available in other languages enum concept.
//Every enum is implemented by using class concept.
//Every enum constant represents an object of enum type.
//Every enum constant is always public static final.
//enum is declared by using enum keyword.