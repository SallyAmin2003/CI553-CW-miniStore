package catalogue;

import java.util.Comparator;

public class SortByNum implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getProductNum().compareTo(p2.getProductNum());
	}

}
