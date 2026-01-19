import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            //sorting character array and get String back
            char [] charArr = curr.toCharArray(); ////Breaks the string "eat" into individual characters and stores in charArr -- ['e', 'a', 't']
            Arrays.sort(charArr); //'e', 'a', 't'} → {'a', 'e', 't'}
            String sorted = String.valueOf(charArr); //converts character array to string "aet"
            //if map contains sorted, if not then add sorted string initiate with a new arraylist
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>()); //map = {"aet" : []} creates new empty list
            }
            //get list of all Strings
            List<String> li = map.get(sorted);
            li.add(curr); //add to list
            map.put(sorted,li);//add to map
        }
        return new ArrayList<>(map.values());
    }
}

//TC: O(N KlogK)
//SC: O(NK)