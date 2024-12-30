
/* 함수의 인자 */
fun main(args: Array<String>){
    println(sumWithDefault())       //초기 세팅된 변수값 대로 진행
    println(sumWithDefault(11))     // a 매개변수만 수정됨
    println(sumWithDefault(20,30))     // a 와 b 둘다 수정
    println(sumWithDefault(b =30))     // b 매개변수만 수정

    println(sumWithDefault2(5)) // a 매개변수는 요구
}

/* 모든 인자값에 기본값이 적용된 함수 */
fun sumWithDefault(a: Int = 10, b: Int = 20): Int {
    return a + b
}

fun sumWithDefault2(a: Int, b: Int = 20): Int {
    return a + b
}