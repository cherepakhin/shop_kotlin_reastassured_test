package ru.perm.v.shop_kotlin.restassured

class CONSTS {
    companion object {
        val HOST = "http://192.168.1.20:8780/api"
        val ECHO_PATH = HOST + "/echo/"
        val GROUP_PATH = HOST + "/group_product/"
        val PRODUCT_PATH = HOST + "/product/"
    }
}