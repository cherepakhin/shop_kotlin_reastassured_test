package ru.perm.v.shop_kotlin.restassured

import com.fasterxml.jackson.databind.ObjectMapper
import io.restassured.RestAssured
import org.apache.http.HttpStatus
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import ru.perm.v.shop_kotlin.restassured.CONSTS.Companion.PRODUCT_PATH
import kotlin.test.assertEquals

@DisplayName("Products tests /product")
class ProductRestTest {
    val mapper = ObjectMapper()

    @Test
    @DisplayName("GET count_names of products is status=200")
    fun getNumberOfProductNames_HttpStatusIsOK() {
        RestAssured.given().`when`().get(PRODUCT_PATH + "count_names").then()
            .statusCode(HttpStatus.SC_OK)
    }

    @Test
    @DisplayName("GET number of product NAMES RESULT is 9")
    fun getNumberOfProductNames_checkCount() {
        val result = RestAssured.given().`when`().get(PRODUCT_PATH + "count_names").asString()
        assertEquals("9", result)
    }

    @Test
    @DisplayName("GET number of product NAMES RESULT is 9 and status=Ok (for example)")
    fun getNumberOfProductNames_checkStatus_checkCount() {
        val response = RestAssured.given().`when`().get(PRODUCT_PATH + "count_names")

        assertEquals(HttpStatus.SC_OK, response.statusCode())
        assertEquals(9, response.asString().toInt())
    }

    @Test
    @DisplayName("Simple get echo test")
    fun echoTest() {
        val response = RestAssured.given().`when`().get(PRODUCT_PATH + "echo/ECHO_MESSAGE")

        assertEquals(HttpStatus.SC_OK, response.statusCode())
        assertEquals("ECHO_MESSAGE", response.asString())
    }
}