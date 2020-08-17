/*Tomar el sistema de Piedra, Papel y Tijera, realizado en clase viernes 19/06 
y agregar la siguiente lógica:
- Permir 3 jugadas 
- Que tenga un tablero con los puntos de los jugadores, que se muestre al final 
del juego indicando el ganador.

Se necesita que se realice el diagrama de flujo antes de decodificar.
Subir el proyecto a un repositorio nuevo, teniendo encuentra que el repositorio 
se deberá llamar como el proyecto y el proyecto deberá tener el siguiente 
estructura para identificarlo
*/
import java.util.Random;
import java.util.Scanner;

public class Cruz1906Random {

   
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Random RD= new Random();
        int numeroRandom=RD.nextInt(3)+1;
        String jugador1="";
        String respuesta1="";
        String respuesta2="";
        String jugador2= "Compu";
        int contador=0;
        
        System.out.println("Inicio del juego: Piedra, Papel o Tijera ");
        System.out.println("La P es piedra");
        System.out.println("La L es papel");
        System.out.println("La T es tijera");
        System.out.println("Ingrese el nombre del jugador 1");
        jugador1=entrada.next();
        do{
        System.out.println("Introduzca una opcion: "+jugador1);
        respuesta1=entrada.next();
        contador++;
        
        switch(numeroRandom){
            case 1:
                respuesta2="P";
                break;
            case 2:
                respuesta2="L";
                break;
            case 3:
                respuesta2="T";
                break;
                
        }
            System.out.println("La respuesta de la compu fue: "+ respuesta2);
            
        if ((respuesta1.equals("P") && respuesta2.equals("P"))
                || (respuesta1.equals("L") && respuesta2.equals("L"))
                || (respuesta1.equals("T") && respuesta2.equals("T"))) {
            System.out.println("Empate");
        } else if (respuesta1.equals("T") && respuesta2.equals("L")) {
            System.out.println("El ganador es: " + jugador1);
        } else if (respuesta1.equals("T") && respuesta2.equals("P")) {
            System.out.println("El ganador es: " + jugador2);
        } else if (respuesta1.equals("P") && respuesta2.equals("L")){
        System.out.println("El gandor es: " + jugador2);
        }else if (respuesta1.equals("P")&& respuesta2.equals("T")){
            System.out.println("El ganador es: "+jugador1);
        }else if(respuesta1.equals("L")&& respuesta2.equals("P")){
            System.out.println("El ganador es: "+jugador1);
        }else if (respuesta1.equals("L")&& respuesta2.equals("T")){
            System.out.println("El ganador es: "+jugador2);
        }
        System.out.println("==========================================");
        System.out.println("Gracias por jugar");
        System.out.println("==========================================");
        
        }while(contador>0 &&contador<3);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
