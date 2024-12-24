package com.mee.basic

/* 설명.
 *  코를린 - 가독성 좋은 짧은 코드 작성을 지향한다.(feat. null에 민감)
 *  코틀린 파일의 특징
 *  1-1. 자바와 달리 코틀린은 클래스가 반드시 선언 될 필요가 ㅇ벗으며 소스파일명과 클래스명이 달라도 된다.
 *  1-2. 기본적으로는 package, import, class로 구성되지만 다양한 순서 및 갯수로 구성하고자 하면 따로 정해진 규칙은 없다.
 *  1-3. main 메소드에 매개변수(소괄호)를 주지 않아도 잘 동작한다.
* */

fun main(args: Array<String>){

    /* 콘솔에 출력하기 위해서는 print()나 println()을 사용한다. */
    /* 세미콜론은 적어도 에러는 안나지만 kotlin에서는 사용하지 않는 것이 일반적이고 한 문장에 여러 문장 작성 시 주로 사용한다. */
    println("Hello, Kotlin!!")
    print("코틀린 시작!")

    var completion = readLine()
    println("D-" + completion)
}

/*
    여러 줄 주석을 중첩해서 사용 가능
    /*

    */
*/