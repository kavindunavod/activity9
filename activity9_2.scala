import scala.io.StdIn
object activity9_2 {


  val categorize: Int => String = n =>
    if (n<0) {
      "Negative"
    } else if(n==0){
      "Zero"
    }
    else if(n>0 && n%2==0){
      "Even"
    }
    else{
      "Odd"
    }


  def main(args: Array[String]): Unit = {
    println("enter the number : ")
    var number = StdIn.readLine().toInt
    println("Given number is : " + categorize(number))

  }

}
