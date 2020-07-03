package co.com.sophos.prueba.step_definition;

import co.com.sophos.prueba.task.TarifarioOption;
import co.com.sophos.prueba.user_interface.LinkTarifario;
import co.com.sophos.prueba.user_interface.HomePage;
import co.com.sophos.prueba.user_interface.PDFFileOption;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class OpenTarifarioStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor Susan = Actor.named("Susan");
    private HomePage homePage;

    @Before
    public void setup(){
        Susan.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("^the user access to Tarifario link$")
    public void theUserAccessToTarifarioLink() {
        Susan.wasAbleTo(Open.browserOn(homePage));
        Susan.wasAbleTo(TarifarioOption.select(LinkTarifario.TARIFARIO));
    }

    @When("^the user select file$")
    public void theUserSelectFile() {
        Susan.attemptsTo(TarifarioOption.select(PDFFileOption.PDF_FILE));
    }

    @Then("^the user see in new tab (.*)$")
    public void theUserSeeInNewTabTarifasDeDepositos(String result) {
        // Write code here that turns the phrase above into concrete actions
    }
}
