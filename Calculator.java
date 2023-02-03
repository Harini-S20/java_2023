class Calculator
{
static String owner = "harini";
public static void main(String[] args)
{
Calculator calc = new Calculator();
//int no1 = 100, no2 = 200;
int result = calc.add(100,200);
calc.add(500,100);
 calc.add(100,20.5f);
calc.add(100,200,300);
}
int add(int a, int b)  // void add (int a ,int b) here we can use no1 no2 with different num thats not a problem.
{
System.out.println(a+b);
return a+b;
}
void add (int no1,float no2)
{
System.out.println(no1+no2);

}
void add(int num1, int num2,int num3)
{
System.out.println(num1+num2+num3);


}
}
