class Solution {
 public:
  long long findScore(vector<int>& nums) {
    long score = 0;
    set<pair<int, int>> numIndices;
    vector<bool> seen(nums.size());

    for (int i = 0; i < nums.size(); ++i)
      numIndices.insert({nums[i], i});

    for (const auto& [num, i] : numIndices) {
      if (seen[i])
        continue;
      if (i > 0)
        seen[i - 1] = true;
      if (i + 1 < nums.size())
        seen[i + 1] = true;
      seen[i] = true;
      score += num;
    }

    return score;
  }
};