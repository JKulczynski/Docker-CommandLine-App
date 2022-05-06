import java.io.File

object Main extends App {
def getListOfFiles(dir:String):List[String] = {
  val file = new File(dir)
  file
    .listFiles
    .filter(_.isFile)
    .map(_.getName)
    .toList
}
  println(getListOfFiles(args(0)))
}
