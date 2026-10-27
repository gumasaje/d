import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            String a = phone_book[i];
            String b = phone_book[i + 1];

            if (b.startsWith(a)) {
                return false;
            }
        }

        return true;
    }
}