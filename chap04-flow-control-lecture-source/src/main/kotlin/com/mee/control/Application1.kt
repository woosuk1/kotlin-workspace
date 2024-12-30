
/* if-else 1 */
fun main(args: Array<String>){

    /* until ~까지(미만)를 의미한다. */
    var score = 70

    var grade: String? = null

    if(score == 100 || score in 90 until 100){
        grade = "A"
    }

    println("grade: ${grade ?: "F"}")
}