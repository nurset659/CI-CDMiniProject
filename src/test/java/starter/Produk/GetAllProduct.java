package starter.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProduct {

    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("user is on the product list page endpoint")
    public String ProductListPageEndpoint(){
        return url;
    }
    @Step("user requests the product list endpoint")
    public void CreateReqEndpoint(){
        SerenityRest.given().get(ProductListPageEndpoint());
    }
    @Step("user should receive a list of products")
    public void GetListProduk(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("i receive that the response code is 200 OK")
    public void SuccesGetProduk(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

