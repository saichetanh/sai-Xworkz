class Speaker{
static int maxVol=40;
static boolean isConnected = true;
static int currentVol = 10;
static int minVol=0;
public static void main(String a[])
{
String brandName;
brandName = "bose";
double price = 20000.0;
System.out.println(brandName);
System.out.println(price);
increaseVolume();
increaseVolume();
decreaseVolume(); 
decreaseVolume();
}
public static void increaseVolume()
{
if(isConnected())
{
if(currentVol < maxVol)
{
currentVol= currentVol+1;
System.out.println("current volume is:"+currentVol);
}
}
}
public static void decreaseVolume(){

if(isConnected())
{
if(currentVol > minVol)
{
currentVol= currentVol-1;
System.out.println("Current volume is:"+currentVol);
}
}
}
public static boolean isConnected()
{
return true;
}
}