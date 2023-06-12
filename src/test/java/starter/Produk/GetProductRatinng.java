package starter.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatinng {
    protected static String url = "https://altashop-api.fly.dev/api/products/60650/ratings";

    @Step("user create requests on product ratings endpoint")
    public String ProducRatingsEndpoint(){
        return url;
    }
    @Step("user get list of products ratings")
    public void requestProductRatingsEndpoint(){
        SerenityRest.given().get(ProducRatingsEndpoint());
    }
    @Step("user succes to get product ratings")
    public void getListProductRatings(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("And user succes to get product ratings")
    public void SuccesgetProductRating(){
        restAssuredThat(response -> response.statusCode(200));
    }
}