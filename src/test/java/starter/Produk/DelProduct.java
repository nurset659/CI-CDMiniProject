package starter.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DelProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products/60659";

    @Step("user delete post data with valid ID")
    public String DelValidData(){
        return url;
    }
    @Step("user create request with DELETE method")
    public void CreateReqDel(){
        SerenityRest.given().delete(DelValidData());
    }
    @Step("Response system 200 ok")
    public void succestoDel(){
        restAssuredThat(response -> response.statusCode(200));
    }
}


