package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Wikipedia Android Tests")
public class WikipediaAndroidTests extends BaseTest {

    @Test
    @DisplayName("Getting started test")
    void searchTest() {
        new WikipediaAndroidSteps()
                .checkTitleAndSubtitle(GettingStartedPage.FIRST)
                .clickContinue()
                .checkTitleAndSubtitle(GettingStartedPage.SECOND)
                .clickContinue()
                .checkTitleAndSubtitle(GettingStartedPage.THIRD)
                .clickContinue()
                .checkTitleAndSubtitle(GettingStartedPage.FOURTH)
                .getStarted()
                .searchFieldShouldAppear();
    }
}