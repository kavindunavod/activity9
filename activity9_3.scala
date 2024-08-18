object activity9_3 {
  // Method to convert a string to uppercase
  def toUpper(str: String): String = {
    str.toUpperCase
  }

  // Method to convert a string to lowercase
  def toLower(str: String): String = {
    str.toLowerCase
  }

  // Method to apply a given format to a name
  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper)) // Output: BENNY
    println(formatNames("Niroshan", str => { // Custom formatting: First 2 letters uppercase, rest lowercase
      val firstPart = str.substring(0, 2).toUpperCase
      val secondPart = str.substring(2).toLowerCase
      firstPart + secondPart
    }))
    println(formatNames("Saman", toLower)) // Output: saman
    println(formatNames("Kumara", str => { // Custom formatting: Last letter uppercase, rest lowercase
      val lastPart = str.takeRight(1).toUpperCase
      val firstPart = str.dropRight(1).toLowerCase
      firstPart + lastPart
    }))


  }

}
