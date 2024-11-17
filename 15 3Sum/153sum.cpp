class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(), nums.end());

        for (int i = 0; i < nums.size() - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            unordered_map<int, int> mp;
            for (int j = i + 1; j < nums.size(); j++) {
                int complement = -(nums[i] + nums[j]);
                if (mp.find(complement) != mp.end()) {
                    result.push_back({nums[i], nums[j], complement});
                    while (j + 1 < nums.size() && nums[j] == nums[j + 1]) j++;
                }
                mp[nums[j]] = j;
            }
        }

        return result;
    }
};
