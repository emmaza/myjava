package com.company;

/**
 * Created by emma on 23/6/15.
 */
//If no valid conversion could be performed, a zero value is returned.
//If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
public class MyAtoi {
    public static void main(String[] args) {
        String str = "  010";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str){
        int i=0, result=0, n=str.length();
        int sign = 1;
        while(i<n && Character.isSpaceChar(str.charAt(i))) i++;
        if(i<n && str.charAt(i)=='-'){
            sign =-1;
            i++;
        }
        else if(i<n && str.charAt(i)=='+') i++;
        while (i<n && Character.isDigit(str.charAt(i))) {
            int digit = Character.getNumericValue(str.charAt(i));
            if(result>214748364 || result==214748364 && digit >7) { // or use Integer.MAX_VALUE / 10
                return sign==1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}
