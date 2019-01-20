package selfLearning.testTestNGTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SimpleTest {
  @Test(groups="grp1")
  public void sTest1() {
	  System.out.println("test1");
  }
  @Test
  public void sTest2() {
	  System.out.println("test2");
  }
  @BeforeClass
  public void start() {
	  System.out.println("start");
  }

  @AfterClass
  public void end() {
	  System.out.println("end");
  }

}
