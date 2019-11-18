public class Alarm
{
private int hour;
private int minute;
public Alarm(int ahour,int aminute)
{
hour = ahour;
minute = aminute;
}
public void countMin(int p1)
{
int minutes = p1;
int count = 1;
if (count <= minutes)
{
System.out.println(count);
count++;
}
}
public String toString()
{
String time;
time = "The hour = " + hour+ " \nThe minute = "+minute;
return time;
}
void change1(int p1)
{
hour = p1;
}
void change2(int p1)
{
minute = p1;
}
}

