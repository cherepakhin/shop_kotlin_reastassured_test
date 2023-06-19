package ru.perm.v.shop_kotlin.restassured

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import ru.perm.v.shop_kotlin.restassured.dto.GroupProductDTO
import kotlin.test.assertEquals


class ConvertGroupProductJsonToObj {
    val mapper = ObjectMapper()

    @Test
    internal fun singleGroupProduct() {
        val groupsJson = GroupProductDTO::class.java.getResource("/groups.json")?.readText()
        // 1. Так читать из неправильного json с []
        // 2. Название поля "isLast" почему-то не распознается
        val groups: List<GroupProductDTO?>? = mapper.readValue(groupsJson, object : TypeReference<List<GroupProductDTO?>?>() {})
        groups?.let { assertEquals(2, it.size) }
    }

}