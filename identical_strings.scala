
import scala.collection.mutable.HashMap

object str extends App {

  def foo(string_1: String, string_2: String): Boolean = {
    val L1 = string_1.toList
    val L2 = string_2.toList
    var hashMap = new HashMap[Char, Int]()
    for (i <- L1)
    {
      var count: Int = hashMap.getOrElse(i, 0)
      if (count == 0) {
        hashMap.put(i, 1)
      }
      else
      {
        hashMap.put(i, (count + 1))
      }
    }
    for (i <- L2)
    {
      var count: Int = hashMap.getOrElse(i, 0)
      if (count == 0)
      {
        return false
      }
      else
      {
        hashMap.put(i, (count - 1))
      }
    }
    for (i <- hashMap.values)
      {
        if (i != 0)
          {
            return false
          }
      }
      true
  }

  val string_1 = "aabbcc"//
  //val string_2 = "aabbcc"
  //val string_2 = "acbcba"
  val string_2 = "snfgs"
  println(foo(string_1,string_2))
}
