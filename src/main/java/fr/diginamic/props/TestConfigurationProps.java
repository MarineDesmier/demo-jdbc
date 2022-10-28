package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		
		ResourceBundle config = ResourceBundle.getBundle("database");
		String driverName = config.getString("database.driver");
		System.out.println(driverName);
		
		config.getKeys();
		
		Enumeration<String> monEnum = config.getKeys();
		while (monEnum.hasMoreElements()) {
			String cle = monEnum.nextElement();
			String val = config.getString(cle);
			System.out.println(cle + " -> " + val);
		}
		
	}

}
