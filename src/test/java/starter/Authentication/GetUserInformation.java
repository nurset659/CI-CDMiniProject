package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformation {
    protected static String email="min@gmail.com";
    protected static String password="nuk00";
    public String token="";
    public String endpointAuth="https://altashop-api.fly.dev/api/auth";
    @Step("user get endpoint auth")
    public String setPostEndpointAuth(){
        return endpointAuth + "/login";
    }

    @Step ("user send request endpoint auth")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("User send request endpoint get")
    public String setEnpointGet(){
        return endpointAuth + "/info";
    }

    @Step("user use get method and token from login")
    public void sendGetUserInfo(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setEnpointGet());
    }
    @Step("User succes to get user information with status code 200")
    public void GetSuccess(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
