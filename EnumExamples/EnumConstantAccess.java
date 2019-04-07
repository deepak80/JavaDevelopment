enum Beer {
	KF,KO,RC,FO;
}

class Test {
	public static void main(String[] args) {
		//Every enum constants are public static final and hence we can access enum contant by using enum name.
		Beer beer = Beer.KO;
		System.out.println(beer);//Print name of the constant.
	}
}
//KingFisher(KF),Knokout(KO),RoyarChallenge(RC),Foster(FO);
//Inside enum "toString()" method is internally implemented to return name of the constant.
//IN java to create an object of class we are used new keyword but in enum there is no such type of rule/concept. 