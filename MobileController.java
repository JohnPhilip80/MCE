package edu.mce.john.mobilestore.controllers;

import java.util.Scanner;

import edu.mce.john.mobilestore.services.MobileService;

public class MobileController {
	private MobileService service;
	public MobileController() {
		service = new MobileService();
	}
	public void mobileOperations() {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1. Create Mobile, 2. Read Mobiles, 3. Update Mobile, 4. Delete Mobile, 5.Read Mobile, 6.Exit Program");
			choice = scan.nextInt(); scan.nextLine();
			switch(choice) {
			case 1:
				service.createMobile();
				break;
			case 2:
				service.showMobiles();
				break;
			case 3:
				service.modifyMobile();
				break;
			case 4:
				service.removeMobile();
				break;
			case 5:
				service.showMobile();
				break;
			default:
				choice = 0;
				break;
			}
		}while(choice !=0);
		System.out.println("Program Ends Here!");
	}
}
