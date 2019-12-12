public class single{
	private static single obj=null;
	private single(){
	}
	public static single cobj()
	{
			if(obj==null)
				obj=new single();
			return obj;
	}
	public static void main(String args[]){
		single x1=single.cobj();
		System.out.println(x1);
		single x2=single.cobj();
		System.out.println(x2);
	}	
}
// java does not permit to declare a constructor as static ....
//a constructor always belongs to some object .if a constructor is static,an object of subclass 
//cannot access........
