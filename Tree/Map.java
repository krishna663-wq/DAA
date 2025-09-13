package Tree;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // HashMap<Integer,String> map=new HashMap<>();
        // map.put(1,"A");
        // map.put(2,"B");
        // map.put(3,"C");
        // map.put(4,"D");
        // map.put(5,"E");
        // map.put(6,"F");
        // map.put(7,"G");
        // map.put(8,"H");
        // System.out.println(map);


        // System.out.println(map.containsKey(10));
        int[] arr = {1,2,1,2,1,4,5,6,2,3,4,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int fre = map.get(arr[i]);
                map.put(arr[i],fre+1);
            }else
            map.put(arr[i], 1);
        }
        // System.out.println(map);
        int max=0,maxkey=0;
        for(int key:map.keySet()){
            // System.out.println(key+"->"+map.get(key));
            if(map.get(key)>max){
                max = map.get(key);
                maxkey = key;
            }
        }
        System.out.println(maxkey+"->"+max);
    }
}
