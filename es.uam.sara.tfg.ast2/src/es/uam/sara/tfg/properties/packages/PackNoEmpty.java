package es.uam.sara.tfg.properties.packages;

import java.io.File;
import java.util.List;


public class PackNoEmpty extends Package {

	public PackNoEmpty() {
		super();
	}

	@Override
	public void check(List<String> analyze) {
		for (String s: analyze){
			File file= new File(s);
			if (file.isDirectory()){
				if (file.list().length!=0){
					super.addRight(s);
				}else{
					super.addWrong(s);
				}
			}
		}
	}
	@Override
	public String toString() {
		return "no empty";
	}
}
