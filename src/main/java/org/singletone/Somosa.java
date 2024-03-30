package org.singletone;

public class Somosa {

    private  static Somosa somosa;
    private Somosa(){
    }


    public static Somosa getSomosa(){

        if (somosa==null){

            synchronized (Somosa.class){
                if (somosa== null){
                    somosa= new Somosa();
                }
            }
        }

        return somosa;
    }
}
