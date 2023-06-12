package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected static String url = "https://altashop-api.fly.dev/api/auth/register";
    @Step("user is on Register page endpoint")
    public String RegEnpoint(){
        return url;
    }
    @Step("user send Register endpoint requests")
    public void sendRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","min@gmail.com");
        requestBody.put("password","nuk00");
        requestBody.put("fullname","nukk");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(RegEnpoint());
    }
    @Step("user success Register with status code response 200 OK")
    public void SuccessRegister(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
