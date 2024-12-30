
/* 배열 및 mutableMap 선언하기 */
fun main(args: Array<String>){

    /* 인덱스 연산자 사용 */
    var nums = arrayOf(100,101,102)

    println("nums[0]: ${nums[0]}") // {} 씌운 것은 value를 뽑기 위함. 없으면 주소값
    println("nums[0]: $nums[0]") // {} 씌운 것은 value를 뽑기 위함. 없으면 주소값

    nums[1] = 200
    println(nums[1])

    /* mutableMap 잠시 살펴보기 */
    var areaCodeMap = mutableMapOf("02" to "서울", "055" to "경남")

    println(areaCodeMap["02"]) //java와 달리 그냥 인덱스로 접근 가능하다~

    areaCodeMap["051"] = "부산"

    println(areaCodeMap["051"])
}