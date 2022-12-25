/*
Create another class and write at least 2 functions where at least one function is a
higher order function – ie this function takes a function as a parameter. Your higher
order function should do something useful as demonstrated in the class example.
Just a higher order function that take in a function as a parameter but does nothing
the input or does something trivial.
*/

// class NikhileshHighOrder
// {  
//   def apply(f: Int => String, v: Int) = f(v)

//   def layout[A](x: A) = "[" + x.toString() + "]"
//   def multipleFunctionCall(f: Int => Int, n : Int) : Int => Int = 
//   {
//     if (n <= 0) (x: Int) => x
//     else (x: Int) => multipleFunctionCall(f, n-1)(f(x))

//   }
//   val singlefunctionCall = (x: Int) => x + 1
// }


class NikhileshVashishtHOF 
{
  def SquareOf(value:Int):Int=value*value
  def DoubleOfSquare(value:Int):Int=2*value*value
  def HigherOrderFunctionDemo(start:Int,End:Int,f:Int=>Int): Unit=
  {
  for(i<-start to End)
    println(f(i))
  }
  println("Square of the number in the range 20 to 26Ṁ88amp using higher order functions")
  print(HigherOrderFunctionDemo( start=20, End=26,SquareOf))
  println("Double of Square of the number in the range 20 to 26 using higher order functions")
  println(HigherOrderFunctionDemo( start=20, End=26,DoubleOfSquare))
}


object HOFDemo {
   def main(args: Array[String])= {
     val in1 = new NikhileshVashishtHOF()
     print(in1)
     /*val in1 = new NikhileshHighOrder()
      // println( in1.apply(in1.layout, 10) )
     
     val f4 = in1.multipleFunctionCall(in1.singlefunctionCall, 4)
     print(f4)*/
   }
}