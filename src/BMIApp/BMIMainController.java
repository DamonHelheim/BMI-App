package BMIApp;




import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.text.DecimalFormat;


public class BMIMainController implements Initializable {
	
	
	
	//Button Control
	@FXML private Button Btn_Calculate_BMI;
	@FXML private Button Button0;
	@FXML private Button Button1;
	@FXML private Button Button2;
	@FXML private Button Button3;
	@FXML private Button Button4;
	@FXML private Button Button5;
	@FXML private Button Button6;
	@FXML private Button Button7;
	@FXML private Button Button8;
	@FXML private Button Button9;
	@FXML private Button ButtonDelete;
	//end
	
	//Textfield Control
	@FXML private TextField TF_Enter_your_height;
	@FXML private TextField TF_Enter_your_weight;
	@FXML private TextField TF_Result;
	//end
	
	//Pane Control
	
	//@FXML private Pane Pane_Fill;
	
	//end
	
	//Text Control
	@FXML private Text Text_BMI_Calculator;
	@FXML private Text Text_Enter_your_height_in_cm_here;
	@FXML private Text Text_Enter_your_weight_in_kg_here;
	@FXML private Text Text_Result;
	@FXML private Text Text_Setting_the_language;
	@FXML private Text Text_Number_Pad;
	@FXML private Text Text_Select_your_gender;
	
	//end
	
	
	//Label
	@FXML private Label Label_Very_severely_underweight;
	@FXML private Label Label_Severely_underweight;
	@FXML private Label Label_Underweight;
	@FXML private Label Label_Normal_healthy_weight;
	@FXML private Label Label_Overweight;
	@FXML private Label Label_Obese_Class_I_Moderately_obese;
	@FXML private Label Label_Obese_Class_II_Severely_obese;
	@FXML private Label Label_Obese_Class_III_Very_severely_obese;
	//end
	
	
	@FXML private CheckBox CheckBox_Female;
	
	@FXML private CheckBox CheckBox_Male;
	
	
	//Combobox
		@FXML private ComboBox<String> Combox_Language;
		//end
		
		ObservableList<String> List_Language = FXCollections.observableArrayList("English", "German");
		
