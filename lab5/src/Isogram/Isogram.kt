package Isogram

object Isogram{
    
    fun isIsogram(input: String): Boolean =
        !input
            .toLowerCase()
            .replace(Regex("[^\\w]"), "")
            .replace(Regex("\\s+"), "")
            .groupingBy{ it }
            .eachCount()
            .any {it.value > 1}


}
