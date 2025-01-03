class Solution {

    public List<Integer>list1(int r)
    {
        List<Integer>res = new ArrayList<>();
        int ans = 1;
        res.add(1);

        for (int i=1;i<r;i++)
        {
            ans = ans*(r-i);
            ans = ans/i;
            res.add(ans);
        }
        return res;

    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>res = new ArrayList<>();
        for (int i=1;i<=numRows;i++)
        {
            res.add(list1(i));
        }
        return res;
    }
}