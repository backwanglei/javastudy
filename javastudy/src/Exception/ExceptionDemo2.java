package Exception;

public class ExceptionDemo2 {
public static void main(String []args){
		System.out.println("计算开始");
		  try {
			int i=Integer.parseInt(args[0]);
			  int j=Integer.parseInt(args[1]);
			  int temp=i/j;
			  System.out.println("两个数相除结果："+temp);
		}catch(ArithmeticException e){
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}finally {
			System.out.println("我最叼");
		}
		  System.out.println("计算结束");
	}

}
