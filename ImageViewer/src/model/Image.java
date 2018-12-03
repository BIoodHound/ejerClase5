package model;

import java.awt.Image;
import java.io.InputStream;
public interface Image {
    String name();
    InputStream stream();
    Image next();
    Image prev();

}
