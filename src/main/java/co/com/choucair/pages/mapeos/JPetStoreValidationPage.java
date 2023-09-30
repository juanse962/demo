package co.com.choucair.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class JPetStoreValidationPage extends PageObject {
    @FindBy(xpath = "//img[@src='../images/fish1.gif']")
    public WebElementFacade petImage;

    @FindBy(css = ":nth-child(6) > td")
    public WebElementFacade price;

    @FindBy(css = "font")
    public WebElementFacade productName;
}
