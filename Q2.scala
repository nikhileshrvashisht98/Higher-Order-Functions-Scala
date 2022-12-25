/*
Using Scala, write a class of your choice (not the Employee class that was discussed
in class). Include your name in this class so it is identifiable. Example: CarsSaber
The class must have at least two (2) fields and two methods/functions. Create two
instances (objects) of this class in the main. Using the object created, print the fields
and call the method/function at least once. Provide the code (textfile) and a
screenshot of your output with the code (on Scastie).
*/


// class NikhileshVashisht(x1: Int, x2: Int, y1: Int, y2: Int) 
class NikhileshVashisht(x1: Int, x2: Int, y1: Int, y2: Int)
{
  println("first co-ordinates are " + x1 + ","+y1)
  println("second co-ordinates are " + x2 + ","+y2)
  def DistanceFromOrigin(finalPoint: Int) = {
      var i: Int=0;
      for(i <- 1 to finalPoint)
        print(i + " ");
    // println(a+","+b)
  }
    // println("Distance from origin for the first co-ordinates is " + x1 + "," + y1);
    // println("Distance from origin for the second co-ordinates is " + x2 + "," + y2);
    
  def ArrayCall(arr: Array[Int]) ={
    
    for ( N <- arr )         
      println(N);
    

    }

  

}
object Main {
  def main(args: Array[String]): Unit = {
    var Instance1 = new NikhileshVashisht(7, 8, 6, 69); //first instance
    // var Instance1 = new NikhileshVashisht()
    // NikhileshVashisht.DistanceFromOrigin("a","b")
    Instance1.DistanceFromOrigin(40) //calling the function
    var arr = Array(1, 2, 3, 4, 5, 6, 7)
    Instance1.ArrayCall(arr) //calling the function
    var Instance2 = new NikhileshVashisht(-6,6,9,0); //second instance

  }
}