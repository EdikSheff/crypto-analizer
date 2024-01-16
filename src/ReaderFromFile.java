import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReaderFromFile {
    public String getText(String path) {
        Path inputpath = Path.of(path);
        if(!isAbsolutePath(path)) {
            inputpath = (inputpath.toAbsolutePath());
        }
        try {
            List<String> lines = Files.readAllLines(inputpath);
            return String.join("\n", lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private boolean isAbsolutePath(String path) {
        return Paths.get(path).isAbsolute();
    }

}
