package com.library.main;

public class Main {
    public static void main(String args []) {
        Queue_lib CA = new Queue_lib(6);
        CA.add(3);
        CA.add(4);
        CA.add(4);
        CA.pechat();
        CA.extend();
        CA.pechat();
        CA.add(7);
        CA.pechat();
        CA.extend();
        CA.pechat();
        CA.extend();
        CA.pechat();
    }
}
