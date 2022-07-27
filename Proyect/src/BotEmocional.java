import java.util.Scanner;
import java.util.Random;


public class BotEmocional {

	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Bienvenid@, serías tan amable de indicarme tu nombre");
	String nombre = sc.nextLine();	
	System.out.println("¡HOLA! " + nombre + " que lindo verte por estos lados");
	System.out.println("¿Como te sientes el día de hoy?\n"
					   + "1. Feliz\n"
					   + "2. Enojado\n"
					   + "3. Triste");
	
	String [] chistecitos = {"Que le dijo una polla a mi polla? Cometela", "Si yo fuera tu bebe, me daria una oportunidad"};
	Random rn = new Random();
	
	int emocion = sc.nextInt();
	
	if(emocion ==1)
	{
		System.out.println("La vida es color de rosas, vivela!");
	}
	else if(emocion == 2)
	{
		System.out.println("Cuando yo me enojo, me gusta meditar. Me ayuda a poner las cosas en perspectiva, intentalo!");
	}
	
	else if(emocion == 3)
	{
		System.out.println("Te voy a contar un chiste para que se te pase la tristeza\n" + chistecitos[0]);
	}
	
	sc.close();

	}
	
}
