package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    public Properties loadproperties() throws IOException {
        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configData/Config.Properties");

         properties=new Properties();
         properties.load(fileInputStream);
         return properties;

    }

    public static void main(String[] args) throws IOException {
        ConfigReader reader=new ConfigReader();
        Properties p1=reader.loadproperties();
        System.out.println(p1.get("username"));
        System.out.println(p1.get("password"));
    }


}
