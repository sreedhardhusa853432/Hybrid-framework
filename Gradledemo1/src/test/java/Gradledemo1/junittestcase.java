package Gradledemo1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junittestcase {
@BeforeClass
public static void setupBeforeClass() throws Exception {
	System.out.println("1");
}
@AfterClass
public static void tearDownAfterClass() throws Exception{
	System.out.println("2");
}
@Before
public void BeforeMethod() {
	System.out.println("3");
}
	@After
	public void AfterMethod() {
		System.out.println("4");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		System.out.println("test4");
	}
}
