/**
 *  2022-02-15 15:00
 */
/**
 * kotlin中类和方法的参数,可以在创建类的时候指定
 * 不需要setXXX方法传入对象,如果不需要设定,采用默认值
 * 不需要java里面设置null和重载方法(或者构造器)来应对多种参数组合
 * 这也说明kotlin里面方法和类  类似 ,之所以去掉new,因为构造器也是一种方法,返回一个对象
 * 只不过类名一般首字母大写,当然你小写也没关系,只不过这样看起来构造器跟方法没区别了
 */
class Test(
    val int: Int,
    val str: String="ds",
    private val char: Char='c'){
    //类的参数,定义的时候要指明val,可以加访问修饰符
    fun pl(){
        println(int+ str.toInt() +char.toInt())
    }
}

fun funny(int: Int, str: String, char: Char='1') :Unit{
    println(int+str.toInt()+char.toInt())
    println(println())
}

fun main() {

    Test(int = 2, str = "345").pl()//默认参数可以不指定
    Test( str = "345", char = '2', int = 3).pl() //指定参数名时候,顺序无所谓
    Test(3,"23").pl()
    Test(4,"32123",'2').pl()

    funny(int = 3,char = '5',str = "342")
    println(2147483647+1)


}


