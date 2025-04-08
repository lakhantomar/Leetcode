class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char charS1 = s1.charAt(i);
            char charS2 = s2.charAt(i);

            if (map1.containsKey(charS1)) {
                if (map1.get(charS1) != charS2) {
                    return false;
                }
            } else {
                map1.put(charS1, charS2);
            }
            if (map2.containsKey(charS2)) {
                if (map2.get(charS2) != charS1) {
                    return false;
                }

            } else {
                map2.put(charS2, charS1);

            }
        }
        return true;
    }
}


                
           
        
        
    
