package edu.mce.john.mobilestore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.mce.john.mobilestore.controllers.MobileController;
import edu.mce.john.mobilestore.models.Mobile;
import edu.mce.john.mobilestore.services.MobileService;
public class MobileStoreApp {
	public static void main(String[] args) {
		MobileController ctrl = new MobileController();
		ctrl.mobileOperations();
	}
}
