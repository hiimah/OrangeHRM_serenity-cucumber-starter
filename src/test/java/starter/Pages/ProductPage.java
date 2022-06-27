package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

@DefaultUrl("https://my.jurnal.id/products/products_and_services")
public class ProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/div/div/h2")
    WebElement headerProduct;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[1]/div/div[2]/i")
    WebElement DropDownAction;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[2]/div[1]/a")
    WebElement selectNewProduct;

    public String getHeaderPage(){
        return headerProduct.getText();
    }

    public void selectAction() {
        DropDownAction.click();
    }

    public void selectNewProduct() {
        selectNewProduct.click();
    }
}
