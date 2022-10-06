package com.ufv.ejemplo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        Perritos perro = new Perritos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la raza del perro");
        perro.getRaza(sc.nextLine());


        System.out.println("Escribe tu nombre");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tus apellidos");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu edad");
        p.setEdad(sc.nextInt());
        System.out.println("Escribe tu DNI");
        p.setDnisinletra(sc.nextInt());

        System.out.print("Buenos dias: " + p.getNombre() + " "+ p.getApellidos() + " "+ p.getEdad() + " " + p.getDnisinletra());
    }
}

