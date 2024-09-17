class Solution {
public:
    vector<string> uncommonFromSentences(string s1, string s2) {
        
        unordered_map<string,int>res;
        auto process_sentence = [&](const string& sentence) 
        {
            stringstream ss(sentence);
            string word;
            while (ss >> word) 
            {
                res[word]++;  // Count the occurrence of each word
            }
        };
        process_sentence(s1);
        process_sentence(s2);
        vector<string>result;
        for (auto &i : res)
        {
            if (i.second <= 1)
            {
                result.push_back(i.first);
            }
        }
        return result;
    }
};