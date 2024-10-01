package function;
 //primitive    wrapper
 //byte         Byte
 //short        Short
 //double       Double
 //long         Long
 //boolean      Boolean
 //float        Float
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		long l=40;
		short s=20;
		int i=30;
		float f=50.5f;
		double d= 60.5D;
		char c='a';
		boolean b2=true;
		
		//Autoboxing
		
		Byte byteobj=b;
		Long longobj=l;
		Short shortobj=s;
		Integer intobj=i;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		System.out.println("Printing object values");
		System.out.println(byteobj);
		System.out.println(longobj);
		System.out.println(shortobj);
		System.out.println(intobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(charobj);
		System.out.println(boolobj);
		
		//unboxing
		byte bytevalue=byteobj;
		long longval=longobj;
		
		System.out.println("Printing primitive values");
		System.out.println(bytevalue);
		System.out.println(longval);
	}

}
