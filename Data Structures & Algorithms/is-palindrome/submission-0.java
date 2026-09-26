class Solution {
    public boolean isPalindrome(String s) {
        char[] pal=s.toCharArray();
        int i=0;
        int j=pal.length -1;
        while(i<j){
              while (i < j && !Character.isLetterOrDigit(pal[i])) {
                i++;
            }
              while (i < j && !Character.isLetterOrDigit(pal[j])) {
                j--;
            }
            pal[i] = Character.toLowerCase(pal[i]);
            pal[j] = Character.toLowerCase(pal[j]);

            if(pal[i]!=pal[j]){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
