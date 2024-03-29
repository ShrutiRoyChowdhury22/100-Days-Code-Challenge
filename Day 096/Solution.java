class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans = 0;
        int n = arr.length;
        int inArr = 0;
        for(int i = 1; i <= arr[n - 1]; i++) {
            if(i == arr[inArr]) {
                inArr++;
                continue;
            }else {
                k--;
            }
            if(k == 0) {
                return i;
            }
        }
        
        return arr[n - 1] + k;
    }
}
