class Trainer ( val weapon: String,  val mode: String, val difficulty: String, val total_atk: Int){

    init {
        println("Welcome to the Trainer Camp")
        println("Here, I will train you personally")
        println("I'll be using $weapon and try to $mode you $total_atk times in $difficulty way")
    }

    constructor(): this("sword", "attack", "easy", 10){
        println("Default request")
    }




}