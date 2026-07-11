import java.util.*;

class Solution {

    public ArrayList<ArrayList<Integer>> triplets(int[] arr) {

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);

                    ans.add(temp);

                    while (left < right && arr[left] == arr[left + 1])
                        left++;

                    while (left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return ans;
    }
}