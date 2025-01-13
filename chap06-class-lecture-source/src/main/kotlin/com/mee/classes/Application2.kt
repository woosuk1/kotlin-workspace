package com.mee.classes

/* 생성자에 따른 클래스 정의 방법 */
/* 1. 생성자가 없는 클래스 */
class Person1 {
    var name: String = "홍길동"
    var age: Int = 10
}

/* 2. 주 생성자가 포함된 클래스
  (val은 읽기 전용으로 하겠다는 의지,, var은 움직임~)
*/
class Person2(val name: String, var age: Int, val gender: String){

}

/* 3. 주 생성자를 통해서 값만 전달 받는 클래스 */

/* 4. 주 생성자에 기본값이 설정된 클래스 */

fun main(args: Array<String>) {
    var p1 = Person1()
    println("${p1.name}, ${p1.age}")

    var p2 = Person2("홍길동", 20, "남성")
    println("${p2.name}, ${p2.age}, ${p2.gender}")
}