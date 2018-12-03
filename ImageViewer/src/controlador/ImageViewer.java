package controlador;

import java.io.File;
import model.Image;
import persistencia.FileImageLoader;

public class ImageViewer {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gonca\\Pictures\\");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.Load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
