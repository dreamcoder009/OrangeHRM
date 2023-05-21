package baseClasses;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void second() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Second Test");
	}

}
