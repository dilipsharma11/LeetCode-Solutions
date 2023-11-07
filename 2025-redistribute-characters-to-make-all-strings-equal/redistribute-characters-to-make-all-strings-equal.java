class Solution {
    public boolean makeEqual(String[] words) {
        int n= words.length;
        Map<Character, Integer> map = new HashMap<>();
        for(String word : words){
            for(Character ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()%n!=0) return false;
        }

        return true;
    }
}