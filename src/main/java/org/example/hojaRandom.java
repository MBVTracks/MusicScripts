package org.example;

public class hojaRandom {
    public static String[] hoja(){
        String nota [] = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        return nota;
    }
    public static char aleatorio(){
        char aleatorio;
        aleatorio = (char) (Math.random()*12-0);
        return aleatorio;
    }
    public static void salida(String consola){
        System.out.print(consola);
    }
    public static String loop(){
        char[] nota = new char[7];
        for (int i = 0; i < nota.length; i++) {
            salida((hoja()[aleatorio()] + " "));
        }
        return null;
    }
    @Override
    public String toString() {
        return loop();
    }
}
