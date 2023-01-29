class SuperMarket
{
static String shop_name = "ABCD"; // line 3,4,5 is global variable
String product_name;
int product_price;
/*boolean expired;
float discount;*/

SuperMarket(String product_name , int product_price)
{
//product_name = s;
//product_price = i;
this.product_name = product_name;
this.product_price = product_price;
}
public static void main(String[] args)
{
SuperMarket product1 = new SuperMarket("biscuit ", 30);
SuperMarket product2 = new SuperMarket("bread", 40);
product1.sell();
product2.sell();
product2.pack();
/*System.out.println(product1.expired);
System.out.println(product2.discount);*/

}
void sell()
{
System.out.println("selling "+ product_name +" "+product_price);
}
void pack()
{
System.out.println("packing "+ product_name +" "+product_price);
}

}











//what is constructor?
