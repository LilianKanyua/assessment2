fun main(){

var firstString=FirstString("Heaven")
    println( firstString.firstCharacter())
    println(firstString.stringLength())
    println(firstString.beginsWithVowel())


    multiples(1..1000);

    var accountOne=CurrentAccount(24566777,"Equity",120000.00)
    accountOne.deposit(30000.00)
    accountOne.withdraw(10000.00)

    var savingsAccounts=SavingsAccounts(6777888,"Absa",50000.00,2)
    savingsAccounts.withdraw(20000.00)

    var savingsAccountsTwo=SavingsAccounts(77678778,"Absa",40000.00,5)
    savingsAccountsTwo.withdraw(5000.00)

}
//Question one
class FirstString(var myString: String){

    fun firstCharacter():Char{
        return myString[0]
    }
//    fun lastCharacter():Char{
//
//    }
    fun stringLength():Int{
        return myString.length
    }
    fun beginsWithVowel():Boolean{
        var vowels= "a,e,i,o,u"
        for (vowel in vowels){
            if(vowel==myString[0]){

            }

        }
        return true
    }
}
//Question two
fun strongPassword(password:String):Boolean{
  if(password.length <8 && password.length>16){

  }
}

//Question3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000.For
//multiples of both 6 and 8 it should print out “Bingo!”

fun multiples(nums:IntRange){
    for(num in nums){
        if(num%6==0 && num%8==0){
            println("Bingo!")
        }
        else if(num%6==0){
            println(num)
        }
        else if (num%8==0){
            println(num)
        }
    }
}

//Question four

open class CurrentAccount(var accountNumber:Int, var accountName:String, var balance:Double){
    fun deposit(amount:Double){
 balance+=amount
        println(balance)
    }
    open fun withdraw(amount: Double){
balance-=amount
        println(balance)
    }
    fun details(){
        println("Acount number $accountNumber  with balance $balance is operated by $accountName")
    }
}

//Question five

class SavingsAccounts(accountNumber: Int, accountName: String,  balance: Double,var withdrawals
:Int):CurrentAccount(accountNumber,accountName,balance){
   override fun withdraw(amount:Double){
        if(withdrawals<4){
            withdrawals++
            println("Your withdrawal has been successful")
        }
       else{
           println("You have reached the maximum withdrawal limit for this year")
        }
    }
}