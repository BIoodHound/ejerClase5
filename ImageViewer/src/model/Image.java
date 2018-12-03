package model;

import java.awt.Image;
import java.io.InputStream;

public interface image {
    public String name();
    public InputStream stream();
    public Image next();
    public Image prev();
}
