package Exception;

public class ExceptionDemo1 {
	public static void main(String [] args){
		System.out.println("********计算开始********");
		try {
			int i =10;
			int j =0;
			int temp = i/j;
			System.out.println("两个数字相除结果："+temp);
			System.out.println("----------------");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("不管是否出现异常，都执行此代码");
			
		}
		
		}

}
