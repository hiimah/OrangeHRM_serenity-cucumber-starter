package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("https://my.jurnal.id/products/new")
public class CreateProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]")
    WebElement headerCreateNewProduct;

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement NameProduct;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[3]/div[2]/input")
    WebElement ProductCode;

    @FindBy(xpath = "//*[@id=\"react-select-2--value\"]")
    WebElement ClickCategory;

    @FindBy(xpath = "//*[@id=\"react-select-2--value\"]/div[2]/input")
    WebElement fieldCategory;

    @FindBy(xpath = "//*[@id=\"react-select-3--value\"]")
    WebElement ClickUnit;

    @FindBy(xpath = "//*[@id=\"react-select-3--value\"]/div[2]/input")
    WebElement QtyUnit;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[6]/div[2]/textarea")
    WebElement inputDescription;

    @FindBy(xpath = "//*[@id=\"buy-panel\"]")
    WebElement CheckBoxBuyPrice;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]")
    WebElement FieldBuyUnitPrice;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/h4/div/label[2]")
    WebElement InputBuyPrice;

    @FindBy(xpath = "//*[@id=\"react-select-7--value\"]/div[2]/input")
    WebElement DropdownBuyTax;

    @FindBy(xpath = "//*[@id=\"sell-panel\"]")
    WebElement CheckBoxSalePrice;

    @FindBy(xpath = "//*[@id=\"track-panel\"]")
    WebElement CheckBoxTrackStock;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[9]/div/button[1]")
    WebElement CreateProductButton;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/header/div/div[1]/div")
    WebElement HeaderProductDetail;

    public String getHeaderPage() {
        return headerCreateNewProduct.getText();
    }
    public void fieldNameProduct(String name){
        NameProduct.sendKeys(name);
    }

    public void fieldProductCode(String name){
        ProductCode.sendKeys(name);
    }

    public void clickFieldCategory(){
        ClickCategory.click();
    }

    public void inputFieldCategory(String jenisprodct) {
        fieldCategory.sendKeys(jenisprodct);
    }

    public void clickFieldUnit(){
        ClickUnit.click();
    }

    public void InputUnit(String qty) {
        QtyUnit.sendKeys(qty);
    }

    public void inputFieldDescription(String ket) {
        inputDescription.sendKeys(ket);
    }

    public void clickCheckBoxBuyPrice() {
        CheckBoxBuyPrice.click();
    }

    public void clickFieldBuyUnitPrice(){
        FieldBuyUnitPrice.click();
    }

    public void InputBuyUnitPrice(String buy) {
        InputBuyPrice.sendKeys(buy);
    }

    public void DropdownDefaultBuyTax(){
        DropdownBuyTax.click();
    }

    public void ClickCreateProduct(){
        CreateProductButton.click();
    }

    public void clickCheckBoxSalePrice() {
        CheckBoxSalePrice.click();
    }

    public void clickCheckBoxTrackProduct() {
        CheckBoxTrackStock.click();
    }

    public String getHeaderProductDetailPage() {
        return HeaderProductDetail.getText();
    }
}
