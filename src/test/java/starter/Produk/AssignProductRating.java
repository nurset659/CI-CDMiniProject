package starter.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AssignProductRating {
    protected static String email="abccdef@gmail.com";
    protected static String password="nuk00";
    public String token ="";
    public String endpointAuth = "https://altashop-api.fly.dev/api";

    @Step("user have auth endpoint")
    public String EndpointAuth(){
        return endpointAuth + "/auth/login";
    }

    @Step ("user send auth endpoint")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(EndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step ("user on the assign rating Endpoint")
    public String EndpointRatings() {
        return endpointAuth + "/products/60650/ratings";
    }

    @Step ("user create request with post method on selected product")
    public void EndpointRatingsSend() {
        String count = "2";

        String body = "{\n" +
                "    \"count\":" + count + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+ token).body(reqBody.toString()).post(EndpointRatings());
    }

    @Step("User succes to give product rating")
    public void getStatusCOde() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

