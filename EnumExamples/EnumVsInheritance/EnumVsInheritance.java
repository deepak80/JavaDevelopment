enum Color {
	RED,GREEN,BLUE;
}
/*
*
*
Every enum in java is the direct child class of java.lang.Enum and hence we can't extends any other enum. Every enum is the final explicitely and hence we can't create child class of enum, for the above reason Inheritance concept is not applicable for enum and we can't use estends keyword for enum.


If we trying to use extends keyword for enum then we will get compile time error. 
*/