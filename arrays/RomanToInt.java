class RomanToInt {
    public int romanToInt(String s) {
        
       s = s.trim();
        int n = s.length();

        Map<Character, Integer> r = new HashMap<>();
        r.put('I',1);
        r.put('V',5);
        r.put('X',10);
        r.put('L',50);
        r.put('C',100);
        r.put('D',500);
        r.put('M',1000);
        int result = r.get(s.charAt(n-1));
        for(int i =n-2; i >=0 ;i--){
            int c = r.get(s.charAt(i));
            int d = r.get(s.charAt(i+1));
            if(c<d){
                result -= c;
            } else {
                result += c;
            }
        }

        return result;
    }
}
