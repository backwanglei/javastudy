package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Calculate extends Thread{
	public Calculate(){}
    public static void main(String []args) throws IOException{
    	File file=new File("D:"+File.separator+"test"+File.separator
				+"test.txt"); 
    	List<Integer>list=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入两个整数");
		int i=0;//i表示除数
		int t=0;//t表示被除数
		try{if(scanner.hasNextInt()){//i,t进行整数判断
			 i=scanner.nextInt();//i为第一个输入的数字
			 t=scanner.nextInt();//t为第二个输入的数字
			if(i==0&&t==0){//判断 被除数不能为0,将0排除
				System.out.println("输入的数据错误，请重新输入");
			}else if(i>0){
				for(int n=1;n<=i;n++){//n循环判断能不能被整除；
					if(n%t==0){
						list.add(n);
					}
				}
			}
				
			}else{
				System.out.println("输入的数据格式错误，请重新输入");
			}
			
         }catch(Exception e){
        	 e.printStackTrace();
         }
		int c=list.size();//c表示符合条件的数的个数 
		int a=Collections.max(list);//a表示求出数中的最大值
		int b=Collections.min(list);//b表示求出数中的最小值
		int sum=0;//sum表示求出数的总和
		for(int x=0;x<list.size();x++){//循环求出总和
			sum+=list.get(x);
		}
		int avg=sum/list.size();//求出平均值；
		OutputStream on = new FileOutputStream(file, true);
		Writer writer=new OutputStreamWriter(on, "GBK");
		String str1="\r\n题目：  计算i以内所有能被t整除的数的和以及平均数。";
		String str2="\r\n要求：";
		String str3="\r\nA.i,t的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档";
	    String str4="\r\nB.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！";
	    String str5="\r\n解题思路：先从控制台输出数据，判断数据是否符合要求，利用数据循环输出，求出所得的数";
        String str6="\r\n从控制台中读取的数为："+i+t;
        String str7="\r\n符合条件的个数为"+c;
        String str8="\r\n符合条件的数的排序输出为："+list.toString();
        String str9="\r\n他们的和是："+sum+"他们的平均数是："+avg+"他们的最大值为："+a+"他们的最小值为："+b;
        writer.write(str1);
        writer.write(str2);
        writer.write(str3);
        writer.write(str4);
        writer.write(str5);
        writer.write(str6);
        writer.write(str7);
        writer.write(str8);
        writer.write(str9);
        writer.close();
       
    } 
    
    }
       



