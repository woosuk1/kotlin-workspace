
/* when 표현식 */
fun main(args: Array<String>){

    /* 조건에 함수 반환값이나 직접 연산을 이용할 수도 있다. */
    var num = 2
    when(num) {
        1 -> println("One")
        (1.inc()) -> println("Two")     // inc()는 1 증가시키라는 의미로 1++과 같다.
        (1*3) -> println("Three")
        else -> println("No Match")
    }

    /* 블럭을 이용하여 여러 명령을 기술할 수도 있다. */
    when(num) {
        1 -> {
            println("Hello")
            println(num)
        }

        2 -> {
            println("world")
            println(num)
        }
    }

    /* 조건 처리한 결과를 반환 받을 수도 있다.*/
    var a = 10.0
    var b = 20.0
    var op = '+'
    var result: Double ?= when(op){
        '+' -> a + b
        '-' -> a-b
        '*' -> a *b
        '/' -> a/ b
        else -> null
    }

    println(result)

    /* 자료형에 따라 다르게 처리할 수 있다. */
    var x: Any = "Hello"
    x = 1234
    x = 'a'

    when(x){
        is String -> println(x.length) // is: 타입 확인 연산자
        is Int -> println(x * 2)
        is Double -> println(x.toInt())
        else -> println("No Match")
    }

    /* 범위객체를 사용하여 범위로 검색이 가능하다. */
    var score = 81
    var scoreResult = when(score){
        in 91..100 -> "A"
        in 81 .. 90 -> "B"
        in 71 .. 80 -> "C"
        else -> "D"
    }

    println(scoreResult)
}