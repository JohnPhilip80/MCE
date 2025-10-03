package edu.mce.john.mobilestore.services;

import java.util.List;
import java.util.Scanner;

import edu.mce.john.mobilestore.models.Mobile;
import edu.mce.john.mobilestore.repository.MobileRepository;

public class MobileService {
	private MobileRepository repo;
	
	public MobileService() {
		repo = new MobileRepository();
	}
	public void showMobiles(){
		List<Mobile> mobiles = repo.readMobiles();
		Mobile mb;
		System.out.printf("%-10s%-15s%-20s%-10s\n","Id","Brand","Owner","Price");
		for(int i=0;i<mobiles.size();i++) {
			mb = mobiles.get(i);
			System.out.printf("%-10d%-15s%-20s%-10.2f\n",mb.getId(), mb.getBrand(), mb.getOwner(), mb.getPrice());
		}
	}
	public void createMobile() {
		Mobile mb = new Mobile();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Brand:"); mb.setBrand(scan.nextLine());
		System.out.println("Enter Mobile Owner:"); mb.setOwner(scan.nextLine());
		System.out.println("Enter Mobile Price:"); mb.setPrice(scan.nextDouble());
		repo.createMobile(mb);
		System.out.println("Mobile Created Successfully!");
	}
	public void modifyMobile() {
		Mobile mb = new Mobile();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Id to Update:"); mb.setId(scan.nextLong());scan.nextLine();
		System.out.println("Enter Updated Mobile Brand:"); mb.setBrand(scan.nextLine());
		System.out.println("Enter Updated Mobile Owner:"); mb.setOwner(scan.nextLine());
		System.out.println("Enter Updated Mobile Price:"); mb.setPrice(scan.nextDouble());
		repo.updateMobile(mb);
		System.out.println("Mobile Updated Successfully!");
	}
	public void removeMobile() {
		Long id;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Id to Delete:"); id = scan.nextLong();scan.nextLine();
		repo.deleteMobile(id);
		System.out.println("Mobile Deleted Successfully!");
	}
	public void showMobile() {
		Long id;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Id to Show:"); id = scan.nextLong();scan.nextLine();
		Mobile mb = repo.readMobile(id);
		System.out.printf("%-10d%-15s%-20s%-10.2f\n",mb.getId(), mb.getBrand(), mb.getOwner(), mb.getPrice());
	}
}
