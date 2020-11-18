package dao;


import dao.base.TextFileManager;
import domain.Student;

public class TextManager extends TextFileManager<Student> {

    @Override
    protected String getFileName() {
        return "src/data/students.txt";
    }

    @Override
    protected Student buildEntity(String[] resultSplit) {
        return new Student(resultSplit[0], convert(resultSplit[1]));
    }
}
