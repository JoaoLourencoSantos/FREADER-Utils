package dao.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class TextFileManager<T> extends FileManager<T> {

    @Override
    protected String getFileName() {
        return null;
    }

    @Override
    protected List<T> readArchive(List<T> list) throws FileNotFoundException {
        File textFile = new File(getFileName());
        Scanner reader = new Scanner(textFile);

        while (reader.hasNextLine()) {
            String resultLine = reader.nextLine();

            if (resultLine != null) {
                String[] resultSplit = resultLine.split(getSplitSeparator());

                list.add(buildEntity(resultSplit));
            }

            line++;
        }

        reader.close();

        return list;
    }

    @Override
    protected T buildEntity(String[] resultSplit) {
        return null;
    }
}
