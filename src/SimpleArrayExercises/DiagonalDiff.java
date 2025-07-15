package SimpleArrayExercises;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int abs_diagonal = 0,sumNormal= 0, sumInverse = 0;
        int matrixSize = arr.size();
        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j< matrixSize; j++){
                if(i == j) sumNormal += arr.get(i).get(i);
                if(i+ j == matrixSize-1)sumInverse += arr.get(i).get(matrixSize-i-1);
            }
        }


        System.out.println(sumNormal);
        System.out.println(sumInverse);

        abs_diagonal =  sumInverse - sumNormal;
        return Math.abs(abs_diagonal);
    }

}

public class DiagonalDiff {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
