package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.GetUserInformation;
import starter.Authentication.Login;
import starter.Authentication.Register;
import starter.Produk.*;

public class MyStepdefs {
    @Steps
    Register register;

    @Steps
    Login login;

    @Steps
    GetUserInformation getUserInformation;

    @Steps
    GetAllProduct getAllProduct;

    @Steps
    CreateNewProduct NewProduct;

    @Steps
    ProductByID getProductByID;

    @Steps
    GetProductRatinng getProductRatings;

    @Steps
    DelProduct deleteProduct;

    @Steps
    AssignProductRating assignProductRating;

    @Given("user is on Register endpoint")
    public void RegEnpoint() {
        register.RegEnpoint();
    }

    @When("user send Register endpoint requests")
    public void sendRequestt() {
        register.sendRequest();
    }

    @Then("user success Register with status code response 200 OK")
    public void SuccessRegister() {
        register.SuccessRegister();
    }

    //LOGIN
    @Given("user is on Login endpoint")
    public void userIsOnLoginEndpoint() {
        login.LoginEndpoint();
    }

    @When("user  send requests Login endpoint")
    public void userSendRequestsLoginEndpoint() {
        login.ReqLogin();
    }

    @Then("user success login with status code response 200 OK")
    public void LoginSucces() {
        login.LoginSuccess();
    }


        // Get user info
    @Given("user get endpoint auth")
    public void userGetEndpointAuth() {
        getUserInformation.setPostEndpointAuth();
    }

    @When("user send request endpoint auth")
    public void userSendRequestEndpointAuth() {
        getUserInformation.sendEndpointAuth();
    }

    @When("user have endpoint auth to get user information")
    public void userHaveEndpointAuthToGetUserInformation() {
        getUserInformation.setEnpointGet();
    }

    @And("user use get method and token from login")
    public void userUseGetMethodAndTokenFromLogin() {
        getUserInformation.sendGetUserInfo();
    }

    @Then("User succes to get user information with status code 200")
    public void userSuccesToGetUserInformationWithStatusCode( ) {
        getUserInformation.GetSuccess();
    }

    //get all product
    @Given("user is on product list page endpoint")
    public void userIsOnProductListPageEndpoint() {
        getAllProduct.ProductListPageEndpoint();
    }

    @When("user create requests product list endpoint")
    public void userCreateRequestsProductListEndpoint() {
        getAllProduct.CreateReqEndpoint();
    }

    @Then("user get a list of products")
    public void userGetAListOfProducts() {
        getAllProduct.GetListProduk();
    }

    @And("user succes to get list of product with response code 200 OK")
    public void userSuccesToGetListOfProductWithResponseCodeOK() {
        getAllProduct.SuccesGetProduk();
    }

    //create new product
    @Given("user on the product POST page endpoint")
    public void userOnTheProductPOSTPageEndpoint() {
        NewProduct.ProductEnpoint();
    }

    @When("user create request with POST method on endpoint")
    public void userCreateRequestWithPOSTMethodOnEndpoint() {
        NewProduct.RequestPostMethod();
    }

    @Then("the system responds with the status code 200 OK")
    public void theSystemRespondsWithTheStatusCodeOK() {
        NewProduct.SuccesCreateProduct();
    }

    @And("User succes to create new product")
    public void userSuccesToCreateNewProduct() {
        System.out.println("You succes to create new product");
    }

    //GET ALL PRODUCT BY ID
    @Given("user is on product list by ID endpoint")
    public void userIsOnProductListByIDEndpoint() {
        getProductByID.ProductByIdEnpoint();
    }

    @When("user create requests product list by ID endpoint")
    public void userCreateRequestsProductListByIDEndpoint() {
        getProductByID.RequestProductbyID();
    }

    @Then("system responds with the status code 200 OK")
    public void systemRespondsWithTheStatusCodeOK() {
        getProductByID.succesGetProductByID();
    }


    @And("user succes to get data product byID")
    public void userSuccesToGetDataProductByID() {
    }

    //Del product
    @Given("user delete post data with valid ID")
    public void userDeletePostDataWithValidID() {
        deleteProduct.DelValidData();
    }

    @When("user create request with DELETE method")
    public void userCreateRequestWithDELETEMethod() {
        deleteProduct.CreateReqDel();
    }

    @Then("Response system 200 ok")
    public void responseSystemOk() {
        deleteProduct.succestoDel();
    }

    @And("Succes deleted id 14771")
    public void succesDeletedId() {
        System.out.println("ID 14771 succes to deleted");
    }

    @Given("user on the assign rating Endpoint")
    public void userOnTheAssignRatingEndpoint() {
        assignProductRating.EndpointAuth();
        assignProductRating.sendEndpointAuth();
    }

    @When("user create request with post method on selected product")
    public void userCreateRequestWithPostMethodOnSelectedProduct() {
        assignProductRating.EndpointRatings();
    }

    @Then("user give rating to product")
    public void userGiveRatingToProduct() {
        assignProductRating.EndpointRatingsSend();
    }

    @And("User succes to give product rating")
    public void userSuccesToGiveProductRating() {
        assignProductRating.getStatusCOde();
    }



    //Get product rating
    @Given("user on the product ratings endpoint")
    public void userOnTheProductRatingsEndpoint() {
        getProductRatings.requestProductRatingsEndpoint();
    }

    @When("user create requests on product ratings endpoint")
    public void userCreateRequestsOnProductRatingsEndpoint() {
        getProductRatings.requestProductRatingsEndpoint();
    }

    @Then("user get list of products ratings")
    public void userGetListOfProductsRatings() {
        getProductRatings.getListProductRatings();
    }

    @And("user succes to get product ratings")
    public void userSuccesToGetProductRatings() {
        getProductRatings.SuccesgetProductRating();
    }
}
