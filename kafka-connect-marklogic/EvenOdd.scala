object Evenodd  {
def main (args:Array[String])
{

def Even (number : Int) = number % 2 == 0
def Odd (number : Int) = !Even(number)

val numList = List.range(0 , 10)

for (n <- numList) {
print(n);
if (Even(n)) {
println(” Even “);
}
if (Odd(n)) {
println( ” Odd ” );

}
}
}
}