package ejercicio_tickets;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{

        String exit_order = "";
        String exit_purchase = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataBase bbdd = new DataBase();
        List<Item> store = bbdd.createBBDD();
        List<Item> shopping_cart = new ArrayList<Item>();
        int item_without_stock = 0;
        List<String> items_not_available = new ArrayList<String>();
		SQLDatabaseConnection sqlDatabaseConnection = new SQLDatabaseConnection();
             
        try{
        	while(!exit_purchase.equals("salir")){
        		
        		System.out.println("Inicio de la compra\n");
        		exit_order = "";
        		shopping_cart.clear();
				sqlDatabaseConnection.dataBase();
        		
	            while(!exit_order.equals("terminar")){
	            	
	            	Item newItem = new Item();
	            
	            	//We ask the user for basic data about the product
	            	
	                System.out.println("Indique el producto:\n");
	                newItem.setProduct(br.readLine());
	
	                System.out.println("Indique la cantidad de productos:\n");
	                newItem.setCuantity(Integer.parseInt(br.readLine()));
	
	                System.out.println("Indique el precio:\n");
	                newItem.setPrice(Double.parseDouble(br.readLine()));
	
	                //With this information we look for the product in the store 
	                //and we obtain the rest of the data that the user does not have to know
	                //such as the category or if it is imported
	                
		            for (int i = 0; i < store.size(); i++) {
		            	
		    	    	if ((newItem.getProduct().equals(store.get(i).getProduct())) & (newItem.getPrice()==(store.get(i).getPrice())) &
		    	    			(newItem.getCuantity()<store.get(i).getCuantity())) {
		    	    		
		    	    		//If it matches the name, the price and the quantity purchased is less than the quantity available in the warehouse, 
		    	    		//we obtain the category and its import.
		    	    		
		    	    		newItem.setImportation(store.get(i).getImportation()); 
		    	    		newItem.setCategory(store.get(i).getCategory());
		    	    		
		    	    	}else if ((newItem.getProduct().equals(store.get(i).getProduct())) & (newItem.getPrice()==(store.get(i).getPrice())) &
		    	    			(newItem.getCuantity()>store.get(i).getCuantity())) {
		    	    		
		    	    		//In the opposite case, if more units are ordered than those available, we will indicate this to the user.
		    	    		
		    	    		System.out.println("No hay stock de este producto");
		    	    		item_without_stock = 1;
		    	    		items_not_available.add(newItem.getProduct());
		    	    		
		    	    	}
		            }		
		            
		            shopping_cart.add(newItem);
		            
	                System.out.println("Para salir escriba 'terminar' para seguir introduciendo productos escriba 'seguir'.\n");
	                exit_order = br.readLine();
	            
	            }
	            //Purchase calculations will only be made if there has been no stock problem with the items
		        
		        if (item_without_stock == 0) {
		        	
		        	@SuppressWarnings("unused")
		    		Calculations operations = new Calculations(store, shopping_cart);
		        	
		        }else {
		        	
		        	System.out.println("No se puede seguir en el proceso de compra porque no hay stock de los siguientes artículos: " + items_not_available);
	        
		        }
            
	            System.out.println("Para realizar una nueva compra escriba 'siguiente' para salir escriba 'salir'.\n");
	            exit_purchase = br.readLine();
        	} 
        
	        } catch (Exception e) {
	            System.out.println("ERROR");
	        }
	
	        
    }
}    

