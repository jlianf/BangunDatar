fun main(args: Array<String>) {
    println("Menghitung Bangun Datar")
    val persegi = Persegi()
    val persegiPanjang = PersegiPanjang()
    val segitiga = Segitiga()

    println("=======================")
    println("MENGHITUNG PERSEGI")
    persegi.luas()
    persegi.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG PERSEGI PANJANG")
    persegiPanjang.luas()
    persegiPanjang.keliling()
    println("=======================")

    println("=======================")
    println("MENGHITUNG Segitiga")
    segitiga.luas()
    segitiga.keliling()
    println("=======================")

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
        println("Menghitung Keliling Persegi Panjang = ${2*(panjang*lebar)}")
    }

}
class Segitiga() : BangunDatar() {
    val tinggi = 4
    val alas = 5
    val sisi3 = 2

    override fun luas() {
        println("Menghitung Luas Segitiga = ${2/(alas*tinggi)}")
    }

    override fun keliling() {
        println("Menghitung Keliling Setigita = ${tinggi+alas+sisi3}")
    }
}