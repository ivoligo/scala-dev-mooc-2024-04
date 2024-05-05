package ru.otus.module1

object functions {


  /**
   * Функции
   */



  /**
   * Реализовать метод  sum, которая будет суммировать 2 целых числа и выдавать результат
   */

    def sum(x: Int, y: Int): Int = x + y


    val r1: Int = sum(2, 3) // 5


    val sum2: (Int, Int) => Int = (a, b) => a + b


    val r2 = sum2(2, 3) // 5

    val sum3: (Int, Int) => Int = sum

     sum3(2, 3) // 5

  // Partial function

  val divide: PartialFunction[(Int, Int), Int] = {
    case x if x._2 != 0 => x._1 / x._2
  }


   val ll = List((4, 2), (5, 0), (6, 2))
   val ll2: List[Int] = ll.collect(divide)



  // SAM Single Abstract Method

  trait Printer{
    def print(str: String): Unit
  }

  val p: Printer = str => println(str)



  /**
   *  Задание 1. Написать ф-цию метод isEven, которая будет вычислять является ли число четным
   */

  def isEven(x:Int): Boolean = if (x % 2 == 0) true else false

  // почему не дает написать через val (подчеркивает параметр x)
  // val isEven: Int => Boolean = if (x % 2 == 0) true else false
  /**
   * Задание 2. Написать ф-цию метод isOdd, которая будет вычислять является ли число нечетным
   */

  def isOdd(x:Int): Boolean = if (x % 2 != 0) true else false

  /**
   * Задание 3. Написать ф-цию метод filterEven, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются четными
   */

  def filterEven(arr: Array[Int]): Array[Int] = for (elem <- arr if (elem % 2 == 0) ) yield elem

  /**
   * Задание 4. Написать ф-цию метод filterOdd, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются нечетными
   */

  def filterOdd(arr: Array[Int]): Array[Int] = for (elem <- arr if (elem % 2 != 0) ) yield elem

  /**
   * return statement
   *
   */
}