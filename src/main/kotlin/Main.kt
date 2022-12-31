fun main(args: Array<String>) {
    println("Menghitung Bangun Datar")
    val persegi = Persegi()
    println("=======================")
    println("MENGHITUNG PERSEGI")
    println(persegi.luas())
    println(persegi.keliling())

    println("========================")
    println("MENGHITUNG PERSEGI PANJANG")

}

open class BangunDatar(){
   open fun luas(){
    }

   open fun keliling(){
    }
}

class Persegi() : BangunDatar(){
    var sisi = 5
    override fun luas() {
        println("Menghitung Luan Persegi = ${sisi*2}")
    }

    override fun keliling() {
        println("Menghitung Keliling Persegi = ${sisi*4}")
    }
}

class PersegiPanjang() : BangunDatar(){
    var panjang = 7
    var lebar = 4

    override fun luas() {
        println("Menghitung luas Persegi Panjang = ${panjang*lebar}")
    }

    override fun keliling() {
        super.keliling()
    }

}