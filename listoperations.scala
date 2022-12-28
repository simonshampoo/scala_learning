def transform(xs: List[Int]): List[String] = {
  xs match {
    case Nil => 
       Nil
    case y::ys => 
        ("%02d".format(y)) :: transform(ys)
  }
}

// apply a function on each member of a List
def foreach [X](xs: List[X], f:X => Unit ): Unit = {
  xs match {
    case Nil => Nil 
    case y::ys => {
      f(y)
      foreach(ys, f)
    }
  }
}

def map [X, Y](xs: List[X], f:X=>Y): List[Y] = {
   xs match {
    case Nil => Nil 
    case y::ys => 
      f(y) :: map (ys, f)
  }
}


var l = List(1, 2, 3, 4, 5)

println("Testing transform function")
println(l)
transform(l)
println(l)
println(l(0).getClass)


println()


println("Testing foreach function")
println(l)
foreach(l, (x: Int) => println(x))
println(l)


println()


println("Testing map function")
println(l)
val newL = map(l, (x: Int) => x + 1)
println(newL)
