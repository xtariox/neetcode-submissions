class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap stores:
        // Key   -> number we've already seen
        // Value -> index where we saw that number
        //
        // Example:
        // {2=0, 7=1}
        HashMap<Integer, Integer> hash = new HashMap<>();


        // Loop through the array one number at a time
        for (int i = 0; i < nums.length; i++) {

            // Ask:
            // "If the current number is nums[i],
            // what number do I need to reach the target?"
            //
            // Example:
            // target = 9
            // nums[i] = 2
            // difference = 7
            int difference = target - nums[i];


            // Have we already seen the number we need?
            //
            // If YES:
            // We already know its index from the HashMap,
            // so we've found our answer.
            if (hash.containsKey(difference)) {

                // Return:
                // index of the previous number,
                // and the current index.
                return new int[]{hash.get(difference), i};
            }


            // If we didn't find the complement,
            // remember the current number for future iterations.
            //
            // Example:
            // nums[i] = 2
            // i = 0
            //
            // HashMap becomes:
            // {2=0}
            hash.put(nums[i], i);
        }

        // Problem guarantees a solution,
        // but Java requires a return statement.
        return new int[]{};
    }
}