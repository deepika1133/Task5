package com.deepika;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger; 






	public class HouseConstruction {

		private static final Logger logger = Logger.getLogger(HouseConstruction.class.getName());
		private static Scanner sc;

	    public static void main( String[] args ) throws IOException{

	    	sc = new Scanner(System.in);

	    	

	    	logger.info("Choose Materials to Construct a House : "+"\n"+"1.1200/- for Standard Materials"+"\n"+"2.1500/- for Above Standard Materials"+"\n"+"3.1800/- for High Standard Materials"+"\n"+"4.2500/- for High Standard and Fully Automated"+"\n");

	    	int choice = sc.nextInt();

	    	if(choice>=1&&choice<=4){

	    		logger.info("Enter Area for Construction : ");

	    		int area = sc.nextInt();

	    		logger.info("Cost for Construction is : "+calculateCost(area,choice)+"\n");

	    	}

	    	else{

	    		logger.info("Enter Valid Choice...!"+"\n");

	    	}

	    }



		private static float  calculateCost(int area, int choice) {

			// TODO Auto-generated method stub

			float cost = 0;

			switch(choice){

			case 1 : cost = area * 1200;

				break;

			case 2 : cost = area * 1500;

				break;

			case 3 : cost = area * 1800;

				break;

			case 4 : cost = area * 2500;

				break;

			}

			return cost;

		}



	}


