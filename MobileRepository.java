package edu.mce.john.mobilestore.repository;

import java.util.ArrayList;
import java.util.List;
import edu.mce.john.mobilestore.models.Mobile;
import edu.mce.john.mobilestore.models.MobileCRUD;

public class MobileRepository implements MobileCRUD {
	
	private List<Mobile> mobiles;
	
	public MobileRepository() {
		mobiles = new ArrayList<Mobile>();
		mobiles.add(new Mobile("Samsung","John",35000.00));
		mobiles.add(new Mobile("Apple","Sri Devi",65000.00));
		mobiles.add(new Mobile("Motorola","Krishna",25000.00));
		mobiles.add(new Mobile("Redmi","Divya",35600.00));
		mobiles.add(new Mobile("Vivo","Karthik",23000.00));
	}
	@Override
	public List<Mobile> readMobiles() {
		return mobiles;
	}
	@Override
	public void createMobile(Mobile mb) {
		mobiles.add(mb);
	}
	@Override
	public void updateMobile(Mobile mb) {
		for(int i=0;i<mobiles.size();i++) {
			if(mobiles.get(i).getId().equals(mb.getId())) {
				mobiles.get(i).setBrand(mb.getBrand());
				mobiles.get(i).setOwner(mb.getOwner());
				mobiles.get(i).setPrice(mb.getPrice());
				break;
			}
		}
	}
	@Override
	public void deleteMobile(Long id) {
		for(int i=0;i<mobiles.size();i++) {
			if(mobiles.get(i).getId().equals(id)) {
				mobiles.remove(i);
				break;
			}
		}
	}
	@Override
	public Mobile readMobile(Long id) {
		Mobile mb = null;
		for(int i=0;i<mobiles.size();i++) {
			if(mobiles.get(i).getId().equals(id)) {
				mb = mobiles.get(i);
			}
		}
		return mb;
	}
}
