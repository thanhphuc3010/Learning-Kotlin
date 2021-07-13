package me.phucpt.string;

public class MyString {
    static int sumDigitNumberInString(String str) {
        int sum = 0;
        int strLength = str.length();
        String temp = "0";
        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                temp += ch;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    static int sumNumberInString(String str) {
        int sum = 0;
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    static int sumASCIIInString(String str) {
        int sum = 0;
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            sum += ch;
        }
        return sum;
    }

    static String reveredString(String str) {
        String output = "";
        if (str == null) {
            return str;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        return output;

    }

    static String upperCaseFirstCharacter(String input) {
        if (input.length() > 1) {
            input = input.substring(0, 1).toUpperCase() + input.substring(1);
        }
        return input;
    }

    static String normalizeString(String str) {
        String strTrimed = str.trim().toLowerCase();
        String strOutput = "";
        String temp = "";
        for (int i = 0; i < strTrimed.length(); i++) {
            char ch = strTrimed.charAt(i);
            if (ch != ' ') {
                temp += ch;
            } else {
                temp = upperCaseFirstCharacter(temp);
                strOutput = strOutput.trim() + ' ' + temp;
                temp = "";
            }
        }
        strOutput = (strOutput + upperCaseFirstCharacter(temp)).trim();
        return strOutput;
    }

    public static String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        if (l1 == 0) {
            return num2;
        }
        if (l2 == 0) {
            return num1;
        }
        String result = "";
        int minLen = Math.min(l1, l2);
        int carry = 0;
        for (int i = 0; i < minLen; i++) {
            int index = l1 - i - 1;
            int c1 = num1.charAt(index) - 48;
            index = l2 - i - 1;
            int c2 = num2.charAt(index) - 48;
            int add = c1 + c2 + carry;
            carry = add / 10;
            add = add % 10;
            result += add;
        }

        String longer = null;
        if (l1 < l2) {
            longer = num2;
        } else if (l1 > l2) {
            longer = num1;
        }
        if (longer != null) {
            int l = longer.length();
            for (int i = minLen; i < l; i++) {
                int c1 = longer.charAt(l - i - 1) - 48;
                int add = c1 + carry;
                carry = add / 10;
                add = add % 10;
                result += add;
            }
        }
        return reveredString(result);
    }

    public static void main(String[] args) {
        String myString1 = "ab10cxy14zt20";
        String myString2 = "7abc$$91";
        String myString3 = "123";
        String myString4 = "viet nam";
        String myString5 = "   Pham TuyET  NHUNG  ";

        System.out.println(sumDigitNumberInString(myString1));
        System.out.println(sumNumberInString(myString2));
        System.out.println(sumASCIIInString(myString3));
        System.out.println(reveredString(myString4));
        System.out.println(normalizeString(myString5));
        System.out.println(addStrings("1234", "567"));
    }
}
