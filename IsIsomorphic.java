import java.util.HashMap;

public class IsIsomorphic {
    public static void main(String args[]){
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        //create two HashMaps to store characters of s & t
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i=0; i < sl; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //s to t mapping
            if(sMap.containsKey(sChar)){
                //if earlier mapped character of s is equal to t, if not return false --> breech
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else{
                sMap.put(sChar, tChar);
            }
            // t to s mapping
            if(tMap.containsKey(tChar)){
                //if earlier mapped character of t is equal to s, if not return false --> breech
                if(tMap.get(tChar) != sChar){
                    return false;
                }
            } else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

// TC : O(N)
//SC : O(1)