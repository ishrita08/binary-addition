class Solution {
    public String addBinary(String a, String b) {
       int l1 = a.length();
        int l2 = b.length();
        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = "0" + b;
            }
        }
        if (a.length() < b.length()) {
            int diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = "0" + a;
            }
        }
        int carry = 0;
        String ans = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 0) {
                ans = "0" + ans;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 1) {
                ans = "1" + ans;
                carry = 0;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 1) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 1) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 0) {
                ans = "1" + ans;
                carry = 0;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 1) {
                ans = "1" + ans;
                carry = 1;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 0) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 0) {
                ans = "1" + ans;
                carry = 0;
            }
        }
        if (carry == 1) {
            ans = "1" + ans;
        }
        return ans; 
    }
}
