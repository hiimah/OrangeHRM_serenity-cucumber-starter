package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.ProductPage;
import starter.Pages.MenuPage;
import starter.Pages.CreateProductPage;

import static org.junit.Assert.*;

public class AddProductStep {

    ProductPage ProductPage;
    MenuPage MenuPage;

    CreateProductPage CreateProductPage;


    @Step
    public void ClickProductMenu(){
        MenuPage.open();
        MenuPage.clickProductMenu();
    }

    @Step
    public void verifyProductPage(){
        String headerPage=ProductPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("products"));
    }

    @Step
    public void selectAction(){
        ProductPage.selectAction();
    }

    @Step
    public void NewProduct(){
        ProductPage.selectNewProduct();
    }

    @Step
    public void verifyCreateNewProductPage() {
         String headerPage=CreateProductPage.getHeaderPage();
        assertTrue(headerPage.contains("Create New Product / Service"));
    }

    @Step
    public void fieldNameProduct(String name) {
        CreateProductPage.fieldNameProduct(name);
    }

    @Step
    public void fieldProductCode (String name){
        CreateProductPage.fieldProductCode(name);
    }

    @Step
    public void clickFieldCategory(){
        CreateProductPage.clickFieldCategory();
    }

    @Step
    public void inputFieldCategory(String jenisprodct){
        CreateProductPage.inputFieldCategory(jenisprodct);
    }

    @Step
    public void ClickFieldUnit(){
        CreateProductPage.clickFieldUnit();
    }

    @Step
    public void InputUnit(String qty){
        CreateProductPage.InputUnit(qty);
    }

    @Step
    public void inputFieldDescription(String ket) {
       CreateProductPage.inputFieldDescription(ket);
    }

    @Step
    public void clickCheckBoxBuyPrice() {
        CreateProductPage.clickCheckBoxBuyPrice();
    }

    @Step
    public void clickFieldBuyUnitPrice(){
        CreateProductPage.clickFieldBuyUnitPrice();
    }

    @Step
    public void InputBuyUnitPrice(String buy){
        CreateProductPage.InputBuyUnitPrice(buy);
    }

    @Step
    public void DropdownDefaultBuyTax(){
        CreateProductPage.DropdownDefaultBuyTax();

    }

    @Step
    public void clickCheckBoxSalePrice() {
        CreateProductPage.clickCheckBoxSalePrice();

    }

    @Step
    public void clickCheckBoxTrackStock() {
        CreateProductPage.clickCheckBoxTrackProduct();
    }

    @Step
    public void ClickCreateProduct(){
        CreateProductPage.ClickCreateProduct();
    }

    @Step
    public void verifyProductDetailPage() {
        String headerPage=CreateProductPage.getHeaderProductDetailPage();
        assertTrue(headerPage.contains("Product Detail"));
    }
}


