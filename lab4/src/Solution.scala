object RTUSet {
  /**
    * We define a set by its characteristic function
    */
  type Set = Int => Boolean

  /**
    * If  a set contains an element.
    */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
    * Singleton set from one element
    */
  def singletonSet(elem: Int): Set = Set(elem)

  /**
    * Union of the two sets
    */
  def union(s: Set, t: Set): Set = (x : Int) => s(x) || t(x)

  /**
    * Intersection of the two sets
    */
  def intersect(s: Set, t: Set): Set = (x : Int) => s(x) && t(x)

  /**
    * Difference of two given sets
    */
  def diff(s: Set, t: Set): Set = (x : Int) => s(x) && !t(x)

  /**
    * Filter
    */
  def filter(s: Set, p: Int => Boolean): Set = intersect(s, p)

  /** =========== For brave enough =========== */


  val bound = 1000

  /**
    * if  all bounded integers within s satisfy p
    */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) true
      else if (s(a) && !p(a)) false
      else iter(a + 1)
    }
    iter(-bound)
  }


  def exists(s: Set, p: Int => Boolean): Boolean = !forall(s, !p(_))

  // Argument map
  def map(s: Set, f: Int => Int): Set = (x: Int) => s(f(x)) 

  // Set's internal map
  def mapSet1(s: Set, f: Int => Int): Set = {
    def iter(a: Int): Set = {
      if (a > bound) Nil
      else if(contains(s,a)) union(singletonSet(f(a)), iter(a + 1))
      else iter(a + 1)
    }
    iter(-bound)
  }

  // Set's internal map
  def mapSet2(s: Set, f: Int => Int): Set = (x: Int) => !forall(s, f(_) != x) 

  /**
    * Displays the contents of a set
    */
  def toString(s: Set): String = {
    def iter(a: Int): String = {
      if (a > bound) ""
      else if(contains(s,a)) (a + "," + iter(a+1))
      else iter(a + 1)
    }
    var str : String = iter(-bound)
    if(str.length > 0) str = str.substring(0,str.length()-1)
    "{" + str + "}"
  }


}
