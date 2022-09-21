package Test.com.brooksource.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.utils.BrowseUtils;

import java.util.List;
import java.util.Locale;

public class JobSearch_Page {
    public JobSearch_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@placeholder='Keywords']")
    private WebElement searchBox;
    @FindBy(xpath = "//h3")
    private List<WebElement> positionTitleResults;


    public void insertKeywordAndSearch(String keyWord) {
        searchBox.click();
        searchBox.sendKeys(keyWord);
        searchBox.sendKeys(Keys.ENTER);


    }

    public void validateSearching(String keyword) {

        for (WebElement positionTitle : positionTitleResults) {

            Assert.assertTrue(BrowseUtils.getText(positionTitle).contains(keyword));
            System.out.println(positionTitle.getText());
            System.out.println(positionTitle.getText().contains(keyword) || positionTitle.getText().contains(keyword.toLowerCase()));
        }

    }


    public void validateListAfterView(WebDriver driver) throws InterruptedException {

        for (WebElement positionTitle : positionTitleResults) {
            positionTitle.click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            Assert.assertTrue(positionTitle.isDisplayed());
        }


    }


    public void ValidateTilte(WebDriver driver) {
        String titleExpected;
        for (int i = 0; i <positionTitleResults.size(); i++) {
             titleExpected = positionTitleResults.get(i).getText();
            positionTitleResults.get(i).click();

            String titleActual = driver.getTitle();
          Assert.assertTrue(titleActual.contains(titleExpected));

            driver.navigate().back();
          searchBox.click();
          searchBox.sendKeys(Keys.ENTER);




        }


    }


}
