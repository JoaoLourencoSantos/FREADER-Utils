package dao;

import dao.base.TextFileManager;
import domain.Student;

public class CsvManager extends TextFileManager<Student> {
    @Override
    protected String getFileName() {
        return "src/data/student.csv";
    }

    @Override
    protected String getSplitSeparator() {
        return "\t";
    }

    @Override
    protected Student buildEntity(String[] resultSplit) {
        return new Student(resultSplit[0], convert(resultSplit[1]));
    }

}
