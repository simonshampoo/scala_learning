def transform(xs: List[Int]): List[String] = {
  xs match {
    case Nil => {
      println("found nil") 
       Nil
    } 
    case y::ys => {
        println(s"calling transform on $y") 
        "%02d".format(y) :: transform(ys)
    }
  }
}


def foreach(xs: List[Int], f:Int => Int) : Unit = {
  xs match {
    case Nil => ()
    case y::ys => {
      f(y)
      foreach(ys, f)
    }
  }
}

var l = List(1, 2, 3, 4, 5)
var consList = 1 :: (2 :: (3 :: Nil))


println(consList)
transform(consList)
println(consList)
