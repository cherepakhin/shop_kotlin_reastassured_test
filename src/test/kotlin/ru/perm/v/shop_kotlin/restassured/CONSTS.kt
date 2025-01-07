package ru.perm.v.shop_kotlin.restassured

class CONSTS {
    companion object {
        val IP = System.getenv("SHOP_KOTLIN_IP") ?: "127.0.0.1:8980"
        val HOST = "http://"+IP +"/shop_kotlin/api"
        val ECHO_PATH = HOST + "/echo/"
        val GROUP_PATH = HOST + "/group_product/"
        val PRODUCT_PATH = HOST + "/product/"
        val LOG_PATH = HOST + "/log/"
    }
}