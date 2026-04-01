fun main() {
    val umur = 1337

    print("Umur $umur tahun -> ")

    if (umur in 6..12) {
        println("Kategori Anak-anak") 
        
    } else if (umur in 13..16) {
        println("Kategori Remaja")
        
    } else if (umur in 17..100) {
        println("Kategori Dewasa")
        
    } else {
        println("Kategori Sakti Maksimal")
    }
}
