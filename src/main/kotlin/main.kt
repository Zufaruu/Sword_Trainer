import kotlin.random.Random

fun main() {
    var weapon = mapOf<Int, String>(1 to "sword", 2 to "spear", 3 to "shield")
    var mode   = mapOf<Int, String>(1 to "defend",2 to "attack")
    var atk_mode = mapOf<Int, String>(1 to "swing", 2 to "thrust")
    var direction = mapOf<Int, String>(1 to "up", 2 to "down", 3 to "right", 4 to "left", 5 to "center")

    val incoming_directions = List(10) { Random.nextInt(1, 6) }
    val incoming_atks = List(10) { Random.nextInt(1, 3) }

    incoming_atks.zip(incoming_directions).forEach{
        var incoming_atk = atk_mode[it.first]
        var incoming_direction = direction[it.second]
        println("$incoming_atk $incoming_direction")
    }

//    print(direction.size)
//    println(randomValues)


}