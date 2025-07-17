package SimpleArrayExercises;

import java.io.*;

class ResultStaircases {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {


        for(int i = 1; i <= n; i++){
            String line = " ".repeat(n - i) + "#".repeat(i);
            System.out.println(line);
        }
    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ResultStaircases.staircase(n);

        bufferedReader.close();
    }
}
