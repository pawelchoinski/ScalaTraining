object HackerRank extends App {
  def hello = println("Hello World")

  def f(n: Int) = 1 to n foreach (_ => println("L"))

  var n = 10
  f(n)

  //Given a list, repeat each element in the list  amount of times
  def f(num: Int, arr: List[Int]): List[Int] = {
    arr.flatMap(i => List.fill(num)(i))
  }

  var arr = List(1, 2, 3, 4, 5)
  println(f(3, arr))

  val z = List.fill(5)(4)
  //val w = arr.map(x => List.fill(4)(x))
  //val w = arr.flatMap(x => List.fill(4)(x)) is equal bellow:
  val w = arr.flatMap(List.fill(4)(_))
  println(w)
}
