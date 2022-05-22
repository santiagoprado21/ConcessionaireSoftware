package model;

import java.util.ArrayList;
import java.util.Random;

public class Document {
	private double price;
	private Date year;
	private String code;
	private int[][] image;
	
	public Document(double price, Date year) {
		 this.price = price;
		 this.year = year;
		 this.image = generateMatrix();
		 
		 Random r=new Random();
		 image = new int[4][4];
		 for (int i=0;i<4;i++) {
			 for(int j=0;j<4;j++) {
				 
				 image[i][j] = r.nextInt(20);
			 }
		 }
		 
		 this.code = generateCode();
		 
	}
	
	/**
	* @deprecated Metodo usado para recorer la matriz en L 
	*/
	
	public String generateCode() {
		
		String msg = "";
		
		for(int i = 0;i<this.image.length ;i++) {
			msg +=  " " + this.image[i][0];
			if (i == this.image.length-1) {
				for (int j = 0; j < image[0].length; j++) {
					msg += " " + this.image[i][j];
				}
			}
		}	
		return msg;
	}
	
	/**
	* @deprecated Metodo usado para imprimir la matriz
	*/

	private String printImage(int[][] image) {
		String print = "";
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				print += image[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}
	
	
	private String generatePropertyCardCode() {
		
		String msg = "";
		for(int i =0;i<this.getImage().length;i--) {
			for(int j=0;j>=this.image[0].length-1;j--) {
				
				if((i+j)%2 == 0 && (i+j)>0) {
					
					msg += " " + this.getImage()[i][j];
				}
				
			}
		}
		return msg;
	}
	
	private String generateTechnoMecanicalCode() {
		
		String msg = "";
		for(int i = 0;i<this.getImage().length;i++) {
			for(int j = this.getImage()[0].length;j>=0;j--) {
				
			}
		}
		
		return msg;
	}
	
	/**
	* @deprecated Metodo usado para inicializar la matriz con tamano 4x4
	*/
	
	public int[][] generateMatrix() {

		int[][] soatMatrix = new int[4][4];

		return soatMatrix;

	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}
	
	public int[][] getImage() {
		return image;
	}

	public void setImage(int[][] image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Document info: " + "\nImage:\n" + printImage(image) + "\nCode:\n"
				+ code + "\n";
	}
	
}
