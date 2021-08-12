package Classes;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TC1_1 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void happyCase() throws FileNotFoundException {
		File file=new File("countries of the world.csv");

		UC1 uc1=new UC1();
		assertEquals(1, uc1.readFile(file));
	}

}
