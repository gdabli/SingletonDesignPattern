package composite;

import java.util.Date;

import composite.File;
import composite.Directory;

public class Link extends FSElement{
	private FSElement fixedPoint;
	
	public Link(Directory parent, Date created) {
		super(parent, created);			
	}
	Link(File file, String name, int size,Date created, String owner){
		super(file.getParent(), created);
		if(file!= null)
			file.getParent().appendChild(this);
		this.name = name;
		this.owner = owner;
		this.size = size;
		this.type = "Directory";
	}

	int getSize() {
		return this.size;
	}


	boolean isLeaf() {
		return false;
	}
	
	public String getInfo(){
		return super.getInfo();
	}
	
	public void setfixedPoint(File fixedPoint) {
		this.fixedPoint = fixedPoint;
	}
	public void setfixedPoint(Directory fixedPoint) {
		this.fixedPoint = fixedPoint;
	}

	public String getfixedPoint() {
		return fixedPoint.getInfo();
	}
	

}
