class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=temp.length -1;i>=0;i--){
            ans.append(temp[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        return ans.toString();


        
    }
}
