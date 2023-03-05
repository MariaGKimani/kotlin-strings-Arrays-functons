fun main(){
   details()
    var people= person("Ashly", 30)
    println(people)
    para(8)
    para(2)
    para(7)
    var x =  arr(arrayOf(3,52,7,18,23))
    gram()
   var person = Human("Maria","Female", "Blue",45,67)
    person.rest()
    person.identity()
}
fun details(){
    var info = "mar"
    println(info[2])
   for (i in info){
        println(i)
       println(info.length)
}

}
fun person(name: String, age:Int): String{
    return "Hi my name is $name and i am $age years old"

}
fun para(n: Int){
    if (n ==7){
        println("neutral")
    }else if(n != 7){
        println("base")
    }else{
        println("Acidic")
    }
}
fun arr(m: Array<Int>){
    println(m.max())
}
fun gram(){
    var namesss = arrayOf("anitab", "adalab", "hopperlab", "rwanda", "kenya", "tanzania")
    println(namesss.sortedArray().contentToString())
}
class Human(var nam: String,var gender: String, var color: String,var height: Int,var weight: Int){
    fun rest(){
        println("sleep 8hours")
        println("I am female")
    }
    fun identity(){
        println("My name is Maria Kimani")
    }
}
data class Book (val author: String, val title: String , val pages: Int,val publishdyear: Int)
