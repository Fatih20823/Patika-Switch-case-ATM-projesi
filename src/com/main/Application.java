package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance =1500;
		int price,vote;
		boolean temp=true,login=true;
		while(login==true) {
			System.out.print("Kullanici Adiniz: ");
			userName = input.nextLine();
			System.out.print("Parolaniz: ");
			password = input.nextLine();
			
			
			switch((userName.equals("patika") && password.equals("dev123")) ? 1 : 2) {
			case 1:
				while (temp==true) {
				System.out.println("1-Para yatirma\n" +
                        "2-Para Cekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Cikis Yap");
				vote = input.nextInt();
				switch (vote) {
				case 1:
					System.out.print("Para miktarı : ");
                    price = input.nextInt();
                    balance += price;
                    break;
				case 2:
					System.out.print("Para miktarı : ");
                    price = input.nextInt();
                    switch (price > balance ? 1 : 2) {
                    case 1:
                    	System.out.println("Bakiye yetersiz.");
                    	break;
                    case 2:
                    	balance -= price;
                    	break;
                    }
                    break;
				case 3:
					System.out.println("Bakiyeniz : " + balance);
					break;
				case 4:
					System.out.println("Tekrar gorusmek uzere.");
					temp=false;
					login=false;
				}				
				}
				break; 
			default:
				right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                switch (right) {
                case 0:
                	System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                	login=false;
                	break;
                default:
                	System.out.println("Kalan Hakkınız : " + right);
                	break;
                }
			}						
		}
		input.close();
	}

}
