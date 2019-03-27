import scala.util.{Failure, Success}

class NullChecks_ErrorHandling {

}

object Main2 extends App {
  val emp = Set("John", "Sam", "Amy")

  //option returns Some("...") or None
  val john = emp.find(x => x == "John")
  val sam = emp.find(_ == "Saam")
  println(john)
  println(sam)


  println(john.get)
  //println(sam.get)

  //instead of using if(x !Null) checks:
  println(john.getOrElse("emp not found"))
  println(sam.getOrElse("emp not found"))



  // Try
  import scala.util.Try
  val outcome = Try(10/0)
  println(outcome)
  println(outcome.isFailure)

  outcome match {
    case Failure(exception) => println("computation failed " + exception.getMessage)
    case Success(value) => println("OK")
  }

  //either: returns Left or Right val
  def stringToInt(in: String): Either[String, Int] ={
    try {
      Right(in.toInt)
    } catch {
      case exception: NumberFormatException => Left("Error" + exception.getMessage)
    }
  }
  println(stringToInt("5"))
}
