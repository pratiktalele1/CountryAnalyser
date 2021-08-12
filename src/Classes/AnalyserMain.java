package Classes;

import java.io.File;
import java.io.IOException;

public class AnalyserMain {
	public static void main(String[] args) throws IOException {
		File file=new File("countries of the world.csv");
		UC1 uc1=new UC1();
		uc1.readFile(file);
	}
}
