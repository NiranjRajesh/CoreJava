package testingsuite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TaskSuiteTest1.class, TaskSuiteTest2.class })
public class AllTests {

}
