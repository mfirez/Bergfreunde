package de.bergfreunde.pages;

import de.bergfreunde.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {


    @FindBy(className = "navigation-element has-dropdown")
    public List<WebElement> homePageMenus_loc;


}
