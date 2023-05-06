package daisy.manmohan.singh.hello

private object evenOdd {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 123)
    { println(
      if(i%2 == 0 ) i else "Not even means its odd "+i
      )

    }
  }
}
