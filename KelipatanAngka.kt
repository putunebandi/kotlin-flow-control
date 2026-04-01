fun main() {
    val awal = 1
    val akhir = 100

    for (i in awal..akhir) {
        
        if (i % 3 == 0 && i % 5 == 0) {
            println("$i -> Kelipatan 3 dan 5")
        } else if (i % 3 == 0) {
            println("$i -> Kelipatan 3")
        } else if (i % 5 == 0) {
            println("$i -> Kelipatan 5")
        }
        
    }
}
