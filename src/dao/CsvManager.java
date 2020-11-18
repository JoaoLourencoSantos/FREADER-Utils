package dao;

import dao.base.CsvFileManager;
import domain.Student;

public class CsvManager extends CsvFileManager<Student> {
    @Override
    protected String getFileName() {
        return "src/data/students.csv";
    }

    @Override
    protected String getSplitSeparator() {
        return ",";
    }

    @Override
    protected Student buildEntity(String[] resultSplit) {
        return new Student(resultSplit[0], convert(resultSplit[1]));
    }

}
