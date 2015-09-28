class CheckCustomRuleScala (val str:String){
  def foobar() : String ="scalastyle"+str
    val custchk = new CheckCustomRuleScala("custom rules testing !!!!!!!")
    println(custchk.foobar())
}
