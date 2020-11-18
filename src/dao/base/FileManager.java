package dao.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class FileManager<T> {

    protected int line = 0;

    protected abstract String getFileName();

    protected abstract List<T> readArchive(List<T> list) throws IOException;

    protected abstract T buildEntity(String[] resultSplit);

    public List<T> read() {
        try {
            line = 0;

            List<T> list = new ArrayList<>();

            list = readArchive(list);

            print(list);

            return list;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    protected String getSplitSeparator() {
        return " ";
    }

    private void print(List<T> list) {
        for (T value : list) {
            System.out.println(value.toString());
        }
    }

    protected Integer convert(String value) {
        return Integer.parseInt(value);
    }
}
