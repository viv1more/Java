class bca
{
 public static int x=0;
 public bca()
 {
  x++;
 }
 public static void show()
 {
  System.out.println(x);
 }
}
class demo6
{
 public static void main(String nmu[])
 {
  bca.show();
  bca obj1=new bca(); 
  bca obj2=new bca(); 
  bca obj3=new bca(); 
  bca obj4=new bca(); 
  bca obj5=new bca(); 
  bca.show();
 }
}