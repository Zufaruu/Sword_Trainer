import kotlin.random.Random



fun main() {

    val enemy_attr = mapOf<String, Map<Int, String>>(
        "enemy_weapon" to mapOf<Int, String>(1 to "sword", 2 to "spear", 3 to "shield"),
        "mode"         to mapOf<Int, String>(1 to "defend",2 to "attack"),
        "atk_mode"     to mapOf<Int, String>(1 to "swing", 2 to "thrust"),
        "direction"    to mapOf<Int, String>(1 to "up", 2 to "down", 3 to "right", 4 to "left", 5 to "center")
    )

    val incoming_directions = List(10) { Random.nextInt(1, 6) }
    val incoming_atks = List(10) { Random.nextInt(1, 3) }

    incoming_atks.zip(incoming_directions).forEach{
        val incoming_atk = enemy_attr["atk_mode"]?.get(it.first)
        val incoming_direction = enemy_attr["direction"]?.get(it.second)
        
        println("$incoming_atk $incoming_direction")
        Thread.sleep(1000)
    }

}