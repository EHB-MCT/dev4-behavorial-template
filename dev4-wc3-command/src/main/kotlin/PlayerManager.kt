import kotlin.random.Random

class PlayerManager {
    var alive = true;
    var player = mapOf("x" to 0, "y" to 0)
    lateinit var bomb : Map<String, Int>

    init {
        randomBomb()
    }

    fun randomBomb() {
        val x = Random.nextInt(0, 4)
        val y = Random.nextInt(0, 4)
        if(x !== player["x"] && y!== player["y"]) {
            bomb = mapOf("x" to x, "y" to y)
        } else {
            randomBomb()
        }
    }

    fun checkPlayer() {
        if(player["x"] == bomb["x"] && player["y"] == bomb["y"]) {
            alive = false
        } else if(player["x"]!! < 0 || player["x"]!! > 4) {
            alive = false
        } else if(player["y"]!! < 0 || player["y"]!! > 4) {
            alive = false
        }
        if(!alive) {
            println("Game over!")
        }
    }
}