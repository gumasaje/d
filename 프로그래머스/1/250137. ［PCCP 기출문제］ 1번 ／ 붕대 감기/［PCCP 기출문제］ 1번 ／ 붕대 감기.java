class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int continuous = 0;
        int attackIndex = 0;

        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (time == attacks[attackIndex][0]) {
                currentHealth -= attacks[attackIndex][1];
                continuous = 0;

                if (currentHealth <= 0) return -1;

                attackIndex++;
            } else {
                currentHealth += bandage[1];
                continuous++;

                if (continuous == bandage[0]) {
                    currentHealth += bandage[2];
                    continuous = 0;
                }

                currentHealth = Math.min(currentHealth, health);
            }
        }

        return currentHealth;
    }
}