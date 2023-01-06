class quadratic{
    public static void main(string args[]){

    }
    import java.util.*;
    float d, a,b,c,r1,r2;
    scanner sc=new scanner(system.in);
    system.out.println("enter the values of a");
    a=sc.nextfloat();
    system.out.println("enter the values of b");
    b=sc.nextfloat();
    system.out.println("enter the values of c");
    c=sc.nextfloat();

    system.out.println("given equatiuon is of the form "+a+"x^2"+b+"x"+c);
    d=(b*b)-4*a*c;
    

}
if (d> 0.0)   
{  
 r1 = (-b + Math.pow(d, 0.5)) / (2*a);  
 r2 = (-b - Math.pow(d, 0.5)) / (2*a);  
System.out.println("The roots are " + r1 + " and " + r2);  
}   
else if (d ==0)   
{  
 r1 = -b / (2*a);  
System.out.println("The root is " + r1);  
}   
else   
{  
System.out.println("Roots are not real.");  
}  
}  


