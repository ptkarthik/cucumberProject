package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static FileReader fileReader;
    public static Properties properties;


    public static Properties getProp() {
        {
            try {
                fileReader = new FileReader(System.getProperty("user.dir")+
                        "/src/main/resources/config.properties");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                properties = new Properties();
                properties.load(bufferedReader);
                return properties;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
