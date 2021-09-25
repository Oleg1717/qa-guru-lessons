package allure.tests;

import allure.steps.WebSteps;
import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final String ISSUE_NAME = "Listeners NamedBy";
    private final WebSteps steps = new WebSteps();

    @Test
    public void shouldSeeIssueInRepository() {
        steps.openMainPage();
        steps.findRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithText(ISSUE_NAME);
    }
}
