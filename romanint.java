class Solution {
    public int romanToInt(String s) {
        //we get a roman numeral as input
        
        //maybe declare the values?? for each symbol
        HashMap<Character, Integer> romans = new HashMap<Character, Integer>();
        
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        //ok hashmap complete
        
        char symbol;
        int sum = 0;
        int num = 0;
        
        for(int i = s.length()-1 ; i >= 0 ; i--){
            //starting from the ass of the string
            symbol = s.charAt(i); //get the symbol at this position
            int val = romans.get(symbol);
            if(i == 0){ //can also be written as 
                //if position is 0, we can't check what's before and assume that it's the big chongus
                sum = sum + romans.get(symbol);
                //System.out.println("base case");
            }
            else{
                int prev = romans.get(s.charAt(i-1));
               // System.out.println(romans.get(s.charAt(i-1)));
                //System.out.println(romans.get(symbol));
                // if(prev == val){
                //     sum = sum + romans.get(symbol);
                // }
               if(prev < val){
                    num = val - prev;
                    sum = sum + num;
                    i--;
                    //System.out.println("smaller");
                }
                else{
                    sum = sum + val;
                    //System.out.println("not smaller case");
                }
            }
            
        }
        return sum;
    }
    
    public void main (String args []){
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        //taken it in as a string
        System.out.println(romanToInt(roman));
        //using method now
    }
}
