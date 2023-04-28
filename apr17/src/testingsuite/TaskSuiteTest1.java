package testingsuite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskSuiteTest1 {
	TaskSuite suite;
	@BeforeEach
	void setUp() throws Exception {
		this.suite=new TaskSuite();
		suite.setDigit(5);
		suite.setValue(8);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMaximise() {
	  int actual=suite.maximise();
	  assertEquals(8,actual);
	}

	@Test
	void testValueToFloat() {
		float actual=suite.ValueToFloat();
		assertEquals(8.0f,actual);
	}

}
