package org.singletone;

public class Jalabi {

    private  static  Jalabi jalabi = new Jalabi();

   public  static  Jalabi getJalabi(){
       return  jalabi;
   }
}
