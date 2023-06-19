package ru.perm.v.shop_kotlin.restassured.dto

class GroupProductDTO(
    val id: Long = -1,
    val name: String = "",
    val haveChilds: Boolean = false,
    val parentId: Long = -1
) {

    override fun toString(): String {
        return "GroupProductDTO(id=$id, name='$name', parentId=$parentId, haveChilds=$haveChilds)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GroupProductDTO

        if (id != other.id) return false
        if (name != other.name) return false
        if (parentId != other.parentId) return false
        if (haveChilds != other.haveChilds) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + parentId.hashCode()
        result = 31 * result + haveChilds.hashCode()
        return result
    }
}