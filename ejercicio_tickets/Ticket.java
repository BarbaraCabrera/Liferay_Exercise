package ejercicio_tickets;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Ticket{

    double total = 0;
    double final_price = 0;
    
	public  Ticket(List<Item> shopping_cart, List<Double> billing, List<Double> items_taxes) {

		//Necessary roundings are applied
		
		BigDecimal bd1 = new BigDecimal(Double.toString(billing.get(0)));
	    bd1 = bd1.setScale(1, RoundingMode.HALF_EVEN);
	    BigDecimal bd2 = new BigDecimal(Double.toString(billing.get(1)));
	    bd2 = bd2.setScale(2, RoundingMode.HALF_EVEN);
	    
	    DecimalFormat df = new DecimalFormat("0.00");
	    String sales_taxes = df.format(bd1);
	    String total_purchase_price = df.format(bd2);
		
	    //Start the sampling of the Ticket
	    
		System.out.println("\n----TICKET DE COMPRA----");
		
		for (int i = 0; i < shopping_cart.size(); i++) {
			
			BigDecimal bd3 = new BigDecimal(Double.toString(items_taxes.get(i)));
		    bd3 = bd3.setScale(2, RoundingMode.HALF_UP);
		    String final_price_product = df.format(bd3);
		    
		    //We show the prices with tax for each product
		    
			System.out.println(shopping_cart.get(i).getCuantity() + " " + shopping_cart.get(i).getProduct() + ": " + final_price_product + "€");
			
		}

		//And finally the total taxes applied in € and the total amount of the purchase
		
		System.out.println("Impuestos sobre las ventas: " + sales_taxes + "€");
		System.out.println("Total: " + total_purchase_price + "€");
		System.out.println("-----------------------\n");
	}
	
}