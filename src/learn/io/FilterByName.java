package learn.io;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByName implements FilenameFilter {
	String suffix=null;
	
	public FilterByName(String suf) {
		super();
		this.suffix = suf;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(suffix);
	}

}
