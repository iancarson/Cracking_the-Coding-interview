import java.util.ArrayList;

public class Solution {
    public static int magicIndex(ArrayList<Integer> a, int n) {
        // Write your code here
        int magic = -1;
        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i) == i)
                magic = i;
        }
        return magic;
    }
}
