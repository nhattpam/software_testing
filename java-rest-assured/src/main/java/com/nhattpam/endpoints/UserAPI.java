package com.nhattpam.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class UserAPI {

    private static final String USERS_ENDPOINT = "/users"; // Endpoint API

    // Gửi request GET để lấy danh sách người dùng
    public static Response getUsers() {
        return given()
                .when()
                .get(USERS_ENDPOINT)
                .then()
                .extract().response();
    }

    // Gửi request POST để tạo user mới
    public static Response createUser(String requestBody) {
        return given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(USERS_ENDPOINT)
                .then()
                .extract().response();
    }

    // Gửi request GET để lấy thông tin user theo ID
    public static Response getUserById(int userId) {
        return given()
                .when()
                .get(USERS_ENDPOINT + "/" + userId)
                .then()
                .extract().response();
    }

    // Gửi request DELETE để xóa user theo ID
    public static Response deleteUser(int userId) {
        return given()
                .when()
                .delete(USERS_ENDPOINT + "/" + userId)
                .then()
                .extract().response();
    }
}
