class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> oneMap = new HashMap<>();
        HashMap<Integer, Integer> twoMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            oneMap.merge(nums1[i], 1, Integer::sum);
        }
        for (int i = 0; i < nums2.length; i++) {
            twoMap.merge(nums2[i], 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : oneMap.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (twoMap.get(key) != null) {
                int twoVal = twoMap.get(key);
                oneMap.put(key, Math.min(value, twoVal));
            } else {
                oneMap.put(key, 0);
            }
        }
        int size = 0;
        for (int val : oneMap.values()) {
            size += val;
        }
        int[] returnVal = new int[size];
        int j = 0;
        for (int item : oneMap.keySet()) {
            if (oneMap.get(item) > 0) {
                for (int i = 0; i < oneMap.get(item); i++) {
                    returnVal[j] = item;
                    j++;
                }
            }
        }
        return returnVal;
        
    }
}