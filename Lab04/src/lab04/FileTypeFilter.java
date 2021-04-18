
package lab04;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FileTypeFilter extends FileFilter {

    private final String extenstion;
    private final String description;
    
    public FileTypeFilter(String extenstion, String description) {
        this.extenstion = extenstion;
        this.description = description;
    }

    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        return f.getName().endsWith(extenstion);
    }

    @Override
    public String getDescription() {
        return description + String.format(" (*%s)", extenstion);
    }
    
}
