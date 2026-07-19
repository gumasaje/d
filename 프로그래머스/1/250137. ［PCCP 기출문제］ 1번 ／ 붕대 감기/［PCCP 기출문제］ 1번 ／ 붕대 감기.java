class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int previousAttackTime = 0;

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            int recoveryTime = attackTime - previousAttackTime - 1;

            currentHealth += recoveryTime * bandage[1];
            currentHealth += (recoveryTime / bandage[0]) * bandage[2];
            currentHealth = Math.min(currentHealth, health);

            currentHealth -= damage;

            if (currentHealth <= 0) return -1;

            previousAttackTime = attackTime;
        }

        return currentHealth;
    }
}