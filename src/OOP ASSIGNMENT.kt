fun main() {
var human=Human("Melante",9,27)
    println(human.name)
    println(human.age)
    println(human.weight)
    human.eat(20)
    println(human.weight)
    human.eat(12)
    println(human.weight)
println(human.speak("I love travelling"))
    human.birthday()
    var person=User("Lavington","Mugendi","lavignmendi@gmail.com",728422795,"MENDI")
    println(person.email)
    println(person.password)




}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(eatWeight: Int): Int {
        print("I am eating $eatWeight kgs of food.")
        weight = weight + eatWeight
        return weight
    }

    fun speak(speech: String): String {
        return speech
    }
    fun birthday(){
         age+=1
        println(age)

    }

    }
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String ){

}

