import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {

        String[] divided = s.split(":");
        String seconds = divided[2].substring(0,2);
        String scale = divided[2].substring(2);
        Integer newHour = Integer.parseInt(divided[0]);

        if(scale.equals("AM") && newHour == 12){
            newHour = 0;
        }else if(scale.equals("PM")&& newHour != 12){
            newHour = newHour +12;
        }
        String formattedHour = String.format("%02d", newHour);

        return formattedHour + ":"+ divided[1] +":"+ seconds;

    }

}

public class timeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = ResultConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
