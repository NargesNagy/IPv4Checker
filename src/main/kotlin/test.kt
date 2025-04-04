
fun main() {

    test(
        name = "when an IPv4 is valid return true",
        isValidIpv4("192.168.1.1"),
        correctResult = true
    )

    test(
        name = "when an IPv4 is valid return true",
        isValidIpv4("192.0.1.0"),
        correctResult = true
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("192.168.1.1.0"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("192.012.1.1"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("192.168.-1.1"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("192.168.1.256"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is valid return true",
        isValidIpv4("172.16.254.1"),
        correctResult = true
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("09.168.1.1"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("05.168.1.01"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("192.168.1"),
        correctResult = false
    )

    test(
        name = "when an IPv4 is not valid return false",
        isValidIpv4("ad.168.1"),
        correctResult = false
    )

}


fun test(name: String, result: Boolean, correctResult: Boolean){
    if(result == correctResult){
        println("Success $name $result")
        return
    }
    println("Fail $name $result")
}

fun isValidIpv4(ip: String): Boolean{
    return false
}