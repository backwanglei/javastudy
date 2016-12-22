package Person2;

public class Outter {
	private Inner inner;  //inner是Outter的一个属性，
	String name ="Outter";
	 
	public void print(){//定义外部类的print的方法
		System.out.println("我是---Outter");//方法内容
	}
	class Inner{
		String name ="Inner"; //Inner 有一个属性的名为Inner
		
	public void readOutterName(){   //定义一个readInnerName的方法
		System.out.println("这是内部类的方法，我自己内部类的名字是："+name+"我的外部类的名字："+Outter.this.name);
		
	}
		public void print(){
		//System.out.println();
		System.out.println("我是---Inner");//定义一个内部print的方法 因为和外部同名了
		}
		public void execOutterPrint(){
			System.out.println("我是内部类，我将要执行外部类的print方法");
			Outter.this.print(); //访问外部类的同名成员的方法
			System.out.println("我是内部类，我将要执行外部类的print方法结束");
		}
		public Inner getInnerInstance(){
			if(inner==null){
				inner = new Inner();
			}
			return inner;
	}
	
    public void readInnerName(){
    	String tempName =getInnerInstance().name;
    	System.out.println("我是Outter类，我可以访问内部类的名字："+tempName);
    }
    public void execInnerPrint(){
		 System.out.println("我是外部类，我将要执行内部类的方法");
		 getInnerInstance().print();
		 System.out.println("我是外部类，我执行内部类的方法结束了！");
    }
    
    }
	   public static void main(String[] args){
    	 Outter outter =new Outter();
    	 outter.print();//调用外部类的打印方法
    	
    	 
    	 Outter.Inner inner2 =outter.new Inner();
    	 //Outter.Inner inner2 =outter.getInnerInstance();
    	 inner2.print();//调用内部累的方法
    	 inner2.readOutterName();
    	 inner2.execOutterPrint();
        }
	public Person2.Outter.Inner getInnerInstance() {
		// TODO Auto-generated method stub
		return null;
	}
    	 
    }
   
