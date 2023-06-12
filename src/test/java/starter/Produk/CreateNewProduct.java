package starter.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";
    @Step("user on the product POST page endpoint")
    public String ProductEnpoint(){
        return url;
    }
    @Step("user create request with POST method on endpoint")
    public void RequestPostMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Sony nuk");
        requestBody.put("description","play has limits");
        requestBody.put("price",399);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(ProductEnpoint());
    }
    @Step("the system responds with the status code 200 OK")
    public void SuccesCreateProduct(){
        restAssuredThat(response -> response.statusCode(200));
    }
}


