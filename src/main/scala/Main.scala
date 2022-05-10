import java.io.File

object Main extends App {
  def getListOfFiles(dir: String) = {
    val file = new File(dir)

    if (file.exists && file.isDirectory) {
      file
        .listFiles
        .filter(_.isFile)
        .map(_.getName)
        .toList
        .foreach(println)
    }
    else List[File]
  }

  println(getListOfFiles(args(0)))
}
