
/*
 * Any타입
 *  모든 타입의 값을 대입할 수 있는 최상위 타입
 *  Any 타입 변수에는 초기화 이후에도 어떤 종류의 값이든 대입이 가능
* */

fun main(args: Array<String>){

    /* Any 타입 변수 선언 */
    var anyValue: Any

    /* 대입 후 타입이 정해짐 */
    anyValue = 100

    /* ::class.simpleName으로 코틀린의 타입을 확인 할 수 있다. */
    println(anyValue::class.simpleName)

    // null은 못받음
//    anyValue = null;
}