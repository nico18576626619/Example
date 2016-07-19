package learn.config;

import java.io.File;
import java.io.FilenameFilter;

public class buffixfilter implements FilenameFilter {
	String suffix=null;
	
	public buffixfilter(String suffix) {
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(suffix);
	}

}
