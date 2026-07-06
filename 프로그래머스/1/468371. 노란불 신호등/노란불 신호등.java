class Solution {
    public int solution(int[][] signals) {
        int limit = 1;

        for (int[] signal : signals) {
            int cycle = signal[0] + signal[1] + signal[2];
            limit = lcm(limit, cycle);
        }

        for (int t = 1; t <= limit; t++) {
            boolean allYellow = true;

            for (int[] signal : signals) {
                if (!isYellow(signal, t)) {
                    allYellow = false;
                    break;
                }
            }

            if (allYellow) return t;
        }
        
        return -1;
    }

    private boolean isYellow(int[] signal, int t) {
        int green = signal[0];
        int yellow = signal[1];
        int red = signal[2];

        int cycle = green + yellow + red;
        int pos = (t - 1) % cycle + 1;

        return green < pos && pos <= green + yellow;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}