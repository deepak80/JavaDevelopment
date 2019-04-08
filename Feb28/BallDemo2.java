public class BallDemo2{
	public static void main(String[] args) {
		Ball myBall1 = null;
		Ball myBall2 = null;
		System.out.println("--------Befor object creation---------");
		System.out.println("myBall1 refrence is: "+myBall1);
		System.out.println("myBall2 refrence is: "+myBall1);
		myBall1 = new Ball();
		myBall2 = new Ball();
		System.out.println("--------After object creation---------");
		System.out.println("myBall1 refrence is: "+myBall1);
		System.out.println("myBall2 refrence is: "+myBall1);
		//Show defualt values.
		System.out.println("------------For first ball---------------");
		System.out.println("myBall1 color is: "+myBall1.color);
		System.out.println("myBall1 madeOf is: "+myBall1.madeOf);
		System.out.println("myBall1 price is: "+myBall1.price);
		System.out.println("myBall1 weight is: "+myBall1.weight);
		System.out.println("------------For second ball---------------");
		System.out.println("myBall2 color is: "+myBall1.color);
		System.out.println("myBall2 madeOf is: "+myBall1.madeOf);
		System.out.println("myBall2 price is: "+myBall1.price);
		System.out.println("myBall2 weight is: "+myBall1.weight);
		//Upadte values
		myBall1.color = "red";
		myBall1.madeOf = "plastic";
		myBall1.price = 150f;
		myBall1.weight = 100f;
		myBall2.color = "black";
		myBall2.madeOf = "wood";
		myBall2.price = 160f;
		myBall2.weight = 150f;
		System.out.println("----------------Updated values are:--------------------");
		System.out.println("-------For ball-1 is:------");
		System.out.println("myBall1 color is: "+myBall1.color);
		System.out.println("myBall1 madeOf is: "+myBall1.madeOf);
		System.out.println("myBall1 price is: "+myBall1.price);
		System.out.println("myBall1 weight is: "+myBall1.weight);
		System.out.println("-------For ball-2 is:------");
		System.out.println("myBall2 color is: "+myBall2.color);
		System.out.println("myBall2 madeOf is: "+myBall2.madeOf);
		System.out.println("myBall2 price is: "+myBall2.price);
		System.out.println("myBall2 weight is: "+myBall2.weight);
		System.out.println("----------------method calling for ball-1 is:--------------------");
		myBall1.roll();
		myBall1.bounce();
		System.out.println("----------------method calling for ball-2 is:--------------------");
		myBall2.roll();
		myBall2.bounce();

	}//End of main method.

}//class BallDemo1 end