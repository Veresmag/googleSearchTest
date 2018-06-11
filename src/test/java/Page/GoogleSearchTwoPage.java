package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchTwoPage extends GoogleBasePage{

    public GoogleSearchTwoPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
        @FindBy(xpath = "//div [@class='srg'] /div [@class='g']")
        private List<WebElement> searchResultsTwoPage;


        public int getSearchResualtsListTwoPage (){
        return searchResultsTwoPage.size();
        }

        public void googleSearcgResultTwoPage (){
            for (WebElement searchResult : searchResultsTwoPage) {
                String searchResultText = searchResult.getText();
                if (searchResultText.contains("Selenium")) {
                    System.out.println("SearchTerm found!!");
                }
                System.out.println(searchResultText);
            }

            System.out.println(searchResultsTwoPage.size());
        }
}

