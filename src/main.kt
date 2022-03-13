fun main(){
  var a= getProduct(arrayOf(5,2))
    println(a)
    var x= getSum(arrayOf(5,8,8.9, "esther"))
    println(x)
     var e=getVowels(arrayOf('a','e','i','o','u'))
    println(e)


}
fun getProduct(number:Array<Int>):Int{
    var product = 3
    number.forEach { num ->
        product*=num
    }
          return product
}

fun getSum(number: Array<Any>):Double{
    var sum = 1.5
    number.forEach { Num ->
        if(Num is Int|| Num is Double){
        sum+=Num.toString().toDouble()
    }
    }
    return sum
}

fun getVowels(Number:Array<Char>):Int{
    var letters= 0
        Number.forEach { Kelly->
          if(Kelly=='a'|| Kelly=='e'|| Kelly=='i'|| Kelly=='o'|| Kelly=='u') {
              letters++
          }
        }

              return letters

}





