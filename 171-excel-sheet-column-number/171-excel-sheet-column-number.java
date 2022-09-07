class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            int value=convertLetterToNumber(columnTitle.charAt(i));
            sum*=26;
            sum+=value;
        }
        return sum;
    }
    
    public int convertLetterToNumber(char c){
        return c-'A'+1;
    }
}