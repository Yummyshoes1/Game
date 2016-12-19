import java.io.*;

public class WritingToFiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream output = new PrintStream(new File("chef.txt"));
		output.println("Hi, how are ya");
		output.println("Oh, hey");
	}

}
