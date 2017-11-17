package demo;

import java.util.Comparator;

public class linkComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Links l1=(Links)o1;
		Links l2=(Links)o2;
		return l1.getLink().compareTo(l2.getLink());
	}
}
