class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; ++i) {
			int num = target - nums[i];
			if (m.containsKey(num)) {
				return new int[]{ m.get(num), i };
			}
			m.put(nums[i], i);
		}
		throw new RuntimeException("no answer!");
	}
}