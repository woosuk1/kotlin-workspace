package com.meee.inheritance

/* 다형성 */
open class Parent(var parentProp: Int){
    fun parentFunc() {
        println("parentFunc")
    }
}

class Child(prop: Int, var childProp: Int) : Parent(prop) {
    fun childFunc() {
        println("${super.parentProp}")
        super.parentFunc()
        println("childFunc")
    }
}

fun main(args: Array<String>) {
    var p = Parent(2)
    println("${p.parentProp}")
    var c = Child(1,2)
    println("${c.parentProp}, ${c.childProp}")

    var poly: Parent = Child(3,4)
    poly.parentFunc()       // Parent 타입으로 인지된 공간(upcasting 됨)

//    poly as Child       // 코틀린에서 형변환은 as 키워드를 사용한다.
//    poly.childFunc()

    if(poly is Child){  // is는 java의 instanceof와 같은 연산자이다.(+다운 캐스팅도 해줌!)
        poly.childFunc()
        println("${poly.parentProp}, ${poly.childProp}")
    }
}