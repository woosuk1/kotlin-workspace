

fun main(args: Array<String>){
    /* break */
    while(true){
        print("'b'를 입력하여 break 명령어를 실행 : ")
        var input = readLine()?.trim()
        if(input != null){
            if(input == "b"){
                println("break 명령어를 이용하여 반복문을 탈출")
                break
            } else{
                println("${input}을 입력")
            }
        }
    }
}