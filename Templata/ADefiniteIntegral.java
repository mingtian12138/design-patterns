package Templata;

public abstract class ADefiniteIntegral {
    abstract protected double getA();
    abstract protected double getB();
    abstract protected int getC();
    abstract protected double function(double x);
    public final double CalDefiniteIntegral(){
        double a=0,b=0,t=0,sum=0;
        int c=0;
        a=getA();b=getB();c=getC();
        if (a>b){
            t=a;a=b;b=t;
        }
        t=(b-a)/(double) c;
        for (int i=0;i<c;i++){
            sum=sum+t*function(a+i*t);
        }
        return sum;
    }
}