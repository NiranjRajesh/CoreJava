package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskExceptionTest {
	TaskException aut;

	@BeforeEach
	void setUp() throws Exception {
		aut=new TaskException();
		aut.no1=4;
		aut.no2=5;
		System.out.println("In before");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("In after");
	}

	@Test
	void testAdd() {
	int actual=aut.add();
	assertEquals(9,actual);
	}

}
