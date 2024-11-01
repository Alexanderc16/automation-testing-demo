package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    public Properties initProp() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/test/resources/config/config.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println("Unable to read Properties file.");
        }
        return properties;
    }
}