package Buildings

open class BaseBuildingMaterial2 {
    open val numberNeeded: Int = 1
}

class Wood2 : BaseBuildingMaterial2() {
    override val numberNeeded = 4
}

class Brick2 : BaseBuildingMaterial2() {
    override val numberNeeded = 8
}

class Building2<out T : BaseBuildingMaterial2>(private val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded2 = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("${actualMaterialsNeeded2} ${material::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial2> isSmallBuilding(building: Building2<T>) {
    if (building.actualMaterialsNeeded2 < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main() {
    val woodBuilding = Building2(Wood2())
    woodBuilding.build()
    isSmallBuilding(woodBuilding)
}