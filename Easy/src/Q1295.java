package Easy.src;

// * Ques -> https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class Q1295 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    

    // * Answer
    public int findNumbers(int[] nums) {
        
        
        int count = 0;
        
        for (int num : nums){
            if (Integer.toString(num).length() %2 ==0  ){
                count++;
            }
            
            
        };
        return count;
    };

};
