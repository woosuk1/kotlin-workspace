
/*
 * 타입 변환
 * toByte, toShort, toInt, toLong, toFloat, toDouble, toChar
 *
 * 코틀린에서는 자바에서와 달리 자동형변환이 적용되지 않으므로 항상 명시적 형변환을 해 주어야 한다.
* */

fun main(args: Array<String>){

    /* 타입을 변환할 변수 선언 */
    var byteValue: Byte = 65
    print(byteValue)

    /* Char 타입으로 변환. 65는 유니코드 번호로 문자 'A'에 대응되므로 charValue 변수에는 'A'문자 저장 */
    var charValue: Char = byteValue.toChar()
    println(charValue)

    /* 문자열을 기본 타입으로 변환 */
    var intString: String = "1234"
    var doubleString: String = "1.234"

    var stringToInt: Int = intString.toInt()
    var stringToDouble: Double = doubleString.toDouble()

    println(stringToInt)
    println(stringToDouble)

}