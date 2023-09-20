package RepeatClass3;

public class Increment_Decrement {
	public static void main(String[] args) {
		
		int x = 10;
		
		
		//x= x+1;
		x+=1; //shorthand
		x++;	//increment
		x= x+1;
		
		System.out.println(x);
		
		
		int y =50;
		
		y=y-1;
		y--; //decrement
		y-=5; //shorthand
		
		System.out.println(y);
		
		//Pre increment // Post increment
		
		//++ increment --> add 1 to the value
		//-- decrement --> subtract 1 from the value
		
		int a; 
		int b= 50;
		
		//post increment
		//1.perform a= b
		//2. increment ( b= b +1)
		 
		a= b++;    //a is 50 . b is 51
		System.out.println(a);
		System.out.println(b);
		
		
		int c, d;
		
		d= 15;
		//pre increment
		//1.increment c (c= c+1)
		//2.assign the value of b to a
		
		c= ++d; //it increments both by 1
		System.out.println(c);
		System.out.println(d);
		
		
		int e ; 
		int f = 14;
		//1. perform e=f
		//2. decrement e ...(e=e-1)
		
		e= f--;
		System.out.println(e);
		System.out.println(f);
		
		int g;
		int h= 14;
		
		g= --h;
		//decrements them both by one
		
		//pre decrement
		//1. decrement f  ..f(= f-1)
		//2.assign the value of f to e
		System.out.println(g);
		System.out.println(h);
		
		//with post increment or decrement main variable stays same,
		//new one gets incremented or decremented by 1
		
		
	}

}
