package Streamapi;

public class Singleton {


    public static final Singleton obj=new Singleton();

    private Singleton(){
    }
    public static Singleton getinstance(){

        return obj;
    }



    public static void main(String[] args) {



            Singleton v=getinstance();

            Singleton v1=getinstance();



            System.out.println(v.equals(v1));
    }

    }
