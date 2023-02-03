class Whatsapp
{

 private int profit=1000;
int otp;
public static void main(String[] args)
{
Whatsapp wh = new Whatsapp();
wh.send_msg();
wh.call();
wh.collect_data();
System.out.println(wh.profit);

//wh.group_call();
//wh.set_status();
//wh.receive_call();
//wh.block();
}
void send_msg()
{
System.out.println("Sending");
}
void call()
{
System.out.println("calling");
}
 private void collect_data()
{
System.out.println("Collecting data");
}
}
