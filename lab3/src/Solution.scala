object Solution {
  val t = -4
  def sqrt(x: Double) = {
    if (x > 0) round(sqrtIter(1, x))
    else if (x == 0) 0
    else (round(sqrtIter(1, -x)) + "i")
  }
  def square(x: Double) = x * x
  def isGoodEnough(y: Double, x: Double) = Math.abs(square(y)-x) < (Math.pow(10,-2+t+Math.log10(x).toInt))
  def improve(y: Double, x: Double) = (y + x/y)/2.0
  def sqrtIter(y: Double, x: Double) : Double = {if(!isGoodEnough(y,x)) sqrtIter(improve(y,x),x) else y}
  def round(x: Double) = {
    val z: Double = ((Math.pow(10,-t + Math.abs(Math.log10(x).toInt))))
    Math.round(x * z) / z
  }
}
