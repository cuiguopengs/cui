package utils;

import java.io.InputStream;
import java.net.URL;

public class CResourceLoader {

    public static URL loadURL(String path) {
        return CResourceLoader.class.getClassLoader().getResource(path);
    }

    public static String load(String path) {
        return loadURL(path).toString();
    }

    public static InputStream loadStream(String name) {
        return CResourceLoader.class.getClassLoader().getResourceAsStream(name);
    }
}
