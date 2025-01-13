package com.mee.classes

fun main(args: Array<String>) {

}

/* 함수를 정의하며 접근 제어자 설정(기본적으로 public) */
fun publicFunc() = println("public function")

/* private 접근 제어자를 붙인 함수는 같은 파일 내부에서만 사용이 가능하다. */
private fun privateFunc() = println("private function")

/* 변수를 정의하며 접근 제어자 설정 */
var publicVariable = "public variable"

/* private 접근 제어자를 붙인 변수는 같은 파일 내부에서만 사용이 가능하다. */
private val privateConstant = "private constant"