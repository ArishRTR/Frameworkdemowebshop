package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class FileUtility {

	
	public  static  String getproperty(String key) throws IOException {
	FileInputStream input= new FileInputStream(FrameWorkConstants.CommonData_Properties);
	
	Properties data =new Properties();
	
	data.load(input);
	return data.getProperty(key);
	
	
	}
}
