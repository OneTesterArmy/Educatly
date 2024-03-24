package Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Locators_Actions extends Pages {
	public Locators_Actions(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#rc_select_0")
	WebElement Search1Field;
	@FindBy(xpath = "//*[@id=\"rc_select_1\"]")
	WebElement Search2Field;

	@FindBy(xpath = "//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div/div/div[2]")
	WebElement SearchButton;

	public void SearchNormally(String Arts, String Europe)
	{
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		{
			Search1Field.sendKeys("Arts");
			Search2Field.sendKeys("Europe");
			clickButton(SearchButton);
		}
	}
	@FindBy(css = "#rc_select_0")
	WebElement SearchField;

	public void ClearSearchNormally()
	{

			SearchField.sendKeys(Keys.CONTROL + "a");
			SearchField.sendKeys(Keys.DELETE);
		}
	}
