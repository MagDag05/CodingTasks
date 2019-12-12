package hackerrank;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//public class test {

//@Test

//    public int solution(String S) {
//
//
//        int max =0;
//
//        Boolean flag = true;
//        Map<Character, Integer> stringHash = new HashMap<Character, Integer>();
//        for (char ch : S.toCharArray())
//            stringHash.put(ch, stringHash.containsKey(ch) ? (stringHash.get(ch)+1) : 1);
//
//        Set<Character> Keys = stringHash.keySet();
//
//        while(flag) {
//
//            for (char  key : Keys)
//            {
//                if(key =='B') {
//                    int val = stringHash.get(key);
//                    stringHash.get(key, val --);
//                    if(stringHash.get(key) <0) flag = false;
//                }
//
//                if(key =='A') {
//                    int val = stringHash.get(key);
//                    stringHash.get(key, val --);
//                    if(stringHash.get(key) <0) flag = false;
//                }
//                if(key =='L') {
//                    int val = stringHash.get(key);
//                    stringHash.get(key, val -2);
//                    if(stringHash.get(key) <0) flag = false;
//                }
//                if(key =='O') {
//                    int val = stringHash.get(key);
//                    stringHash.get(key, val -2);
//                    if(stringHash.get(key) <0) flag = false;
//
//                }
//                if(key =='N') {
//                    int val = stringHash.get(key);
//                    stringHash.get(key, val --);
//                    if(stringHash.get(key) <0) flag = false;
//
//                }
//            }
//            if (flag)
//                max++;
//
//            // write your code in Java SE 8
//        }
//        return max;
//    }}
//

