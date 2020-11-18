import dao.base.FileManager;
import dao.CsvManager;
import dao.TextManager;
import domain.Student;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FileManager fileManagerTXT = new TextManager();
        FileManager fileManagerCSV = new CsvManager();

        System.out.println("TXT");
        List<Student> list1 = fileManagerTXT.read();
        System.out.println("CSV");
        List<Student> list2 = fileManagerCSV.read();
    }
}
