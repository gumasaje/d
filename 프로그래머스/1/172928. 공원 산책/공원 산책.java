class Solution {
    public int[] solution(String[] park, String[] routes) {
        int row = 0;
        int col = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    row = i;
                    col = j;
                }
            }
        }

        for (String route : routes) {
            String[] command = route.split(" ");
            char direction = command[0].charAt(0);
            int distance = Integer.parseInt(command[1]);

            int dr = 0;
            int dc = 0;

            switch (direction) {
                case 'N' -> dr = -1;
                case 'S' -> dr = 1;
                case 'W' -> dc = -1;
                case 'E' -> dc = 1;
            }

            int nextRow = row;
            int nextCol = col;
            boolean canMove = true;

            for (int i = 0; i < distance; i++) {
                nextRow += dr;
                nextCol += dc;

                if (nextRow < 0 || nextRow >= park.length
                        || nextCol < 0 || nextCol >= park[0].length()
                        || park[nextRow].charAt(nextCol) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                row = nextRow;
                col = nextCol;
            }
        }

        return new int[]{row, col};
    }
}