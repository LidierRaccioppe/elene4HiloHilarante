package elena4hilohilarante;

import static java.lang.Thread.sleep;
import java.util.Random;

public class Elena4HiloHilarante {
    public static void main(String[] args) {
        
        new hiloPar("par").start();
        new hiloImpar("impar").start();
        new hiloTerminadoEn2or3("2o3 o 3o2").start();
        
        
    }
}

class hiloPar extends Thread {

    // Del 1 al 1000 incluyendo los limites [1,1000]
    
    public hiloPar(String nombre) {
        super(nombre);
    }

    public void run() {
        int suma = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i%2==0){
                suma = suma + i;
            }
        }
        System.out.println("Total par = "+suma);
    }
}

class hiloImpar extends Thread {
    
    // Del 1 al 1000 incluyendo los limites [1,1000]
    
    public hiloImpar(String nombre) {
        super(nombre);
    }
    
    public void run() {
        int suma = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i%2!=0){
                suma = suma + i;
            }
        }
        System.out.println("Total par = "+suma);
    }
}

class hiloTerminadoEn2or3 extends Thread {
    
    // Del 1 al 1000 incluyendo los limites [1,1000]
    
    public hiloTerminadoEn2or3(String nombre) {
        super(nombre);
    }
    public void run() {
        
        
        int suma = 0;
        String jugadaMuySucia;
        for (int i = 1; i <= 1000; i++) {
            jugadaMuySucia= Integer.toString(i);
            // System.out.println("El string "+jugadaMuySucia);
            // System.out.println("la suma en el for "+suma);
            // System.out.println("el to string "+ Integer.toString(i));
            char resultadoMuySucio = jugadaMuySucia.charAt(jugadaMuySucia.length()-1);
            // System.out.println("result" + resultadoMuySucio);
            if(resultadoMuySucio=='2'||resultadoMuySucio=='3'){
                suma = suma + i;
            }
        }
        System.out.println("Total terminado en 2 o 3 = "+suma);
        
    }
}
























