package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "https://altashop-api.fly.dev/api/auth/login";
    @Step("is on Login endpoint")
    public String LoginEndpoint(){
        return url;
    }
    @Step("When user  send requests Login endpoint")
    public void ReqLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","min@gmail.com");
        requestBody.put("password","nuk00");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(LoginEndpoint());
    }
    @Step("Then user success login with status code response 200 OK")
    public void LoginSuccess(){
        restAssuredThat(response -> response.statusCode(200));
    }
}


