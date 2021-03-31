package lineup;

import java.util.Random;
import java.util.Scanner;

public class lineup {
	
	
	static String[] kaleci= {"Altay Bayýndýr","Harun Tekin"};
	static String[] stoper= {"Atila Szalai","Serdar Aziz","Marcel Tisserand","Mauricio Lemos"};
	static String[] solbek= {"Caner Erkin",	"Filip Novak"};
	static String[] sagbek= {"Nazým Sangare","Gökhan Gönül"};
	static String[] onlibero= {"Jose Sosa","Luiz Gustavo","Ozan Tufan","Mert Hakan"};
	static String[] solkanat= {"Diego Perotti","Thiam"};
	static String[] sagkanat= {"Osayi-Samuel","Ferdi Kadýoðlu","Enner Valencia"};
	static String[] merkez= {"Dimitrios Pelkas","Mesut Özil","Ýrfancan Kahveci"};
	static String[] santrafor= {"Sinan Gümüþ","Samatta"};
 	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		
     	String kalecisec=kaleci[random.nextInt(2)];
		String solbeksec=solbek[random.nextInt(2)];
		String stoper1=stoper[random.nextInt(4)];
		String stoper2=stoper[random.nextInt(4)];
	
		do {
			stoper2=stoper[random.nextInt(4)];
		}while(stoper1==stoper2);
		
		String sagbeksec=sagbek[random.nextInt(2)];
		
		String onlibero1=onlibero[random.nextInt(4)];
		String onlibero2=onlibero[random.nextInt(4)];
	
		do {
			onlibero2=onlibero[random.nextInt(4)];
		}while(onlibero1==onlibero2);
		
		
		String solkanatsec=solkanat[random.nextInt(2)];
		String merkez1=merkez[random.nextInt(3)];
		String merkez2=merkez[random.nextInt(3)];
		do {
			merkez2=merkez[random.nextInt(3)];
		}while(merkez1==merkez2);
		
		String sagkanatsec=sagkanat[random.nextInt(2)];
		String santrafor1=santrafor[random.nextInt(2)];
		String santrafor2=santrafor[random.nextInt(2)];
		do {
			santrafor2=santrafor[random.nextInt(2)];
		}while(santrafor1==santrafor2);
		System.out.println("1->   4-1-4-1 ");
		System.out.println("2->   4-4-2 ");
		System.out.println("3->   4-2-3-1 ");
		System.out.println("Formasyon seçimi yapýnýz 1, 2, 3 ?");
		int formasyon=scan.nextInt();
	
		
		
        switch(formasyon) {
		case 1://4141
			System.out.println("\t\t\t"+kalecisec);
			System.out.print(solbeksec+"\t");
			System.out.print(stoper1+"\t");
			System.out.print(stoper2+"\t");
			System.out.println(sagbeksec);
			System.out.println("\t\t\t"+onlibero1);
			System.out.print(solkanatsec+"\t");
			System.out.print(merkez1+"\t");
			System.out.print(merkez2+"\t");
			System.out.println(sagkanatsec);
			System.out.print("\t\t\t"+santrafor1);
			break;
		case 2://442
			System.out.println("\t\t\t"+kalecisec);
			System.out.print(solbeksec+"\t");
			System.out.print(stoper1+"\t");
			System.out.print(stoper2+"\t");
			System.out.println(sagbeksec);
			System.out.print(solkanatsec+"\t");
			System.out.print(merkez1+"\t");
			System.out.print(merkez2+"\t");
			System.out.println(sagkanatsec);
			System.out.print("\t"+santrafor1+"\t");
			System.out.println("\t"+santrafor2);
			break;
		case 3://4231
			System.out.println("\t\t\t"+kalecisec);
			System.out.print(solbeksec+"\t");
			System.out.print(stoper1+"\t");
			System.out.print(stoper2+"\t");
			System.out.println(sagbeksec);
			System.out.print("\t"+onlibero1+"\t");
			System.out.println(onlibero2);
			System.out.print(solkanatsec+"\t");
			System.out.print(merkez1+"\t");
			System.out.println(sagkanatsec+"\t");
			System.out.print("\t\t\t"+santrafor1);
			break;
		default:
			break;
		
		}
	}

}
