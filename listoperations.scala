def transform(xs: List[Int]): List[String] = {
  xs match {
    case Nil => Nil
    case y::ys => 
        ("%02d".format(y)) :: transform(ys)
  }
}

// apply a function on each member of a List
def foreach [X](xs: List[X], f:X => Unit ): Unit = {
  xs match {
    case Nil => () 
    case y::ys => {
      f(y);
      foreach(ys, f)
    }
  }
}

def map [X, Y](xs: List[X], f:X=>Y): List[Y] = {
   xs match {
    case Nil => Nil 
    case y::ys => f(y) :: map (ys, f) 
   }
}

def filter [X](xs: List[X], f:X=>Boolean): List[X] = {
  xs match {
    case Nil => Nil
    case y::ys => if (f(y)) y::filter(ys, f) else filter(ys,f)
  }
}



var l = List(1, 2, 3, 4, 5)

println("## TRANSFORM ##")
println(l)
println(transform(l))


println()

println(s"## FOREACH ## with function println")
println(l)
foreach(l, (x: Int) => println(x))


println()


println("## MAP ## with function (x: Int) => x + 1")
println(l)
println(map(l, (x: Int) => x + 1))


println()


println("## FILTER ## with function (x:Int) => x % 2 == 0")
println(l)
println(filter(l, (x:Int) => x % 2 == 0))
