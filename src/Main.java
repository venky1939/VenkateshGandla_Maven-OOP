import java.util.ArrayList;
import java.util.*;
class Candies{
    int count(Integer n[],int u,int v){
    int count=0;
    for (int i=u+1;i<v-1;i++){
        if(n[i]==3){
            count=count+1;
        }
    }
    
    System.out.println("Candies in the given range:\t"+count);
    return count;
}
}
class Kitkat{
    int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==1){
            count=count+1;
        }
    }
    System.out.println("Kitkat:\t"+count);
    return count;
}
}
class Dairymilk{
int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==2){
            count++;
        }
    }
    System.out.println("Dairymilk:\t"+count);
    return count;
}
 
}  

class Munch{
    int count(Integer n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==4){
            count=count+1;
        }
    }
    System.out.println("Munch:\t"+count);
    return count;
}
}  

class Sweets{
    int count=0;
}

class Main{
public static void main(String []args){
    Kitkat k=new Kitkat();
    Dairymilk d=new Dairymilk();
    Munch m=new Munch();
    Candies c=new Candies();
    Sweets s=new Sweets();
    System.out.println("1.Kitkat\n2.Dairymilk\n3.Candy\n4.Munch\n5.Cova\n6.Exit(Gift selection is completed)\nEnter choice:");
    ArrayList<Integer> a =new ArrayList<>();
    
    for(int i=0;i<100;i++){
    	Scanner obj=new Scanner(System.in);
    	int num=obj.nextInt();
    	 a.add(num);
         if(num>6 || num<1)
         {
             System.out.printf("wrong option\n");
             break;
         }
         if(num==6)
         {
        	 break;
         }
    }
    
    int size1=a.size();
    int size=size1-1;
    System.out.println("Total weight is:" +size);
    Integer[] arr=a.toArray(new Integer[a.size()]);
    
    int k1=k.count(arr,size);
    int d1=d.count(arr,size);
    int m1=m.count(arr,size);
    System.out.println("Sorting Chocolates in Ascending Order based on number of Chocolates of same type");
    
    
    if (k1<=d1 && k1<=m1)  {
        
        k.count(arr,size);
        if(m1<=d1){
            m.count(arr,size);
            
            d.count(arr,size);
        }
        else if(d1<=m1){
            d.count(arr,size);
            
            m.count(arr,size);
        }
        
    }
        
    else if(d1<=k1 && d1<=m1){
        d.count(arr,size);
        if(k1<=m1)
        {
            k.count(arr,size);
            
            m.count(arr,size);
        }
        else if(m1<=k1)
        {
            m.count(arr,size);
            k.count(arr,size);
        }
    }
    else{
        m.count(arr,size);
        if(k1<=d1){
            k.count(arr,size);
            d.count(arr,size);
        }
        else if(d1<=k1){
            d.count(arr,size);
            k.count(arr,size);
        }
        
        
    }
    System.out.println("Enter the lower limit of range:");
    Scanner obj1=new Scanner(System.in);
    int num1=obj1.nextInt();

    System.out.println("Enter the upper limit of range:");
    Scanner obj2=new Scanner(System.in);
    int num2=obj2.nextInt();
    
    int c1=c.count(arr,num1,num2);
    
}
    
}

