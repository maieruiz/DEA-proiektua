package packLaboTaula;

import java.util.HashMap;

public class QuickSort {

	public static AktoreZerrenda quickSortAlgorithm(HashMap<String, Aktore> AktoreT) {
		AktoreZerrenda sortedList = new AktoreZerrenda();
		for (String key: AktoreT.keySet()) {
			sortedList.addAktorea(AktoreT.get(key));
		}
		//System.out.print(sortedList.getIzena(0) +"     "+ sortedList.getIzena(1));
		//System.out.print(sortedList.getIzena(0).compareTo(sortedList.getIzena(1)));
		quickSort(sortedList, 0, sortedList.size()-1);
		return sortedList;
	}
	
	private static void quickSort(AktoreZerrenda aktoreZ, int h, int b) {
		if (b-h > 0) {
			int index = divisor(aktoreZ, h, b);
			quickSort(aktoreZ, h, index-1);
			quickSort(aktoreZ, index+1, b);
		}
	}

	private static int divisor(AktoreZerrenda aktoreZ, int h, int b) {
		Aktore tempAktore = aktoreZ.get(h);
		String tempIzena = aktoreZ.getIzena(h);
		int left = h;
		int right = b;
		while (left < right) {
			while (aktoreZ.getIzena(left).compareTo(tempIzena) <= 0 && left < right)
				left++;
			while (aktoreZ.getIzena(right).compareTo(tempIzena) > 0 && left < right)
				right--;
			if (left < right)
				swap(aktoreZ, left, right);
		}
		if (aktoreZ.getIzena(right).compareTo(tempIzena) > 0)
	        right--;
		aktoreZ.set(h, aktoreZ.get(right));
		aktoreZ.set(right, tempAktore);
		return right;
	}
	
	private static void swap(AktoreZerrenda aktoreZ, int one, int two) {
		Aktore tempAktore = aktoreZ.get(one);
		aktoreZ.set(one, aktoreZ.get(two));
		aktoreZ.set(two, tempAktore);
	}

	
}
