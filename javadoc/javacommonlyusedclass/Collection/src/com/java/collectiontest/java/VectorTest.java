package com.java.collectiontest.java;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
    @Test
    public void test1(){
        Vector vec = new Vector();
        vec.addElement("AA");
        vec.addElement("BB");
        vec.addElement("CC");

        Enumeration elements = vec.elements();

        while(elements.hasMoreElements()){
            Object obj = elements.nextElement();
            System.out.println(obj);
        }
    }

}
