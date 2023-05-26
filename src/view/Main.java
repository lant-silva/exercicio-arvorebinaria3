package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		
		for(int index : vetor) {
			a.insert((char) index);
		}
		try {
			a.prefixSearch();
			System.out.println("\n========================================");
			a.infixSearch();
			System.out.println("\n========================================");
			a.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
