package Easy.src;

// * Ques -> https://leetcode.com/problems/richest-customer-wealth/


public class Q1672 {
    public static void main(String[] args) {
        
    }


    // * Answer
    public int maximumWealth(int[][] accounts) {
        int max=0;

        for (int person = 0 ;person < accounts.length ; person++)
        {
            int personMax = 0;
            for(int bank=0; bank < accounts[person].length; bank++)
             {
                personMax += accounts[person][bank];
            }

            if(personMax > max) max= personMax;
        }

        return max;
    }


}
