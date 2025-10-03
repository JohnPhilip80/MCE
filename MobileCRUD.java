package edu.mce.john.mobilestore.models;

import java.util.List;

public interface MobileCRUD {
	void createMobile(Mobile mb);
	List<Mobile> readMobiles();
	void updateMobile(Mobile mb);
	void deleteMobile(Long id);
	Mobile readMobile(Long id);
}
