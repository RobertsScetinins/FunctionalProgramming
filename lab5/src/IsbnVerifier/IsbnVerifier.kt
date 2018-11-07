package IsbnVerifier

class IsbnVerifier{

    fun isValid(isbn: String) : Boolean =
        isbn
            .matches(Regex("[0-9][-]?[0-9]{3}[-]?[0-9]{5}[-]?[0-9X]")) &&
        isbn
            .replace(Regex("-"), "")
            .reversed()
            .map{ x -> if(x == 'X' || x == 'x') 10 else x.toString().toInt() }
            .mapIndexed { index, value -> value * (index+1) }
            .sum() % 11 == 0


}
