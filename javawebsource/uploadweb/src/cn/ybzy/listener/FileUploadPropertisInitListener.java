package cn.ybzy.listener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import cn.ybzy.utils.UploadFilePropertiesUtil;

@WebListener
public class FileUploadPropertisInitListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		//web服务器启动的时间执行
		InputStream in = getClass().getClassLoader()
				.getResourceAsStream("uploadfile.properties");
		Properties properties = new Properties();
		try {
			properties.load(in);
			for(Object o:properties.keySet()) {
				String key = (String)o;
				String value = properties.getProperty(key);
				//System.out.println("key:" + key + ", value:" + value );
				UploadFilePropertiesUtil.getInstance().addProperty(key, value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
