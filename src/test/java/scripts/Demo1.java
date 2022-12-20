package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 extends BaseTest {
	@Test
	public void testA()
	{
		WebDriverManager.chromedriver().setup();
		System.out.println("hello");
	}
}
