package kot


private var name1: String? = null
private var name2: String? = "12312312"
private var name3: String? = "2323232"

fun main() {
var length = (name1?.length?:0) + (name2?.length?:0) + (name3?.length ?:0)
        println(length)
}


