import scala.io.Source

def readFile(f:String):List[String] = {
  Source.fromFile(f).toList
}


println(readFile("input.txt"))

