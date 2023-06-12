package starter.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProductByID {
    protected static String url = "https://altashop-api.fly.dev/api/products/60654";

    @Step("user is on product list by ID endpoint")
    public String ProductByIdEnpoint(){
        return url;
    }
    @Step("user create requests product list by ID endpoint")
    public void RequestProductbyID(){
        SerenityRest.given().get(ProductByIdEnpoint());
    }

    @Step("system responds with the statuscode 200 OK")
    public void succesGetProductByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

