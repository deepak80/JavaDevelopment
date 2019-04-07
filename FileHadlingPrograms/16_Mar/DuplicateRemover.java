import java.io.*;
public class DuplicateRemover {
	public static void main(String[] args) throws Exception {
		PrintWriter printW = new PrintWriter("Output.txt");
		BufferedReader fileR1 = new BufferedReader(new FileReader("Input.txt"));
		String line = fileR1.readLine();
		while(line != null) {
			boolean available = false;
			BufferedReader fileR2 = new BufferedReader(new FileReader("Output.txt"));
			String target = fileR2.readLine();
			while(target != null) {
				if(line.equals(target)){
					available = true;
					break;
				}
				target = fileR2.readLine();
			}//End of inner loop.
			if(available == false){
				printW.println(line);
				printW.flush();
			}
			line = fileR1.readLine();
			fileR2.close();	/*Can't be use outside of outer loop
			b's it's local ref. variable of outer loop */
		}//End of outer loop.
		printW.close();
		fileR1.close();
	}//End of main method.
}//End of class