package ejercicio_tickets;

import java.util.ArrayList;
import java.util.List;

public class Calculations{
	
    List<Double> billing = new ArrayList<Double>();
    List<Double> items_taxes = new ArrayList<Double>();
    
	public Calculations(List<Item> almacen, List<Item> shopping_cart) {
		       		
		double sales_taxes = 0;
		double total_price = 0;
		double taxes_calculation = 0;
		double applicable_taxes = 0;
		
		for(int i = 0; i < shopping_cart.size(); i++){
					
			//We check the category of the product and its import in order to know which taxes should be applied to each product
			
			int basic_tax = 0;
			int import_tax = 0;
			
			if (shopping_cart.get(i).getCategory().equals("otro")){
						
				basic_tax = 10;
							
			}
		
			if(shopping_cart.get(i).getImportation()==true){
					
					import_tax = 5;
					
			}
					
			//We carry out the necessary tax calculations
				
			applicable_taxes = basic_tax + import_tax; //sum of applicable taxes
				
			//calculation in € of the applicable taxes for each item
			taxes_calculation = (shopping_cart.get(i).getCuantity() * ((shopping_cart.get(i).getPrice() * applicable_taxes) / 100));
				
			sales_taxes += taxes_calculation; //sum of all taxes in €    
			total_price = total_price + (shopping_cart.get(i).getPrice() + taxes_calculation);//total purchase price 
			    
			//we calculate the prices of each item with the tax applied to it
			double final_price = ((shopping_cart.get(i).getPrice() + taxes_calculation));
			    
			items_taxes.add(final_price); 
			
		}
		
		billing.add(sales_taxes);
		billing.add(total_price);
		
		@SuppressWarnings("unused")
		Ticket factura = new Ticket(shopping_cart, billing, items_taxes);
		
	}

}