package de.bergfreunde.step_definitions;

import de.bergfreunde.pages.HomePage;
import de.bergfreunde.utilities.BrowserUtils;
import de.bergfreunde.utilities.ConfigurationReader;
import de.bergfreunde.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageStepDefs {



    @Given("the user enters the home page")
    public void the_user_enters_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.xpath("//button[text()='ALLE AUSWÄHLEN']")).click();


    }

    @Then("the user should be able to see following menus")
    public void the_user_should_be_able_to_see_following_menus(List<String> expectedHomePageMenus) {

        System.out.println("expectedHomePageMenus.size() = " + expectedHomePageMenus.size());
        System.out.println("expectedHomePageMenus = " + expectedHomePageMenus);

        BrowserUtils.getElementsText(new HomePage().homePageMenus_loc);


    }


}
