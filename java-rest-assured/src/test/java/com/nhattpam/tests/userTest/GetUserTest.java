package com.nhattpam.tests.userTest;

import com.nhattpam.base.BaseTest;
import com.nhattpam.endpoints.UserAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest extends BaseTest {

    @Test
    public void testGetUserById() {
        Response response = UserAPI.getUserById(1);

        // In nội dung JSON thực tế của response
        System.out.println("Response Body: " + response.asString());

        // Hoặc in đẹp hơn
        response.prettyPrint();

        // Kiểm tra status code
        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
