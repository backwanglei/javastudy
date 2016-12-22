
public class JavaExam3 {
	public static void main(String[]args){
		double arr[]=new double[args.length];//定义一个整数型数组；
		for(int x=0;x<args.length;x++){
			 arr[x] = Double.parseDouble(args[x]);
		}
	    double max=arr[0];
		double min=arr[0];
		for(int x=0;x<args.length;x++){
				if (arr[x]>max) {
					max=arr[x];}
			        if(arr[x]<min){                                                 
						min=arr[x];
					}
		 }
		     double avg =(max+min)/2;
			 System.out.println("数组的最大值:"+max);
			 System.out.println("数组的最小值:"+min);
			 System.out.println("平均值:"+avg);
			
	}
	}


		
	   		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
		 
	
	


