package Test;

import Page.GoogleSearchOnePage;
import Page.GoogleSearchTwoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends GoogleBaseTest{

    @Test
    public void goggleSearchTest () {
        GoogleSearchOnePage googleSearchOnePage = googleStartPage.setSearchString("Selenium");
        GoogleSearchTwoPage googleSearchTwoPage = googleSearchOnePage.googleSearcgResult();
        Assert.assertEquals(googleSearchOnePage.getSearchResualtsList(), 10,
                "The number of requests found is not equal to ten.");
        googleSearchTwoPage.googleSearcgResultTwoPage();
        Assert.assertEquals(googleSearchTwoPage.getSearchResualtsListTwoPage(), 10,
                "The number of requests found is not equal to ten.");
    }
}
