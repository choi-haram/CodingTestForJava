// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public double solution(int[] numbers) {
        int arr_num = numbers.length;
        double answer = 0;
        for(int i=0; i<arr_num; i++){
            answer = answer+numbers[i];
        }
        return answer/arr_num;
    }
}
