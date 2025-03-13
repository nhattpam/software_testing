package com.nhattpam.base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        // Thiết lập Base URI chung cho API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Thay API URL thật của bạn vào đây
    }
}
