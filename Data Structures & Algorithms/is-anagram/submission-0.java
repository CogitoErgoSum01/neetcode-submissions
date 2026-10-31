

class Solution {
    public boolean isAnagram(String s, String t) {
        char array[]=s.toCharArray();
        char array1[]=t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(array1);
        if(Arrays.equals(array, array1)){
            return true;
        }
        return false;
    }
}
