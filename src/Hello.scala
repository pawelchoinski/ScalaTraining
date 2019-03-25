case class Fruit(name: String)

object Hello extends App {
  println("TST")
  val funct= (a: Int) => {
    a*a
  }
  println(funct(8))

  //function:
  def plusOneOrZero(n: Int): Int = {
    if (n < 0) 0
    else n + 1
  }

  //lambda:
  val plusOne = (x: Int) => x + 1
  println(plusOne)


  val apple = Fruit("apple")
  val orange = Fruit("orange")
  val kiwi = Fruit("kiwi")

  val fruitBasket = List(apple, orange, kiwi, kiwi, apple, kiwi, orange)
  println(fruitBasket)

  // higher order functions:
  //the same output
  println(fruitBasket.filter((fruit: Fruit) => fruit.name == "apple")) // filter(lambda)
  println(fruitBasket.filter(x => x.name == "apple"))
  println(fruitBasket.filter(_.name == "apple"))
}



