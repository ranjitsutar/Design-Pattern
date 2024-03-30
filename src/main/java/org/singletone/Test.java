package org.singletone;

import java.lang.reflect.Constructor;
import java.util.Objects;

public class Test {


    public static void main(String[] args) {

//        lazy Initialzation

//        Somosa somosa1=Somosa.getSomosa();
//        System.out.println(Objects.hashCode(somosa1));
//        Somosa somosa2=Somosa.getSomosa();
//        System.out.println(Objects.hashCode(somosa2));


//        Eager way

//        System.out.println(Objects.hashCode(Jalabi.getJalabi()));
//        System.out.println(Objects.hashCode(Jalabi.getJalabi()));

        /*
         * 1. Reflection API to break singleton pattern
         *
         */
//        Somosa somosa = Somosa.getSomosa();
//        System.out.println(Objects.hashCode(somosa));
//        Constructor<Somosa> constructor= Somosa.class.getDeclaredConstructors();
//        constructor.setAccessible(true);
//        Somosa somosa2 = constructor.newInstance();
//        System.out.println(Objects.hashCode(somosa2));
//


        /*
        *Solutionfor Reflection
        *
         */

    }


}
