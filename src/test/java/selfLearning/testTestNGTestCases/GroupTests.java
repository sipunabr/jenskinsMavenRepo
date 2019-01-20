package selfLearning.testTestNGTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupTests {
  @Test(groups= {"grp1","grp2"})
  public void test1() {
	  System.out.println("test1");
  }
  @Test(groups= {"grp3","grp2"})
  public void test2() {
	  System.out.println("test3");
  }
  @Test(groups= {"grp1","grp3"})
  public void test3() {
	  System.out.println("test3");
  }
  @BeforeClass
  public void setUp() {
	  System.out.println("set up");
  }

  @AfterClass
  public void tearDown() {
	  System.out.println("end all");
  }

}
