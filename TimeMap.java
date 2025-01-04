import java.util.HashMap;
import java.util.ArrayList;

class TimeMap {
    HashMap<String, ArrayList<Integer>> mapKey;
    HashMap<Integer, String> mapTime;
    public TimeMap() {
        mapKey = new HashMap<>();
        mapTime = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mapKey.containsKey(key)) {
            mapKey.put(key, new ArrayList<>());
        }
        mapKey.get(key).add(timestamp);
        mapTime.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        int max = -1;
        if (mapKey.containsKey(key)){
            ArrayList<Integer> list = mapKey.get(key);
            int start = 0;
            int end = list.size() - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (list.get(middle) <= timestamp) {
                    max = Math.max(max, list.get(middle));
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        }
        else {
            return "";
        }
        if (max != -1) {
            return mapTime.get(max);
        } 
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */