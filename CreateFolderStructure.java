package com.cgi.moneta.interface_swagger_generator.create_api;

import java.io.File;

public class CreateFolderStructure {

	public void createFolderStructure(File dir) {
		File[] directoryListing = dir.listFiles();
		if(directoryListing != null) {
			for(File child : directoryListing) {
				//vytahni z nazvu api name a verzi
				String name = child.getName();
				//vytvor adresare
				new File("..\\interface_swagger_generator\\apis\\"+ name + "\\" + name + "001" + "\\src").mkdirs();
				//https://dom4j.github.io/
			}
		}
	}
	
}
