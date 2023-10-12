package sample;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(sample.ListnerClass.class)
public class ListnerTestCase {
   SoftAssert sa=new SoftAssert();
   @Test
   public void test1() {
	   System.out.println("this is test1() method");
   }
   @Test
   public void test2() {
	   Assert.assertTrue(false);
	   System.out.println("this is test2() method");
   }
   
   
}
