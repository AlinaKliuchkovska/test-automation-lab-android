package csvreader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVReaderUsers {

    public static String[][] usersDataSet() {
        String csvFile = "src/test/resources/users.csv";
        CSVReader reader;
        String[][] usersList = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            List<String[]> list = reader.readAll();
            usersList = new String[list.size()][];
            for(int i = 0; i < list.size(); i++){
                usersList[i] = list.get(i);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return usersList;
    }
}