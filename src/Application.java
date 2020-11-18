import dao.base.FileManager;
import dao.CsvManager;
import dao.TextManager;
import domain.Student;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FileManager fileManagerTXT = new TextManager();
        FileManager fileManagerCSV = new CsvManager();

        List<Student> list1 = fileManagerTXT.read();
       // List<Student> list2 = fileManagerCSV.read();
    }
}
