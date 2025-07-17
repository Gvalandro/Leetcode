package SimpleArrayExercises;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ResultPlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double res_positive = 0 , res_negative = 0, res_zero = 0;

        for(Integer element : arr){
            if(element > 0) res_positive += 1;
            else if(element < 0) res_negative += 1;
            else res_zero += 1;
        }
        System.out.printf("%.6f\n", res_positive / arr.size());
        System.out.printf("%.6f\n", res_negative / arr.size());
        System.out.printf("%.6f\n", res_zero / arr.size());
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultPlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}
