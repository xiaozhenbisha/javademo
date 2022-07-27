package com.java.enumandannotation;

public enum Season implements MyInterface{
    SPRING{
        public void show(){
            System.out.println("春天");
        }
    },
    SUMMER{
        public void show(){
            System.out.println("夏天");
        }
    },
    AUTUMN{
        public void show(){
            System.out.println("秋天");
        }
    },
    WINTER{
        public void show(){
            System.out.println("冬天");
        }
    };

    /*@Override
    public void show() {
        System.out.println("季节");
    }*/
}
