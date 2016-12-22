package getURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Needtext {
	String dString=null;
	String url=null;
	String needtext=null;
public static String getContent(String strUrl) {
	try {
		    URL url = new URL(strUrl);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String s = "";
			StringBuffer sb = new StringBuffer("");
			while ((s = br.readLine()) != null) {
				sb.append(s + "/r/n");
			}
			br.close();
			return sb.toString();
		} catch (Exception e) {
			return "error open url:" + strUrl;
		}
	}
public static void initProxy(String host, int port, final String username, final String password) {
		Authenticator.setDefault(new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, new String(password).toCharArray());
			}
		});
		System.setProperty("http.proxyType", "4");
		System.setProperty("http.proxyPort", Integer.toString(port));
		System.setProperty("http.proxyHost", host);
		System.setProperty("http.proxySet", "true");
	}
    public String getdate(){
    	   Calendar calendar=Calendar.getInstance();
    	   calendar.set(2016,11,10);
    	   for(int i=0;i<7;i++){
    		   calendar.add(Calendar.DAY_OF_MONTH, 1);
    		  SimpleDateFormat sm=new SimpleDateFormat("yyyy/MM.dd");
    		 dString=sm.format(calendar.getTime()); }
    	        return dString;
	   }
   public String gettext() throws IOException{
    url="http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/" + dString + ".json";
    String proxy = "http://192.168.22.81";
  		int port = 80;
  		String username = "username";
  		String password = "password";
  		String curLine = null;
  		String content = "";
  		 URL server = new URL(url);
  		initProxy(proxy, port, username, password);
  		HttpURLConnection connection = (HttpURLConnection) server.openConnection();
  		 if(connection.getResponseCode()==200){
  			connection.connect();
  		InputStream is = connection.getInputStream();
  			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
  		   while ((curLine = reader.readLine()) != null) {
  				content = content + curLine + "/r/n"; }
  	 }
  		     return needtext=content+getContent(url);
  }
      public static void main(String []args){
    	   
      }
}