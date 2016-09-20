package es.uam.sara.tfg.properties.packages;

import java.io.File;
import java.util.List;

import es.uam.sara.tfg.properties.PropertiesException;

public class NoEmpty extends Package {

	public NoEmpty(List<String> analyze) {
		super(analyze);
	}

	@Override
	public void check() {
		for (String s: super.analyze){
			File file= new File(s);
			try{
			if (file.isDirectory()){
				if (file.list().length!=0){
					super.addRight(s);
				}else{
					super.addWrong(s);
				}
			}
			}catch(PropertiesException e){
				e.printStackTrace();
			}
		}
	}
}
