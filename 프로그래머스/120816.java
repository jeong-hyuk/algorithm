//프로그래머스 No.120816 피자 나눠 먹기 (3)

class Solution {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
