package ru.perm.v.shop_kotlin.restassured

import com.fasterxml.jackson.databind.ObjectMapper
import io.qameta.allure.Epic
import io.restassured.RestAssured.given
import io.restassured.response.Response
import org.apache.http.HttpStatus
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import ru.perm.v.shop_kotlin.restassured.dto.GroupProductDTO
import kotlin.test.assertEquals


@DisplayName("Group products tests")
class GroupProductRestTest {

    @Test
    @Epic("REST API getAll()")
    @DisplayName("GET Request GroupProductRest.all() with message is status=200")
    fun getAll_HttpStatusIsOK() {
        given().`when`().get(CONSTS.GROUP_PATH).then()
            .statusCode(HttpStatus.SC_OK)
    }

    @Test
    @Epic("REST API getAll()")
    @DisplayName("GET Request GroupProductRest.all() check dtos")
    fun getAll_check_DTO() {
        given().`when`().get(CONSTS.GROUP_PATH).then()
            .statusCode(HttpStatus.SC_OK)
    }

    @Test
    @Epic("Example")
    @DisplayName("Example convert array to json and assert DTO")
    fun exampleConvertJsonToGroupProductDTO() {

//        val json="[{\"id\":1,\"name\":\"IT products\",\"parentId\":-1,\"isLast\":false},{\"id\":1,\"name\":\"IT products\",\"parentId\":-1,\"isLast\":false}]"
        val json="[{\"id\":1,\"name\":\"IT products\",\"parentId\":-1},{\"id\":1,\"name\":\"IT products\",\"parentId\":-1}]"

//        val response = get("/artwork");
        val httpRequest = given()
        val response: Response = httpRequest.get(CONSTS.GROUP_PATH)
        val jsonPathEvaluator = response.jsonPath()
//        val names:List<String> = jsonPathEvaluator.getList<String>("name")
//        assertEquals(6, names.size) // check count names
        val groups:List<GroupProductDTO> = jsonPathEvaluator.getList<GroupProductDTO>(".", GroupProductDTO::class.java);
//        val groups = jsonPathEvaluator.getList(".", List::class.java);
//        assertEquals(6, groups.size)
//        for (g in groups ) {
//            println(g)
//        }
//        given().`when`().get(CONSTS.GROUP_PATH).`as`<GroupProductDTO>()
//            .statusCode(HttpStatus.SC_OK)

//        class DtoForTest {
//            val id: Long = -1
//            val name: String = ""
//            val parentId: Long = -1
//
//            constructor() {
//            }
//        }

//        val mapper:ObjectMapper = ObjectMapper()
//        val groups = mapper.readValue(json, Array<GroupProductDTO>::class.java)
//        mapper.readValue(jsonString)
//
//        val readValues: Collection<GroupProductDTO> = mapper.readValue(
//            jsonString, object : TypeReference<Collection<GroupProductDTO?>?>() {}
//        )
//        val jsonPathEvaluator = get(CONSTS.GROUP_PATH).jsonPath();
////        val groups=jsonPathEvaluator.getList(".", List::class.java) // from Object value (token `JsonToken.START_OBJECT`)
//        val groups=jsonPathEvaluator.getList(".", TypeReference<Collection<GroupProductDTO?>?>())
//        assertEquals(2, groups.size)
    }

}