import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String m = Integer.toString(x);
        int s = 0, e = m.length()- 1;
        boolean pal = true;
        
        while(s < e && s != e){
            int val = Character.compare(m.charAt(s), m.charAt(e));
            if(val != 0){
                pal = false;
            }            
            if (s < e){
                s++;
                e--;
            }
        }
        return pal;
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean answer = isPalindrome(x);
        System.out.println(answer);
    }
}
