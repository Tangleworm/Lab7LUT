package createlut;

/**
 * Creates a look-up table for the 8051 assembly language.
 * For use with lab 7.
 * 
 * @author Justin Wang
 */
public class CreateLUT {

	public static void main( String[] args ){
		
		//print lookup table name
		System.out.println("; Lookup table of temperatures");
		System.out.println("LUT: ");
		
		//print lookup table contents
		for( int i = 0; i < 1024; i++ ){
			
			double temp = 10 * ( 0.1365553 * i - 40 );
			
			System.out.print("	dw	");
			
			//round the value
			if( temp - (int) temp >= 0.5 ){
				System.out.print( (int) temp + 1 );
			}
			else{
				System.out.print( (int) temp );
			}
			
			System.out.println("	; "+i);
		}
	}
}
