class Person {
  private var salary: Int = 0

  def getSalary: Int = salary
  def setSalary(newSalary: Int) = {
    salary = newSalary
  }
}


// usage of apply:
class Person2(Name: String, age: Int){
  def getName: String = Name
}
object Person2{
  def apply(Name: String, age: Int): Person2 = new Person2(Name, age)
}

object Main extends App{
  val mary = new Person()
  mary.setSalary(5000)
  println(mary.getSalary)

  //companion object with apply, no need of using new keyword
  var john = Person2("john", 20)
  var aaa = Person2("aaa", 20)
  println(aaa.getName)


// companion objects - for encapsulation, "static" methods

}
