enum MonthDemo {
	JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NUM, DEC;
	public void m1(){
		System.out.println("Enum m1():method"); 
		//TestDemo.main("Hello");    //-->1
		
	}
}
class TestDemo {
	public static void main(String... args){
		MonthDemo mRef = MonthDemo.JAN;
		mRef.m1();
		//main("Hello");    -->2
	}
}
/*
----------------------------------------------------
In these cases we will get compile time error.
----------------------------------------------------
enum MonthDemo {
	JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NUM, DEC
	public void m1(){
		System.out.println("m1():method");
	}
}//CTE
enum MonthDemo {
	public void m1(){
		System.out.println("m1():method");
	}
	JAN, FAB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NUM, DEC;
}//CTE
enum MonthDemo {
	public void m1(){
		System.out.println("m1():method");
	}
}//CTE
---------------------------
Valid java enum syntax
---------------------------
enum MonthDemo {
	;
	public void m1(){
		System.out.println("m1():method");
	}
}
enum MonthDemo {
	;;;;;;;;;;;;;;
	public void m1(){
		System.out.println("m1():method");
	}
}
enum MonthDemo {
	
}


In addition of constants, If we are taking any extra member inside an enum like method then compulsory (contants should be in the first line)/first line should contains list of constants. At least one semicolon.

An empty enum is a valid java syntax.
*/


/*

We can call main method explicitely by using class name or without class name from anywhere if it's declared as public.

Even thow inside main method we are free to call "main()" method.

If we are remove comment on at line-1 or line-2 then the output is:

Enum m1():method
Enum m1():method
Enum m1():method
Enum m1():method
Infinite times.
*/