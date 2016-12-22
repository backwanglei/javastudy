package hello;

public class GGGGGG {
	public void sanjiao(int a){
		for(int i=1;i<=a;i++){
		    for(int j=1;j<i;j++){	
		    	System.out.print(" ");
		    }
		    for(int t=1;t<=2*(a-i)-1;t++){
		    	System.out.print("*");
		    }
		    System.out.println();

	}
	}
	public static void main(String[] args)
	{
	GGGGGG test = new GGGGGG();
	test.sanjiao(5);
	}

}
