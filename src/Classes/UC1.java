package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UC1 {
	int count=0;
	public int readFile(File file) throws FileNotFoundException {
		Scanner scanner=new Scanner(file);
		while(scanner.hasNext()) {
			String countryDetails=scanner.nextLine();
			if(countryDetails.contains("India")) {
				System.out.println(countryDetails);
				count++;
			}
		
			
		}
		return count;
	}
	
}
