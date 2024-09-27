package ru.perm.v.shop_kotlin.restassured

import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Log tests /log")
class LogRestTest {
    @Test
    @DisplayName("GET log is status=200")
    fun getLog_HttpStatusIsOK() {
        RestAssured.given().`when`().get(CONSTS.LOG_PATH).then()
            .statusCode(HttpStatus.SC_OK)
    }
}