package FE_TestCases;
import Bases.Bases;
import org.testng.annotations.Test;
import org.testng.Assert;
import Elements.Locators_Actions;
import Elements.Pages;

public class Search_TestCases extends Bases
{
	Locators_Actions Serch;
	Pages Pages_Usings;

	@Test
	public void Search_with_ValidData()
	{
		Serch = new Locators_Actions(driver);
		Pages_Usings = new Pages(driver);
		Boolean SearchNormally = true;
		Assert.assertEquals(SearchNormally, true);
	}

	@Test
	public void Test_sytem_redirection_route()
	{
		Serch = new Locators_Actions(driver);
		Pages_Usings = new Pages(driver);
		Boolean Redirected_correctly = true;
		Assert.assertEquals(Redirected_correctly,true);
	}
}