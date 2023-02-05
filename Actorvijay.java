 public class Actorvijay implements Actor
{
int num;
String name;

static String address = "coimbatore";
 public Actorvijay(int num, String name)
{
this.num =num;
this. name=name;
System.out.println("The first no.of plate " + num + "Name of the car "+ name);
}
//public Actorvijay(int number, String nam)
//{
//}
public static void main(String[] args)
{
Actor obname = new Actorvijay(85,"innova");
Actorvijay obj = new Actorvijay (65, "Audi Car");
System.out.println(obname.address);
obname.act();
obname.dance();
obname.sing();
//obname.speaking();
obj.act();
obj.dance();
obj.sing();
obj.speaking();
System.out.println(address);
}
 public void act()
{ System.out.println("acting");
}
 public void dance()
{System.out.println("dancing");}
public void sing()
{System.out.println("Singing");
}
void speaking()
{System.out.println("Speak");}
}
