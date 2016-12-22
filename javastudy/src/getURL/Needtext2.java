package getURL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Needtext2 {
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
  public static void main(String []args) throws FileNotFoundException, IOException{
	   PrintStream ps=new PrintStream(new FileOutputStream(new File("D:" + File.separator + "text.txt")));
	    Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 11, 10);
		String dString = null;
		String p=null;
	for(int i=0;i<5;i++){
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM.dd");
		dString = sd.format(calendar.getTime());
	String url="http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/" + dString + ".json";
	String proxy = "http://192.168.22.81";
	int port = 80;
	String username = "username";
	String password = "password";
	String curLine = null;
	String content = "";
	URL server = new URL(url);
	initProxy(proxy, port, username, password);
	HttpURLConnection connection = (HttpURLConnection) server.openConnection();
	if(connection.getResponseCode() == 200){
		connection.connect();
		InputStream is = connection.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		while ((curLine = reader.readLine()) != null) {
			content = content + curLine + "/r/n";}}
	  String needtext=content+getContent(url);
	  String s[]=needtext.split(",");
	  for(int a=0;a<s.length;a++){
		  if (s[a].contains("lastTradeTime") || s[a].contains("contract_field:contract_code")
					|| s[a].contains("closingPrice") || s[a].contains("noOfTradedContractsExchange")
					|| s[a].contains("volumeExchange") || s[a].contains("settlementPrice")
					|| s[a].contains("volumeTotal")) {
				p = s[a];}} }
	           ps.println( dString+":"+p);
   }

}
