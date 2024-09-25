import java.lang.*;
public class Food extends QuantityDialog{
	 // private int[] foodCart = new int[12];
	  
	  
	  
    /*  foodCart = {spaghettiValue, pastaValue, meatballValue, saladValue,
                             steakValue, chickenfriedValue, burgerValue, friedriceValue,
                             pancakeValue, tacosValue, ricebowlValue, pizzaValue};    
							*/
							 
							 
						private	 int spaghettiValue;
						private	 int pastaValue;
						private	 int meatballValue; 
						private	 int saladValue;
                        private    int steakValue;
						private	 int chickenfriedValue; 
						private	 int burgerValue;
						private	 int friedriceValue;
                        private     int pancakeValue;
						private	 int tacosValue;
						private	 int ricebowlValue;
						private	 int pizzaValue;
							 
							 public Food(int spaghettiValue, int pastaValue, int meatballValue, int saladValue,
                    int steakValue, int chickenfriedValue, int burgerValue, int friedriceValue,
                int pancakeValue, int tacosValue, int ricebowlValue, int pizzaValue) {
        	
									this.spaghettiValue=spaghettiValue;
									this.pastaValue=pastaValue;
									this.meatballValue=meatballValue;
									this.steakValue=steakValue;
									this.saladValue=saladValue;
									this.chickenfriedValue=chickenfriedValue;
									this.burgerValue=burgerValue;
									this.pancakeValue=pancakeValue;
									this.tacosValue=tacosValue;
									this.ricebowlValue=ricebowlValue;
									this.pizzaValue=pizzaValue;
									this.friedriceValue=friedriceValue;
										
					                 }
									public void  setSpaghettiValue(int spaghettiValue){
									
                                         if (0 < spaghettiValue) {
                                   spaghettiValue = spaghettiValue * 6; 
                                          this.spaghettiValue=spaghettiValue;
										  
										 }
									 }
										 public int getSpaghettiValue() {
											 if(spaghettiValue==0){
												
											 }
                                      return spaghettiValue;
                                         }
										 
							public void  setPastaValue(int pastaValue){
									
                                         if (0 < pastaValue) {
                                   pastaValue = pastaValue * 3; 
                                          this.pastaValue=pastaValue;
										  
										 }
									 }
										 public int getPastaValue() {
											 if(pastaValue==0){
												 
											 }
                                      return pastaValue;
                                         }
										 
									public void  setMeatballValue(int meatballValue){
									
                                         if (0 < meatballValue) {
                                   meatballValue = meatballValue * 4; 
                                          this.meatballValue=meatballValue;
										  
										 }
									 }
										 public int getMeatballValue() {
											 if(meatballValue==0){
												 
											 }
                                      return meatballValue;
                                         }
										 
								public void  setSaladValue(int saladValue){
									
                                         if (0 < saladValue) {
                                   saladValue = saladValue * 8; 
                                          this.saladValue=saladValue;
										  
										 }
									 }
										 public int getSaladValue() {
											 if(saladValue==0){
												 
											 }
                                      return saladValue;
                                         }
										 
								public void  setSteakValue(int steakValue){
									
                                         if (0 < steakValue) {
                                   steakValue = steakValue * 25; 
                                          this.steakValue=steakValue;
										  
										 }
									 }
										 public int getSteakValue() {
											 if(steakValue==0){
												 
											 }
                                      return steakValue;
                                         }
										 
								public void  setChickenfriedValue(int chickenfriedValue){
									
                                         if (0 < chickenfriedValue) {
                                   chickenfriedValue = chickenfriedValue * 7; 
                                          this.chickenfriedValue=chickenfriedValue;
										  
										 }
									 }
										 public int getChickenfriedValue() {
											 if(chickenfriedValue==0){
												 
											 }
                                      return chickenfriedValue;
                                         }
										 
							public void  setBurgerValue(int burgerValue){
									
                                         if (0 < burgerValue) {
                                   burgerValue = burgerValue * 6; 
                                          this.burgerValue=burgerValue;
										  
										 }
									 }
										 public int getBurgerValue() {
											 if(burgerValue==0){
												 
											 }
                                      return burgerValue;
                                         }
										 
									public void  setFriedriceValue(int friedriceValue){
									
                                         if (0 < friedriceValue) {
                                   friedriceValue = friedriceValue * 6; 
                                          this.friedriceValue=friedriceValue;
										  
										 }
									 }
										 public int getFriedriceValue() {
											 if(friedriceValue==0){
												 
											 }
                                      return friedriceValue;
                                         }
										 
								public void  setPancakeValue(int pancakeValue){
									
                                         if (0 < pancakeValue) {
                                   pancakeValue = pancakeValue * 3; 
                                          this.pancakeValue=pancakeValue;
										  
										 }
									 }
										 public int getPancakeValue() {
											 if(pancakeValue==0){
												 
											 }
                                      return pancakeValue;
                                         }
										 
								public void  setTacosValue(int tacosValue){
									
                                         if (0 < tacosValue) {
                                   tacosValue = tacosValue * 5; 
                                          this.tacosValue=tacosValue;
										  
										 }
									 }
										 public int getTacosValue() {
											 if(tacosValue==0){
												 
											 }
                                      return tacosValue;
                                         }
										 
								public void  setRicebowlValue(int ricebowlValue){
									
                                         if (0 < ricebowlValue) {
                                   ricebowlValue = ricebowlValue * 4; 
                                          this.ricebowlValue=ricebowlValue;
										  
										 }
									 }
										 public int getRicebowlValue() {
											 if(ricebowlValue==0){
												 
											 }
                                      return ricebowlValue;
                                         }
										 
								public void  setPizzaValue(int pizzaValue){
									
                                           if (0 < pizzaValue) {
                                   pizzaValue = pizzaValue * 6; 
                                          this.pizzaValue=pizzaValue;
										  
										  
										 }
									 }
										 public int getPizzaValue() {
											 if(pizzaValue==0){
												 
											 }
                                      return pizzaValue;
                                         }
										 
				
}


    