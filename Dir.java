package Module3_2;


import java.util.ArrayList;
import java.util.List;

public class Dir {

    private List<File> files = new ArrayList<File>();

    public Dir() {
        files.add(new TextFile());
        files.add(new AudioFile());
        files.add(new ImageFile());
    }

    @Override
    public String toString() {
        String output = "Current dir contain following files:\n";
        for (File files : files) {
            output = output + files.getType() + "\n";

        }

        return output;
    }
}
