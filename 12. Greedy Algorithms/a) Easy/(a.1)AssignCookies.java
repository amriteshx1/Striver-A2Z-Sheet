// Assign Cookies

import java.util.Arrays;

class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        int m = Student.length;
        int n = Cookie.length;

        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int l = 0;
        int r = 0;

        while (l < m && r < n) {
            if (Student[l] <= Cookie[r]) {
                l++;
            }
            r++;
        }
        return l;
    }
}