		final String[] Combobox_Language_Controll = new String [] {"English", "German"}; 
		
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			
			
			
			TF_Enter_your_height.setOnMouseClicked(new EventHandler<MouseEvent>() {
			      @Override
			      public void handle(MouseEvent e) {
			    	  	    		  
			    	  Button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+0;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  
			    	  Button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+1;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+2;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+3;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+4;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+5;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button6.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+6;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button7.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+7;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+8;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			    	  Button9.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal0 = TF_Enter_your_height.getText()+9;
								
								TF_Enter_your_height.setText(PreVal0);
					    	  
					      }
					    });
			    	  
			      }
			    });
			
			

			TF_Enter_your_weight.setOnMouseClicked(new EventHandler<MouseEvent>() {
			      @Override
			      public void handle(MouseEvent e) {
			    	  	    		  
			    	  Button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+0;
								
							TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+1;
								
								TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  
			    	  Button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+2;
								
								TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+3;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+4;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+5;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button6.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+6;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button7.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+7;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button8.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+8;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  Button9.setOnMouseClicked(new EventHandler<MouseEvent>() {
					      @Override
					      public void handle(MouseEvent e) {
					    	  	    		  
					    	  String PreVal1 = TF_Enter_your_weight.getText()+9;
								
					    	  TF_Enter_your_weight.setText(PreVal1);
					    	  
					      }
					    });
			    	  
			    	  
			      }
			    });
			
			
			CheckBox_Female.selectedProperty().addListener(new ChangeListener<Boolean>() {
		        	
		           public void changed(ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) {
		        	   
		        	   if(CheckBox_Female.isSelected() == true){
			        		 
			        		 CheckBox_Male.setDisable(true);
			        		 
			        	 } 
		        	   
		        	   else  if(CheckBox_Female.isSelected() == false){
			        		 
			        		 CheckBox_Male.setDisable(false);
			        		 
			        	 }  
		          }
		        });	
			
			CheckBox_Male.selectedProperty().addListener(new ChangeListener<Boolean>() {
	        	
		           public void changed(ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) {       	 
		        	   
		        	   if(CheckBox_Male.isSelected() == true){
			        		 
			        		 CheckBox_Female.setDisable(true);
			        		 
			        	 } 
		        	   
		        	   else  if(CheckBox_Male.isSelected() == false){
			        		 
		        		   CheckBox_Female.setDisable(false);
			        		 
			        	 }  	             
		             
		          }
		        });	
			
			
			
			
			
			Combox_Language.setItems(List_Language);
			Combox_Language.getSelectionModel().select(0);
			
			Combox_Language.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){

				@Override
				public void changed(ObservableValue<? extends Number> obervable, Number oldValue, Number newValue) {
					
					String a = Combobox_Language_Controll[newValue.intValue()];
					
					if(a == "German"){
						
						
						Text_BMI_Calculator				 			.setText("BMI Rechner");
						
						Text_Enter_your_height_in_cm_here			.setText("Geben Sie ihre Größe in cm ein");
						Text_Enter_your_weight_in_kg_here			.setText("Geben Sie ihr Gewicht in kg ein");
						Text_Setting_the_language		 			.setText("Sprache Einstellen");
						Text_Result						 			.setText("Ergebnis");
						Text_Number_Pad								.setText("Nummern Block");
						Text_Select_your_gender						.setText("Wählen Sie ihr Geschlecht");
						
						CheckBox_Female								.setText("Weiblich");
						CheckBox_Male								.setText("Männlich");
						
						Label_Very_severely_underweight				.setText("starkes Untergewicht");
						Label_Severely_underweight					.setText("mäßiges Untergewicht");
						Label_Underweight							.setText("leichtes Untergewicht");
						Label_Normal_healthy_weight					.setText("Normalgewicht");
						Label_Overweight							.setText("Präadipositas");
						Label_Obese_Class_I_Moderately_obese		.setText("Adipositas Grad I");
						Label_Obese_Class_II_Severely_obese			.setText("Adipositas Grad II");
						Label_Obese_Class_III_Very_severely_obese	.setText("Adipositas Grad III");
						
						Btn_Calculate_BMI							.setText("Berechne den BMI");
						
					}
					
					if(a == "English"){
										
						Text_BMI_Calculator				 			.setText("BMI Calculator");
						
						Text_Enter_your_height_in_cm_here			.setText("Enter your height in cm here");
						Text_Enter_your_weight_in_kg_here			.setText("Enter your weight in kg here");
						Text_Setting_the_language		 			.setText("Setting the language");
						Text_Result						 			.setText("Result");
						Text_Number_Pad								.setText("Number Pad");
						Text_Select_your_gender						.setText("Select your gender");
						
						
						CheckBox_Female								.setText("Female");
						CheckBox_Male								.setText("Male");
						
						
						Label_Very_severely_underweight				.setText("Very severely underweight");
						Label_Severely_underweight					.setText("Severely_underweightt");
						Label_Underweight							.setText("Underweight");
						Label_Normal_healthy_weight					.setText("Normal healthy weight");
						Label_Overweight							.setText("Overweight");
						Label_Obese_Class_I_Moderately_obese		.setText("Obese Class I Moderately obese");
						Label_Obese_Class_II_Severely_obese			.setText("Obese Class II Severely obese");
						Label_Obese_Class_III_Very_severely_obese	.setText("Obese Class III Very severely obese");
						
						
						Btn_Calculate_BMI							.setText("Calculate BMI");
						
						
					}
					
				}
				
			});
			
		}

		
		//TF_Enter_your_weight.getText().isEmpty() == true
		
		//Label_Very_severely_underweight				.setTextFill(Color.web("#0076a3"));
		//Label_Very_severely_underweight				.setTextFill(Color.web("white"));
		//Label_Overweight							.setTextFill(Color.web("white"));
				

		//String counter = PreVal;
				
		//TF_Enter_your_height.setText(String.valueOf(counter.length()));
		
	
	//Text_BMI_Calculator.setTextFill(Color.web("#0076a3"));
	
	
	//Numbers Pad actions start
	
	
	public void ButtonDelete(ActionEvent event){
		
		try{
	        
	        String a = TF_Enter_your_height.getText();
	        
	        TF_Enter_your_height.setText(a.substring(0, a.length()-1));
	        
	        String c2 = a;
			
	        TF_Enter_your_height.setText(String.valueOf(c2.length()-1));
			
	        } catch (Exception e){
	            
	        }
	        
		TF_Enter_your_height.requestFocus();
	}
	
	
	
	//Numbers pad actions end
	
	
	//ClearAll actions start
	public void BtnClearAllNS(ActionEvent event){
		
		TF_Enter_your_height.setText("");
		
	}
	//ClearAll actions ends
	
	
	//Sort out actions starts
	public void BtnSortOutNS(ActionEvent event){
		
		String a = TF_Enter_your_height.getText();
	    
		TF_Enter_your_height.setText(a.replaceAll("[^0-9]", ""));
		
	}
	//Sort out actions ends
	
	
	
	//Convert actions start
	
	public void BtnConvertNS(ActionEvent event){
		
		//if(comboBox1.getValue() == "Decimal" && comboBox2.getValue() == "Binary"){
			
		//	try {decimal_to_binary_calc();
			
		//	} catch(NumberFormatException e){
	            
		//       JOptionPane.showMessageDialog(null, "Sort Out");
	            
		//       String a = TFInputNS.getText();
	    
		//       TFInputNS.setText(a.replaceAll("[^0-9]", ""));
	            
		//     }
				
		}
		
		
	//  }
	
		
	
	
	//Number systems to decimal start
	
		public void Btn_Calculate_BMI(ActionEvent event){
			
			try {
				
				 if(CheckBox_Female.isSelected() == true){
					 
					 BMI_Calc_Female();
				 }
				 
				 else if(CheckBox_Male.isSelected() == true){
					 
					 BMI_Calc_Male();
					 
				 }
				 //not a real exception
				 else if(CheckBox_Female.isSelected() == false && CheckBox_Male.isSelected() == false){
					 
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("Warning Dialog");
						alert.setHeaderText("Choose a gender.");
						alert.setContentText("Careful with the next step!");

						alert.showAndWait();
					 }
			
			} catch(NumberFormatException e){
				
	            
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warning Dialog");
				alert.setHeaderText("Look, a Warning Dialog");
				alert.setContentText("Careful with the next step!");

				alert.showAndWait();
	            
	        }
			
			
			
		}
	
		public void BMI_Calc_Male(){
			
			Calculate_BMI BMI = new Calculate_BMI();
			
			int height = Integer.parseInt(TF_Enter_your_height.getText());
			
			int weight = Integer.parseInt(TF_Enter_your_weight.getText());
			
			BMI.BMI_Calculate(height, weight);
			
			
			if(BMI.BMI_Calculate(height, weight) < 16){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #064991;");
				Label_Very_severely_underweight				.setTextFill(Color.web("white"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			// kein else 
			if(BMI.BMI_Calculate(height, weight) >= 16 && BMI.BMI_Calculate(height, weight) < 17 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #045FE6;");
				Label_Severely_underweight					.setTextFill(Color.web("white"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 17 && BMI.BMI_Calculate(height, weight) < 18.5 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #0DB8F0;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 18.5 && BMI.BMI_Calculate(height, weight) < 25 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #04E653;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 25 && BMI.BMI_Calculate(height, weight) < 30 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #D9EB1B;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 30 && BMI.BMI_Calculate(height, weight) < 35 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFB234;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			
			if(BMI.BMI_Calculate(height, weight) >= 35 && BMI.BMI_Calculate(height, weight) < 40 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #D72F05;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 40){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #7F0101;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("white"));
				
			}
								
			DecimalFormat f = new DecimalFormat("#0.00"); 
						
			TF_Result.setText(String.valueOf(f.format(BMI.BMI_Calculate(height, weight))));
					
		}
		
		
		public void BMI_Calc_Female(){
			
			Calculate_BMI BMI = new Calculate_BMI();
			
			int height = Integer.parseInt(TF_Enter_your_height.getText());
			
			int weight = Integer.parseInt(TF_Enter_your_weight.getText());
			
			BMI.BMI_Calculate(height, weight);
			
			
			if(BMI.BMI_Calculate(height, weight) < 15){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #064991;");
				Label_Very_severely_underweight				.setTextFill(Color.web("white"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
				
			}
			
			// kein else 
			if(BMI.BMI_Calculate(height, weight) >= 15 && BMI.BMI_Calculate(height, weight) < 16 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #045FE6;");
				Label_Severely_underweight					.setTextFill(Color.web("white"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 16 && BMI.BMI_Calculate(height, weight) < 17.5 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #0DB8F0;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 17.5 && BMI.BMI_Calculate(height, weight) < 24 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #04E653;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 24 && BMI.BMI_Calculate(height, weight) < 30 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #D9EB1B;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 30 && BMI.BMI_Calculate(height, weight) < 35 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");
				Label_Very_severely_underweight				.setTextFill(Color.web("black"));
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Severely_underweight					.setTextFill(Color.web("black"));
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFB234;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("black"));
				
				
			}
			
			
			if(BMI.BMI_Calculate(height, weight) >= 35 && BMI.BMI_Calculate(height, weight) < 40 ){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");		
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #D72F05;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #FFFFFF;");
				
			}
			
			if(BMI.BMI_Calculate(height, weight) >= 40){
				
				Label_Very_severely_underweight				.setStyle("-fx-background-color: #FFFFFF;");		
				Label_Severely_underweight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Underweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Normal_healthy_weight					.setStyle("-fx-background-color: #FFFFFF;");
				Label_Overweight							.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_I_Moderately_obese		.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_II_Severely_obese			.setStyle("-fx-background-color: #FFFFFF;");
				Label_Obese_Class_III_Very_severely_obese	.setStyle("-fx-background-color: #7F0101;");
				Label_Obese_Class_III_Very_severely_obese	.setTextFill(Color.web("white"));
				
			}
								
			DecimalFormat f = new DecimalFormat("#0.00"); 
						
			TF_Result.setText(String.valueOf(f.format(BMI.BMI_Calculate(height, weight))));
					
		}

	 
	}
	
	


