package dao.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvFileManager<T> extends FileManager<T> {

    @Override
    protected String getFileName() {
        return null;
    }

    @Override
    protected List<T> readArchive(List<T> list) throws IOException {
        String resultRead = "";

        BufferedReader reader = new BufferedReader(new FileReader(getFileName()));
        while ((resultRead = reader.readLine()) != null) {

            String[] resultSplit = resultRead.split(getSplitSeparator());

            list.add(buildEntity(resultSplit));
        }

        if (reader != null) {
            reader.close();
        }

        return list;
    }

    @Override
    protected T buildEntity(String[] resultSplit) {
        return null;
    }
}
