//프로그래머스 No.120814 피자 나눠 먹기 (1)

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 == 0){
            answer = n/7;
        }else if(n % 7 != 0){
            answer = n/7+1;
        }
        return answer;
    }
}
