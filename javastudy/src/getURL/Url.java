package getURL;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Url {
	public static void main(String []args) throws Exception{
	Calendar calendar = Calendar.getInstance();
	String p=null;
	String url = null;
	calendar.set(2016, 11, 10);
	String dString= null;
	for (int i = 0; i < 5; i++) {
	calendar.add(Calendar.DAY_OF_MONTH, 1);
	SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM.dd");
	dString = sd.format(calendar.getTime());
	String ml="http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/"+dString+".json";
	URL newurl = new URL(ml);
	PrintStream ps = new PrintStream(new FileOutputStream(new File("D:" + File.separator + "text2.txt")));
	HttpURLConnection conn = (HttpURLConnection) newurl.openConnection();  
	conn.setConnectTimeout(6* 1000);//设置连接超时  
	if (conn.getResponseCode() == 200){   
	InputStream is = conn.getInputStream();//得到网络返回的输入流  
	String result = readData(is, "GBK");  
	conn.disconnect();  
    String s[]=result.split(",");
    for (int a = 0; a < s.length; a++) {
		if (s[a].contains("lastTradeTime") || s[a].contains("contract_field:contract_code")
				|| s[a].contains("closingPrice") || s[a].contains("noOfTradedContractsExchange")
				|| s[a].contains("volumeExchange") || s[a].contains("settlementPrice")
				|| s[a].contains("volumeTotal")) {
			           p = s[a];
			           ps.println(dString+":"+p);
			}
		   }
              
		}
	}
	}
	 //第一个参数为输入流,第二个参数为字符集编码  
	  public static String readData(InputStream inSream, String charsetName) throws Exception{  
	    ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
	    byte[] buffer = new byte[1024];  
	    int len = -1;  
	    while( (len = inSream.read(buffer)) != -1 ){  
	           outStream.write(buffer, 0, len);  
	       }  
	       byte[] data = outStream.toByteArray();  
	       outStream.close();  
	       inSream.close();  
	       return new String(data, charsetName);  
	   } 
}
