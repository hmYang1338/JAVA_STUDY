package kosta.collection.sort;

import java.util.Comparator;

public class DescSortComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
//		return o1.compareTo(o2);	// ��������
		return o2.compareTo(o1);	// ��������
	}
	
} // end of class
