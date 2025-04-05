

fun main(args: Array<String>) {
    isValidIpv4("192.25.30.5")
}

fun isValidIpv4(ip: String): Boolean {

    if (ip.isEmpty()) return false

    val segments = ip.split(".")

    if (segments.size > 4 || segments.size < 4 ) return false

    segments.forEach { segment ->
        if (segment.isEmpty() || segment.length > 3) return false
        val char = 'a'..'z'
        if (segment.all { it in char }) return false

        if (segment.toInt() > 255 || segment.toInt() < 0) return false
        if (segment.startsWith("0") && segment.length > 1) return false

    }

    return true
}