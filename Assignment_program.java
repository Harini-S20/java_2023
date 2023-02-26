

public class Assignment_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Assignment_programs ap = new Assignment_programs ();
	//	ap.find_divisors(100);         //Done
		ap.divisor_primenumber(100);
	//	ap.reverse_number(456789);     //Done
	//	ap.reverse_number1(456789);    //Done
    //  ap.findpower(2,5);             //Done
	//	ap.find54321powerof2(54321,2); //Done
    //  ap.find2power54321();          //Done
	//	ap.print1to100();              //Done
	//	ap.print5series();             //Done
	//  ap.factorial_of_5(5);          //Done
	//	ap.factfor5to1(3);
	//	ap.print1_8_27();              //Done
	//	ap.print1_27_125();            //Done
		ap.add_of_first20No();         //Done
	//	ap.palindrome();               //Done
	//  ap.base5power4(5,4);		   //Done
    //  ap.print1_4_27_256();          //Done
	//	ap.print5_10_15(5);			   //Done
	//	ap.fibonacci_series();         //Done
	//	ap.fibo_without3rdvar();	   //Done
	//	ap.swappingwithout3rdvar();	   //Done
	//  ap.swapping4num();             //Done
	//	ap.bintodec();
	//	ap.print1_11_111();            //Done
	//
	}

	private void print1_11_111() {
		// TODO Auto-generated method stub
		int no=1;
		int givenno=1;
		while(no<=5) {
			System.out.println(givenno);
			givenno=(givenno*10)+1;
			no=no+1;

		}
	}
	private void bintodec() {
		// TODO Auto-generated method stub

	}

	private void swapping4num() {
		// TODO Auto-generated method stub
		int a=5,b=6,c=7,d=8;
		System.out.println("before swap: " + a + " " + b + " " + c +" " + d + " ");
		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
	    a=a-(b+c+d);

		System.out.println("before swap: " + a + " " + b + " " + c +" "+ d+" ");

	}

	private void swappingwithout3rdvar() {
		// TODO Auto-generated method stub
		int a=5,b=6,c=7;
		System.out.println("before swap: " + a + " " + b + " " + c +" ");
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
//		a=b-(a+c);
//		c=b-(a+c);
//		b=b-(a+c);
	System.out.println("before swap: " + a + " " + b + " " + c +" ");
	}

	private void fibo_without3rdvar() {
		// TODO Auto-generated method stub
		int no1=0,no2=1;
		System.out.println(no1);//0
		System.out.println(no2);//1
		while(no1<=13) {//0<=13
		no2=no1+no2;  //0+1-->no2=1
		no1=no2-no1;//no1=1
		System.out.println(no2);
		}
	}

	private void fibonacci_series() {
		// TODO Auto-generated method stub
		int no1=0,no2=1,ans;
		System.out.println(no1);
		System.out.println(no2);
		while(no1<13) {
		ans=no1+no2;
		System.out.println(ans);
		no1=no2;
		no2=ans;
	//	System.out.println(no2);
		}
	}

	private void print5_10_15(int gno) {
		// TODO Auto-generated method stub
		int mul=1;
		while(mul<=10) {
		int ans=gno*mul;
		System.out.print(ans +" ");
		mul=mul+1;}
//		int answer=0;
//		int copy=no;
//		while(no>0) {
//			answer=answer+copy;
//		System.out.print(answer + " ");
//		no=no-1;
//		}
	}

	private void print1_4_27_256() {
		// TODO Auto-generated method stub
		int base=1,power=1;
		int result=1;
		while(base<=4) {
			findpower(base,power);
		base=base+1;
		power=power+1;

		}
	}

	private void base5power4(int base, int power) {
		// TODO Auto-generated method stub
		while(base>0){
		findpower(base,power);    //5,4
		  base=base-1;  		  // 4,3
		  power=power-1;          // 3,2
		}                        //2,1
								 // 1,0
	}

	private void palindrome() {
		// TODO Auto-generated method stub
	    {
	        int gno=10101;
	        int copy=gno;
	        int store=0;
	        while(gno>0){
	        store = (store*10)+ gno%10;
	        System.out.println(store);
	        gno=gno/10;
	        }// System.out.println(store);
	        if(copy==store)
	        {
	System.out.println(" The given number " + copy +" is palindrome ");
	        }
	        else
	        {
	  System.out.println("The given number " + copy +" is NOT palindrome ");
	        }
	    }
	}

	private void add_of_first20No() {
		// TODO Auto-generated method stub
		int gno=20;
	//int loopno=10;
		int answer;
	//System.out.println("answer"=n*(n+1)/2);
	int no=1;
	int ans=0;
	while(no<=gno){
	ans=ans+no;
	no++;
	}System.out.println("addition of " + gno + " is " + ans);
	}

	private void factfor5to1(int no) {
		// TODO Auto-generated method stub
	//	int loopnum=2;
	//	int fact=1;
		while(no>0) {
		factorial_of_5(5);
		no=no-1;
		}
		//loopnum=loopnum-1;
		//System.out.println(returnans);
	}

	private void print1_27_125() {
		// TODO Auto-generated method stub
		int no=10;
		int base=1,power=3;
		while(base<=no)
		{
			if(base%2!=0)   // ---> want 2power3 if(base%2==0)
			{
			findpower(base,power);
		}base=base+1;
		}
	}

	private void print1_8_27() {
		// TODO Auto-generated method stub
		int no=5;
		int base=1, power=3;
		//int result;
		while(base<no) {
	       findpower(base,power);
	       base=base+1;
		}
	}

	private void factorial_of_5(int num) {
		// TODO Auto-generated method stub
		int copy=num;
		int fact= 1;
		int ans=1;
		int no=5;
		int lnum=5;
//	while(copy>0)
//	{
//		while(num>0)
//		{
//			fact=fact*num;
//			num=num-1;
//		}
//		System.out.println("The factorial of " + copy   + " is " + fact  );
//
//	}
               while(num>0)
               {
		       fact=fact*num;
		      num=num-1;
	           }
               System.out.println("The factorial of " + copy   + " is " + fact  );

		//return fact;
	    }

	private void print5series() {
		// TODO Auto-generated method stub
		int no=1,div=5;
		while(no<=100)
		{
			if(no%5==0)
			{
				System.out.println(no);
				no=no+1;
			}
		}
//		int num=0;
//		int givenno=5;
//		while(num<100)
//		{
////			if(num==100)
////			{
////			break;
////			}
//			num=num+givenno;
//			System.out.println("The series of " + givenno +" within 100 " + " are  "  + num);
//
//		}
//		int givenno=3;
//		int no=100;
//		int num=1;
//		int ans=0;
//
//		  while(num<=no)
//		  {
//	         	ans=givenno*num;
//		    	System.out.println(ans);
//		    	num=num+1;
//	     	    if(ans==100)
//		    	 { break;
//	         	}
//
//	    	}
		}


	private void print1to100() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=100)
		{
		System.out.println(no);
	    no++;
		}
	}

	private void find2power54321() {
		// TODO Auto-generated method stub
		int base=2,power=5;
		while(power>0){
		int result=findpower(base,power);
		power=power-1;
	}
	}

	private void find54321powerof2(int num, int power) {
		// TODO Auto-generated method stub
		while(num>0){
	int	base= num%10;
	//System.out.println(base);
	num=num/10;

	int	result = findpower( base,power);
		}
	// System.out.println(result);
	}
	private int findpower(int base, int power) {
		// TODO Auto-generated method stub
		int powerval = power;
		int result=1;
		while(power>0) {
		result=result*base;
		power=power-1;
		}
		System.out.println("the power of " + base + " power " + powerval + " is " + result);
		return result;
	}
	private void reverse_number1(int num) {
		// TODO Auto-generated method stub
		int rem;
		while (num>0)
		{
			System.out.print(rem=num%100 );
			num=num/100;
		}
	}

	private void reverse_number(int num)
	{
		int rem;
		// TODO Auto-generated method stub
		while(num>0)
		{
		System.out.print(rem = num%10);
		num=num/10;
		//System.out.println(num);
		}
	}

	private void divisor_primenumber(int num) {
		// TODO Auto-generated method stub
		int div=2;

		Learn obj = new Learn();
		while(div<=num) {
			//if(num%div==0)
			//{System.out.println(div);
		obj.primenumber(div);

		}
		div=div++;
		}

	private void find_divisors(int num) {
		// TODO Auto-generated method stub
		//int num=100;
		int div=2;
		while(div<=num)
		//while(num>=0)
		{
		  if(num%div==0)
		  {
			  System.out.println("divisors of 100 is " + div);
		  }
		  div=div+1;
		}
	}

}
