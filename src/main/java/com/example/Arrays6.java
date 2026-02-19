/*6. print individua of even & odd numbers present in array.*/
class Arrays6
{
    public static void main(String[] args)
  {    int even;
       int odd;
     int li[] ={1,2,3,4,5,6,7,8,9,10};
       for(int i=0;i<li.length;i++)
       {
          if(li[i]%2==0)
          {
          	
          	even=li[i];
          }
          else
          {
          	odd=li[i];
          }
          System.out.println(even);
          System.out.println(odd);
       }
       
  }	
}