// LEETCODE 12. Integer to Roman

// first solution that i founded: 

class Solution {
    public String intToRoman(int num) {
        String conversion = "";
        int[] numSpreaded = new int[4];
        String[] conversionArray = new String[4];
        
        numSpreaded[0] = (int)(num/1000) * 1000;
        numSpreaded[1] = (int)((num-numSpreaded[0])/100) * 100;
        numSpreaded[2] = (int)((num-numSpreaded[0]-numSpreaded[1])/10) * 10;
        numSpreaded[3] = (int)((num-numSpreaded[0]-numSpreaded[1]-numSpreaded[2]));
        numSpreaded[0] = numSpreaded[0] / 1000;
        numSpreaded[1] = numSpreaded[1] / 100;
        numSpreaded[2] = numSpreaded[2] / 10;

        for(int i = 0; i<numSpreaded.length; i++){
            String a = "", b = "", c = "";
            switch(i){
                case 0:
                    a = "M";
                    b = "";
                    c = "";
                    break;
                case 1:
                    a = "C";
                    b = "D";
                    c = "M";
                    break;
                case 2:
                    a = "X";
                    b = "L";
                    c = "C";
                    break;  
                case 3:
                    a = "I";
                    b = "V";
                    c = "X";
                    break;    
            }
            switch(numSpreaded[i]){
                case 1: 
                    conversionArray[i] = a;
                    break;
                case 2:
                    conversionArray[i] = a+a;
                    break;
                case 3:
                    conversionArray[i] = a+a+a;
                    break;
                case 4: 
                    conversionArray[i] = a+b;
                    break;
                case 5:
                    conversionArray[i] = b;
                    break;
                case 6:
                    conversionArray[i] = b+a;
                    break;
                case 7: 
                    conversionArray[i] = b+a+a;
                    break;
                case 8:
                    conversionArray[i] = b+a+a+a;
                    break;
                case 9:
                    conversionArray[i] = a+c;
                    break;      
                default:
                    conversionArray[i] = "";
                    break;
            }
        }
        
        for(String s:conversionArray){
            //System.out.println(s);
            conversion+=s;
        }
        return conversion;
    }
}



/* but the best solution (so on) is:

public String intToRoman(int num) {

        // Approach:
        // This method uses two arrays with the corresponding integer-roman map, in descending order.

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < value.length && num > 0; i++) {
            // Check from the highest value, 1000 to the smallest.
            // If it is possible to subtract, for example 400, we know the roman numeral next is "CD".
            while (num >= value[i]) {
                romanNumeral.append(roman[i]);
                num -= value[i];
            }
        }
        return romanNumeral.toString();
    }
    
*/
