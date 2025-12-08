import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(!stack.empty()) {
                        System.out.println(stack.pop());
                    }
                    else  {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                case 5:
                    if(!stack.empty()) {
                        System.out.println(stack.peek());
                    }
                    else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}