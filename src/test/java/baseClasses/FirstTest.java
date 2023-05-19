package baseClasses;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void first() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("First Test");
	}

}
