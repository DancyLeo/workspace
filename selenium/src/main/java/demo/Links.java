package demo;

import java.util.Comparator;

public class Links {
	private String link;
	private String linktxt;
	
	public void setLink(String link) {
		this.link=link;
	}
	public String getLink() {
		return this.link;
	}
	public void setLinktxt(String linktxt) {
		this.linktxt=linktxt;
	}
	public String getLinktxt() {
		return this.linktxt;
	}/*
	public int compare(Links l1, Links l2) {
		return l1.compare(l1, l2);
	}
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	public String toString() {
		return link+":"+linktxt;
	}
	
}
