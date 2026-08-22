class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       	List<Integer> list = new ArrayList<>();
		int i = 0;
		int j = arr.length - 1;
		while (j - i + 1 > k) {
			int leftDistance = Math.abs(arr[i] - x);
            int rightDistance = Math.abs(arr[j] - x);
            
			if (leftDistance > rightDistance) {
				i++;
			} else {
				j--;
			}
		}
		while (i <= j) {
		    list.add(arr[i]);
		    i++;
		} 
        return list;
    }
}