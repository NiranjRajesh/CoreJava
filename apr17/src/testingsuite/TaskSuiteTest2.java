package testingsuite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskSuiteTest2 {
	TaskSuite suite;
	@BeforeEach
	void setUp() throws Exception {
		this.suite=new TaskSuite();
		suite.setDigit(11);
		suite.setValue(9);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMaximise() {
		int actual=suite.maximise();
		  assertEquals(11,actual);
	}

	@Test
	void testValueToFloat() {
		float actual=suite.ValueToFloat();
		assertEquals(6,actual);
	}

}
