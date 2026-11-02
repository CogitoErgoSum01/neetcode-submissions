
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr =str.toCharArray();
            Arrays.sort(arr);
            String string = new String(arr);
            if(!map.containsKey(string))
            {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(string, list);
               
                
            }
            else{
                 
                map.get(string).add(str);
            }
        }
        return new ArrayList<>(map.values());

            
            

        
        
    }
}
