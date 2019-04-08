public class BallDemo1{
	public static void main(String[] args) {
		Ball myBall = null;
		System.out.println("myBall is: "+myBall);
		myBall = new Ball();
		System.out.println("myBall is: "+myBall);
		//Show defualt values.
		System.out.println("myBall color is: "+myBall.color);
		System.out.println("myBall madeOf is: "+myBall.madeOf);
		System.out.println("myBall price is: "+myBall.price);
		System.out.println("myBall weight is: "+myBall.weight);
		//Upadte values
		myBall.color = "red";
		myBall.madeOf = "plastic";
		myBall.price = 150f;
		myBall.weight = 100f;
		System.out.println("----------------Updated values are:--------------------");
		System.out.println("myBall color is: "+myBall.color);
		System.out.println("myBall madeOf is: "+myBall.madeOf);
		System.out.println("myBall price is: "+myBall.price);
		System.out.println("myBall weight is: "+myBall.weight);
System.out.println("----------------method calling:--------------------");
		myBall.roll();
		myBall.bounce();

	}//End of main method.

}//class BallDemo1 end