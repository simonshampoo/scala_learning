//import scala.io.Source
//
//object Reader extends App {
//  if (args.length != 0) {
//    println("incorrect # of arguments") 
//    ()
//  }
//  if (!args(0).endsWith(".txt")) {
//    println("wrong file type, must be .txt")
//    ()
//  }
//
//  val fileName = args(0)
//
//}
//
//def readFile(f:String):List[String] = {
//  Source.fromFile(f).toList
//}
//
//
//println(readFile("input.txt"))
//

object MmlAlnApp {
  val usage = """
    Usage: mmlaln [--min-size num] [--max-size num] filename
  """
  def main(args: Array[String]) {
    if (args.length == 0) println(usage)
    val arglist = args.toList
    type OptionMap = Map[Symbol, Any]

    def nextOption(map : OptionMap, list: List[String]) : OptionMap = {
      def isSwitch(s : String) = (s(0) == '-')
      list match {
        case Nil => map
        case "--max-size" :: value :: tail =>
                               nextOption(map ++ Map('maxsize -> value.toInt), tail)
        case "--min-size" :: value :: tail =>
                               nextOption(map ++ Map('minsize -> value.toInt), tail)
        case string :: opt2 :: tail if isSwitch(opt2) => 
                               nextOption(map ++ Map('infile -> string), list.tail)
        case string :: Nil =>  nextOption(map ++ Map('infile -> string), list.tail)
        case option :: tail => println("Unknown option "+option) 
                               sys.exit(1) 
      }
    }
    val options = nextOption(Map(),arglist)
    println(options)
  }
}

