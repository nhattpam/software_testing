package com.nhattpam.tests.userTest;

import com.nhattpam.base.BaseTest;
import com.nhattpam.endpoints.UserAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest extends BaseTest {

    @Test
    public void testCreateUser() {
        String requestBody = "{ \"name\": \"John Doe\", \"email\": \"johndoe@example.com\" }";
        Response response = UserAPI.createUser(requestBody);
        Assert.assertEquals(response.getStatusCode(), 201);
    }
}
