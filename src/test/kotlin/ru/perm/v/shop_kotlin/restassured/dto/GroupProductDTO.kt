package ru.perm.v.shop_kotlin.restassured.dto

data class GroupProductDTO(
    val id: Long = -1,
    val name: String = "",
    val parentId: Long = -1
//    val isLast: Boolean = false
) {
    constructor() : this(-1, "", -1) {
    }
}