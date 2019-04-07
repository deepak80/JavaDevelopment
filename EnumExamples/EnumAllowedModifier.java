public enum EnumAllowedModifier {
	KF,KO,RC,FO;
}

class Test {
	public static void main(String[] args) {
		//Every enum constants are public static final and hence we can access enum contant by using enum name.
		Beer beer = Beer.KO;
		System.out.println(beer);//Print name of the constant.
	}
}
/**
*
*
If we declare enum outside of the class, the allowed modifires are:
	public
	<defualt>
	strictfp
If we declare enum inside of the class, The allowed modifiers are:
	public
	<defualt>
	strictfp
	private
	protected
	static

While declaring enum as a public then cumpulsory name of the source file must be same as enum name.

In the above program SourceFileName:EnumAllowedModifier & NameOfEnum: EnumAllowedModifier

*Every enum explicitely final but we can't declare enum as final. If we trying then we will get compile time error. Saying: modifier final not allowed here
	EnumAllowedModifier.java:1: error: modifier final not allowed here
	final enum BeerBrand {
      		^
	1 error
abstract final-illegal combination of modifiers.
*/