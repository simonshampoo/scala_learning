
def nth[T](xs: List[T], idx:Int): Option[T] = {
  xs match {
    case Nil => None
    case y::_ if idx == 0 => Some(y)
    case _::ys => nth(ys, idx-1)
  }
}


println(nth((1 to 10).toList, 4))
    
