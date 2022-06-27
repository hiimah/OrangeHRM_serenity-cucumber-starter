package starter.StepDefinition;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddProductStep;

//@DefaultUrl("https://my.jurnal.id/products/index")
public class AddProductStepdefs {

    @Steps
    AddProductStep AddProductStep;

    @When("I click product menu")
    public void iClickProductMenu() {
        AddProductStep.ClickProductMenu();
    }

    @Then("product page appear")
    public void productPageAppear() {
        AddProductStep.verifyProductPage();
    }

    @When("I click action button")
    public void iClickActionButton() {
        AddProductStep.selectAction();
    }

    @And("I choose new product")
    public void iChooseNewProduct() {
        AddProductStep.NewProduct();
    }

    @Then("create new product page appear")
    public void createNewProductPageAppear() {
        AddProductStep.verifyCreateNewProductPage();
    }

    @When("I input name with {string}")
    public void iInputNameWith(String name) {
        AddProductStep.fieldNameProduct(name);
    }

    @And("I input CodeOrSKU {string}")
    public void iInputCodeOrSKU(String name) {
        AddProductStep.fieldProductCode(name);

    }

    @And("I click field category")
    public void iClickFieldCategory() {
        AddProductStep.clickFieldCategory();
    }

    @And("I input name category with {string}")
    public void inputNameCategoryWith(String jenisprodct) {
        AddProductStep.inputFieldCategory(jenisprodct);
    }

    @And("I click field unit")
    public void iClickFieldUnit() {
        AddProductStep.ClickFieldUnit();
    }

    @And("I input unit {string}")
    public void iInputUnit(String qty) {
        AddProductStep.InputUnit(qty);
    }

    @And("I input Description {string}")
    public void iInputDescription(String ket) {
        AddProductStep.inputFieldDescription(ket);
    }

    @And("I click check box I buy this item button")
    public void iClickCheckBoxIBuyThisItemButton() {
        AddProductStep.clickCheckBoxBuyPrice();
    }

    @And("I click field buy unit price")
    public void iClickFieldBuyUnitPrice() {
        AddProductStep.clickFieldBuyUnitPrice();
    }

    @And("I input buy unit price {string}")
    public void iInputBuyUnitPrice(String buy) {
        AddProductStep.InputBuyUnitPrice(buy);
    }

    @And("I click dropdown on default buy tax button")
    public void iClickDropdownOnDefaultBuyTaxButton() {
        AddProductStep.DropdownDefaultBuyTax();

    }

    @And("I click check box I sell this item button")
    public void iClickISellThisItemButton() {
        AddProductStep.clickCheckBoxSalePrice();
    }


    @And("I click check box I track stock for this item button")
    public void iClickCheckBoxITrackStockForThisItemButton() {
        AddProductStep.clickCheckBoxTrackStock();
    }



    @And("I click create product button")
    public void iClickCreateProductButton() {
        AddProductStep.ClickCreateProduct();
    }

    @Then("product detail should be appear")
    public void productDetailShouldBeAppear() {
        AddProductStep.verifyProductDetailPage();
    }
}
