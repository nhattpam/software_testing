package com.nhattpam.tests.userTest;

import com.nhattpam.base.BaseTest;
import com.nhattpam.endpoints.UserAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUserTest extends BaseTest {

    @Test
    public void testDeleteUser() {
        Response response = UserAPI.deleteUser(1);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
