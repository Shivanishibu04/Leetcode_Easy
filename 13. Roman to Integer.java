class Solution {
    public int romanToInt(String s) {
        int n = s.length(), curr, prev;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num = map.get(s.charAt(0));
        for (int i = 1; i < n; i++) {
            curr = map.get(s.charAt(i));
            prev = map.get(s.charAt(i - 1));
            if (curr > prev) {
                num += curr - 2 * prev;
            } else {
                num += curr;
            }
        }

        return num;
    }
}
