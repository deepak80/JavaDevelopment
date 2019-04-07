import java.util.*;
class Test1 {
	public static void main(String[] args){
		String course = System.getProperty("course");
		if(course.equals("java")){
			System.out.println("Java Course information.");
		}else{
			System.out.println("Other course Information.");	
		}
		Properties p = System.getProperties();
		p.list(System.out);
	}

}