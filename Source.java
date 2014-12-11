import java.io.*;

/**
 * Created by Grace on 12/7/2014.
 */
public class Source {
    public static void main(String[] args) throws IOException{
        if (args.length == 0){
            System.out.println("Please enter the path of the file you want to read");
        }
        else {
            BufferedReader input = null;
            try {
                input = new BufferedReader(new FileReader(args[0]));
                String data = "";
                while ((data = input.readLine()) != null) {
                    int num = Integer.parseInt(data);
                    int counter = 0;
                    if (num == 0) {
                        counter++;
                        System.out.println("Number : " + num);
                        System.out.println("Number of trailing zeroes: " + counter);
                        System.out.println("");
                    } else {
                        double pointTen = 0.10;
                        double ans = num * pointTen;
                        double temp = ans - Math.floor(ans);
                        while (temp == 0) {
                            ans = ans * pointTen;
                            temp = ans - Math.floor(ans);
                            counter++;
                        }
                        System.out.println("Number : " + num);
                        System.out.println("Number of trailing zeroes: " + counter);
                        System.out.println("");
                    }
                }
            } finally {
                if (input != null) {
                    input.close();
                }

            }
        }
    }
}
