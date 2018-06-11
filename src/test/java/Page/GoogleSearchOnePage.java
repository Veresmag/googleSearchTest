package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchOnePage extends GoogleBasePage {
    public GoogleSearchOnePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div [@class='srg'] /div [@class='g']")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//a [@aria-label='Page 2']")
    private WebElement clickPageTwo;

    public int getSearchResualtsList (){
        return searchResults.size();
    }

    public GoogleSearchTwoPage googleSearcgResult () {
        System.out.println(searchResults.size());
        for (WebElement searchResult : searchResults) {
            String searchResultText = searchResult.getText();
            if (searchResultText.contains("Selenium")) {
                System.out.println("SearchTerm found!!");
            }
            System.out.println(searchResultText);
        }
        clickPageTwo.click();
        return new GoogleSearchTwoPage(webDriver);
    }
}