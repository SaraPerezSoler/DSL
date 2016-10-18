package es.uam.sara.tfg.properties.packages;

import java.io.File;
import java.util.List;


public class PackNoEmpty extends Package {

	public PackNoEmpty(List<String> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (String s: super.analyze){
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
}
