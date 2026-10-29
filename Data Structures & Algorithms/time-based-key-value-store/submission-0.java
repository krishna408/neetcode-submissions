class TimeMap {
    record Pair(Integer first, String second){}
    //int curr_timestamp;
    Map<String, List<Pair>> map;
    public TimeMap() {
        //curr_timestamp=0;
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Pair(timestamp, value));
    }
    private Pair binarySearch(List<Pair> pairs, int target){
        int l=0, r=pairs.size()-1;
        Pair p1=new Pair(-1, "");
        if(pairs.get(l).first>target)
            return p1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(pairs.get(mid).first==target) return pairs.get(mid);
            if(pairs.get(mid).first<target){
                l=mid+1;
            }else
                r=mid-1;
        }

        return pairs.get(r);
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        Pair p=binarySearch(map.get(key), timestamp);
        return p.second;    
    }
}
