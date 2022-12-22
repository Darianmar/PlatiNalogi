import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String fname = "nalogi.txt";
        int n;
        try {
            Scanner scanner = new Scanner(new File(fname));
            n = scanner.nextInt();
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = scanner.nextInt();
            }
            int[] p = new int [n];
            for (int i = 0; i < n; i++) {
                p[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(m));
            System.out.println(Arrays.toString(p));
            int max_numf = 1;
            int max_p = 0;
            for (int i = 0; i < n; i++) {
                if (p[i]*m[i] > max_p) {
                    max_p = p[i]*m[i];
                    max_numf = i+1;
                }
            }
            //System.out.println (max_numf);
            String fOutName = "output.txt";
            FileWriter fw = new FileWriter(new File(fOutName));
            fw.write(Integer.toString(max_numf));
            fw.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}