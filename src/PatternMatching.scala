class PatternMatching {

}


object Main3 extends App{
  val n = 5
  val y = n match {
      case 0 => "zero"
      case 5 => "five"
      case 9 => "nine"
  }
  println(y)

  val z = 99
  val w = z match {
    case 0 => "zero"
    case 5 => "five"
    case 9 => "nine"
    case _ => "nothing matched"
  }
  println(w)
}