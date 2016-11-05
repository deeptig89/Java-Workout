import java.nio.file.Files;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Deepti on 11/4/2016.
 */
public class ReadFile {
    public static void main(String args[]) {


        String fileName;
        fileName = "F:\\Java-Workout\\N&P\\projects\\src\\Numbers.txt";
        String path ="F:\\Java-Workout\\N&P\\projects\\src\\Numbersout.txt";
        int n;
        int total=0;
        double mean;
        int count= 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner input = new Scanner(fileReader);

            while (input.hasNext()) {
                n = input.nextInt();
                System.out.println(n);
                total = total + n;
                count++;
            }
            System.out.println("The total of value of numbers is:" +total);
            System.out.println("The number count is:" +count);
            //typecasting- converting int value to double to print the decimal values appropriately
            mean = (double)total/count;
            System.out.println("The mean value is:" +mean);
            //String builder is a class used to write the string to the file
            StringBuilder sb = new StringBuilder();

            if(Files.notExists(Paths.get(path)) )
            {
               Files.createFile(Paths.get(path)) ;
            }
            sb.append("The Mean value of the total numbers is: " );
            sb.append(mean);
            Files.write(Paths.get(path), sb.toString().getBytes(), StandardOpenOption.CREATE);

        } catch (FileNotFoundException e) {
            System.out.println("The requested input file is not found");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

