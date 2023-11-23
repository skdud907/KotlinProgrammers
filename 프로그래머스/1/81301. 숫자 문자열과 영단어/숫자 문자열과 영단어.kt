class Solution {
    fun solution(s: String): Int {
        val numList = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        val charList = s.toCharArray()
        
        var answer = ""
        var currentNum = ""
        
        for (char in charList) {
            if (char.isDigit()) {
                // 이미 숫자인 경우
                answer += char
            } else {
                currentNum += char
                // 문자인 경우, numList에서 찾아서 추가
                for (i in numList.indices) {
                    if (currentNum in numList) {
                        answer += numList.indexOf(currentNum)
                        currentNum = ""
                        break
                    }
                }
            }
        }
               
        return answer.toIntOrNull() ?: 0
    }
}