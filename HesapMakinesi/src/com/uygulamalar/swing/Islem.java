package com.uygulamalar.swing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextField;

public class Islem {

	private static Double sonuc = 0.0;
	private JTextField hesapAlani;
	private String ifade;

	public Islem(JTextField txtHesapAlani) {
		this.hesapAlani = txtHesapAlani;
	}

	public ArrayList<String> listeyeAt() {
		ifade = hesapAlani.getText();
		System.out.println(ifade);
		Integer uzunluk = ifade.length();
		ArrayList<String> list = new ArrayList<String>();

		String ifade2;
		String ifade3 = null;
		String mat_islem;
		for (int i = 0; i < uzunluk; i++) {

			/*
			 * if(ifade.contains("(")) { System.out.println("parantez baþlangýcý.."); }else
			 * { System.out.println("parantez yok;"); }
			 */
			ifade2 = ifade.substring(i, i + 1);
			if (i <= (uzunluk - 2)) {
				mat_islem = ifade.substring(i + 1, i + 2);
			} else {
				mat_islem = ".";
			}

			if (ifade2.equals("+") || ifade2.equals("-") || ifade2.equals("*") || ifade2.equals("/")
					|| ifade2.equals("(") || ifade2.equals(")")) {
				ifade3 = ifade2;
				list.add(ifade3);
				ifade3 = null;
			}

			else {
				if (ifade3 == null) {
					ifade3 = ifade2;
					if (mat_islem.equals(".") || mat_islem.equals("+") || mat_islem.equals("-") || mat_islem.equals("*")
							|| mat_islem.equals("/") || mat_islem.equals("(") || mat_islem.equals(")")) {
						list.add(ifade3);
						ifade3 = null;
					}
				} else {
					ifade3 = ifade3 + ifade2;
					if (mat_islem.equals(".") || mat_islem.equals("+") || mat_islem.equals("-") || mat_islem.equals("*")
							|| mat_islem.equals("/") || mat_islem.equals("(") || mat_islem.equals(")")) {
						list.add(ifade3);
						ifade3 = null;
					}

				}

			}

			System.out.println(list);

		}

		islemYap(list);
		System.out.println("Bitti:"+list);
		
		return list;

	}

	private ArrayList<String> islemYap(ArrayList<String> list) {

		boolean parantez = list.contains("(");
		List<String> list2 = new ArrayList<String>();

		int baslangic_index = 0, bitis_index = 0;
		if (parantez) {
			int i = 0;
			for (String str : list) {
				if (str.equals("(")) {
					baslangic_index = i;
				} else if (str.equals(")")) {
					bitis_index = i;
					break;
				}
				i++;
			}
			list2 = list.subList(baslangic_index + 1, bitis_index);

			islemOnceligi(list2);
			i = 0;
			for (String str : list) {
				if (str.equals("(")) {
					baslangic_index = i;
				} else if (str.equals(")")) {
					bitis_index = i;
					break;
				}
				i++;
			}
			list.remove(baslangic_index);
			list.remove(bitis_index - 1);
			System.out.println("Son hal:" + list);
			
			if(list.contains("(")&&list.contains(")")) {
				islemYap(list);
			}
			

		}
		
		
		if(list.size()!=1) {
			while(list.size()!=1) {
				islemOnceligi(list);
			}
		}
			
		System.out.println("en son hal.........."+list);
		return list;

	}

	private List<String> islemOnceligi(List<String> list2) {
		int i = 0;
		List<String> list4=list2;
		//System.out.println("list4"+list4);
		if (list4.contains("/")) {

			for (String str : list4) {
				if (str.equals("/")) {
					break;
				}

				i++;
			}
			List list3 = list4.subList(i - 1, i + 2);
			sonuc = Double.parseDouble((String) list3.get(0)) / Double.parseDouble((String) list3.get(2));
			list4.remove(i+1);
			list4.remove(i);
			list4.remove(i-1);
			list4.add(i-1,String.valueOf(sonuc));
			if(list4.contains("/")||list4.contains("*")) {
				islemOnceligi(list4);
			}

			// list2.add(i-1, String.valueOf(sonuc));
		}
		if (list4.contains("*")) {
			i=0;
			for (String str : list4) {
				if (str.equals("*")) {
					break;
				}

				i++;
			}
			List list3 = list4.subList(i - 1, i + 2);
			sonuc = Double.parseDouble((String) list3.get(0)) * Double.parseDouble((String) list3.get(2));
			list4.remove(i+1);
			list4.remove(i);
			list4.remove(i-1);
			list4.add(i-1,String.valueOf(sonuc));

			if(list4.contains("/")||list4.contains("*")) {
				islemOnceligi(list4);
			}
			
			// list2.add(i-1, String.valueOf(sonuc));
		}
		if (list4.contains("+")) {
			i=0;
			for (String str : list4) {
				if (str.equals("+")) {
					break;
				}

				i++;
			}
			List list3 = list4.subList(i - 1, i + 2);
			sonuc = Double.parseDouble((String) list3.get(0)) + Double.parseDouble((String) list3.get(2));
			list4.remove(i+1);
			list4.remove(i);
			list4.remove(i-1);
			list4.add(i-1,String.valueOf(sonuc));

			// list2.add(i-1, String.valueOf(sonuc));
		}
		if (list4.contains("-")) {
			i=0;
			for (String str : list4) {
				if (str.equals("-")) {
					break;
				}

				i++;
			}
			List list3 = list4.subList(i - 1, i + 2);
			sonuc = Double.parseDouble((String) list3.get(0)) - Double.parseDouble((String) list3.get(2));
			list4.remove(i+1);
			list4.remove(i);
			list4.remove(i-1);
			list4.add(i-1,String.valueOf(sonuc));

			// list2.add(i-1, String.valueOf(sonuc));
		}
		
		if(list4.contains("/")||list4.contains("*")||list4.contains("+")||list4.contains("-")) {
			islemOnceligi(list4);
		}
		
			return list4;
		
			

	}

	
	public static Double getSonuc() {
		return sonuc;
	}

	private static void setSonuc(Double sonuc) {
		Islem.sonuc = sonuc;
	}

	public JTextField getHesapAlani() {
		return hesapAlani;
	}

	private void setHesapAlani(JTextField hesapAlani) {
		this.hesapAlani = hesapAlani;
	}

}
