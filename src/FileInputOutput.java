import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {
//       1) Open the given file inside src called moviesDataSet.csv

        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/moviesDataSet.csv");
        }
        catch (FileNotFoundException e) {
            System.out.println("File couldn't be found- closing program");
            System.exit(1);
        }

//       2) Read each row in the dataset
        Scanner fileReader = new Scanner(myFile);
        ArrayList<String> movies = new ArrayList<String>();

         while(fileReader.hasNextLine()){
             String theRow = fileReader.nextLine();
             //  3) Print each row to the screen
             System.out.println(theRow);

             String [] input= theRow.split(",");
             movies.add(input[2]);
         }
         for(int i=0; i<movies.size(); i++){
             System.out.println(movies.get(i));
         }


//        Scanner secondFileReader = new Scanner(myFile);
//         while(fileReader.hasNextLine()){
//            String theMovie = fileReader.nextLine();
//            System.out.println(theMovie);
////            String [] input= theMovie.split(",");
////            System.out.println(input[2]);
//         }

//       4) Print only the name of the movie
//        String[] input =

//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub

    }

}