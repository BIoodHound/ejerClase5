package persistencia;

import java.awt.Image;
import java.io.File;
import java.io.FileFilter;

public class FileImageLoader {
    private final File[] files;

    public FileImageLoader(File[] files) {
        this.files = files;
    }
    public FileFilter imageType(){
        return null;
    }    
    public Image imageAt(int i){
        return null;
    }
}
