package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStartPage extends GoogleBasePage {

    public GoogleStartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (id = "lst-ib")
    private WebElement searchString;

    @FindBy (xpath = "//input[@value='Поиск в Google']")
    private WebElement searchButton;

    public GoogleSearchOnePage setSearchString(String search) {
    searchString.sendKeys(search);
    searchButton.click();
    return new GoogleSearchOnePage(webDriver);
    }
}
