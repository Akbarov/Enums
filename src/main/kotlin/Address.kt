/**
Creator: Zohidjon Akbarov
 */
fun main() {
    val sohibbek = Person("Sohibbek", Address(country = CountryEnum.UZBEKISTAN, region = RegionEnumUzb.ANDIJON))
    val ali = Person("Ali", Address(CountryEnum.KIRKIZISTAN, RegionEnumKir.JALOLOBOD))
    println(ali)
}

data class Person(val name: String, val address: Address)
data class Address(val country: CountryEnum, val region: Region)
enum class CountryEnum {
    UZBEKISTAN,
    KAZAKISTAN,
    KIRKIZISTAN,
    TAJIGISTAN,
    TURKMANISTAN
}
interface Region{
}
enum class RegionEnumUzb:Region {
    TASHKENT,
    NAMANGAN,
    ANDIJON
}
enum class RegionEnumKir:Region{
    OSH,
    BISHKEK,
    JALOLOBOD
}