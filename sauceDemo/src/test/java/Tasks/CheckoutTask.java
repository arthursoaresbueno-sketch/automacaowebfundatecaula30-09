package Tasks;

import PageObjects.CheckoutPage;
import Validacao.GenericValidacao;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidacao genericValidacao;

    public CheckoutTask (WebDriver driver){

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
    }

    public void preencherCheckout(){

        genericValidacao.validationTitlePages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys("Arthur");
        checkoutPage.getLastNameInput().sendKeys("Bueno");
        checkoutPage.getZipCodeInput().sendKeys("123456789");
        checkoutPage.getContinueInput().click();
        genericValidacao.validationTitlePages("Checkout: Overview");
        genericValidacao.validationProduto();
    }
}
