package skel;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

// Example of calling Clojure from Java:

public class Hello {
     public static void main(String[] args) {
         final Cljns skel = new Cljns("skel.core");

         IFn cljFn = Clojure.var("skel.core", "local-time-str");
         Object o = skel.fn("local-time-str").invoke("hello");
         System.out.println("Via Clojure, the local time is: " + o.toString());
     }
}
