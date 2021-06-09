package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;


public class WikipediaAndroidSteps {

    @Step("Click 'Continue'")
    public WikipediaAndroidSteps clickContinue() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        return this;
    }

    @Step("Title and subtitle should have expected texts")
    public WikipediaAndroidSteps checkTitleAndSubtitle(GettingStartedPage gettingStartedPage) {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(Condition.text(gettingStartedPage.getTitle()));
        $(MobileBy.id("org.wikipedia.alpha:id/secondaryTextView"))
                .shouldHave(Condition.text(gettingStartedPage.getSubtitle()));
        return this;
    }

    @Step("Click 'Get started'")
    public WikipediaAndroidSteps getStarted() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        return this;
    }

    @Step("Field 'Search Wikipedia' should appear")
    public WikipediaAndroidSteps searchFieldShouldAppear() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).should(Condition.appear);
        return this;
    }
}