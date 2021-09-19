package ejercicio_tickets;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	List<Item> store = new ArrayList<Item>();
	
	private Item newItem1 = new Item();
	private Item newItem2 = new Item();
	private Item newItem3 = new Item();
	private Item newItem4 = new Item();
	private Item newItem5 = new Item();
	private Item newItem6 = new Item();
	private Item newItem7 = new Item();
	private Item newItem8 = new Item();
	private Item newItem9 = new Item();
	
	public List<Item> createBBDD() {
		
		newItem1.setProduct("libro");
		newItem1.setCuantity(100);
		newItem1.setPrice(12.49);
		newItem1.setCategory("libro");
		newItem1.setImportation(false);
		
		newItem2.setProduct("CD de música");
		newItem2.setCuantity(100);
		newItem2.setPrice(14.99);
		newItem2.setCategory("otro");
		newItem2.setImportation(false);
		
		newItem3.setProduct("barrita de chocolate");
		newItem3.setCuantity(100);
		newItem3.setPrice(0.85);
		newItem3.setCategory("alimentacion");
		newItem3.setImportation(false);
		
		newItem4.setProduct("caja de bombones");
		newItem4.setCuantity(100);
		newItem4.setPrice(10.00);
		newItem4.setCategory("alimentacion");
		newItem4.setImportation(true);
		
		newItem5.setProduct("frasco de perfume");
		newItem5.setCuantity(100);
		newItem5.setPrice(47.50);
		newItem5.setCategory("otro");
		newItem5.setImportation(true);
		
		newItem6.setProduct("frasco de perfume");
		newItem6.setCuantity(100);
		newItem6.setPrice(27.99);
		newItem6.setCategory("otro");
		newItem6.setImportation(true);
		
		newItem7.setProduct("frasco de perfume");
		newItem7.setCuantity(100);
		newItem7.setPrice(18.99);
		newItem7.setCategory("otro");
		newItem7.setImportation(false);
		
		newItem8.setProduct("caja de pastillas para el dolor de cabeza");
		newItem8.setCuantity(100);
		newItem8.setPrice(9.75);
		newItem8.setCategory("productos medicos");
		newItem8.setImportation(false);
		
		newItem9.setProduct("caja de bombones");
		newItem9.setCuantity(100);
		newItem9.setPrice(11.25);
		newItem9.setCategory("alimentacion");
		newItem9.setImportation(true);
		
		store.add(newItem1);
		store.add(newItem2);
		store.add(newItem3);
		store.add(newItem4);
		store.add(newItem5);
		store.add(newItem6);
		store.add(newItem7);
		store.add(newItem8);
		store.add(newItem9);
		
		return store;	
		
	}
}