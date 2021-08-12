package Classes;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class customException extends Exception{
	public customException(String string) {
		super(string);
	}
}

class TC1_2 {
	
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void sadCase() {
		UC1 uc1=new UC1();
		File file =new File("data.csv");
		try {
			assertEquals(1, uc1.readFile(file));
			throw new customException("wrong CSV file");
		}catch (Exception e) {
			System.out.println("found->"+e);
		}
	}

}
