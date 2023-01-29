class Theatre
{
 static String theatre_name = "Jazz Cinemas"; //class specific information
 String movie_name; // obj specific information
 int movie_time;  // obj specific information
Theatre()
{
System.out.println("pongal movie");
}
public static void main(String[] args)
{
Theatre screen1 = new Theatre();
Theatre screen2 = new Theatre();
Theatre screen3 = new Theatre();
screen1.movie_name = "varisu"; // assign or initialize
screen2.movie_name = "thunivu";
screen1.movie_time = 1030;
screen2.movie_time = 1045;
System.out.println(theatre_name);//
System.out.println(Theatre.theatre_name);
System.out.println(screen1.theatre_name);
System.out.println(screen1.movie_name);
System.out.println(screen2.movie_time);
screen1.movie_release();
screen2.movie_release();
Theatre.clean_theatre();
}
void movie_release()
{
System.out.println("new movies "+ movie_name);
System.out.println("Movie name"+theatre_name);
}
static void clean_theatre()
{

System.out.println("cleaning process "+theatre_name);
}
}













// class specific info means it will remind(store) that name in once for entire class
//static
