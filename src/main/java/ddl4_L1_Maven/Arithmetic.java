/**
 * 
 */
package ddl4_L1_Maven;

/**
 * @author Jean-Rene Nshuti
 *
 */
public class Arithmetic implements Calculator {

	/**
	 * 
	 */
	public Arithmetic() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ddl4_L1_Maven.Calculator#multiply(int, int)
	 */
	public int multiply(int a, int b) {
		
		int counter, res;
		boolean resEstNegatif = false;
		res = 0;
		counter = 1;
		
		if(a < 0) {
			resEstNegatif = !resEstNegatif;
			a = -a;
		}
		if(b < 0) {
			resEstNegatif = !resEstNegatif;
			b = -b;
		}
		while(counter <= a) {
			res = add(res,b);
			counter++;
		}	
		//counter = 1;	
	    if (resEstNegatif) {
	        res = -res;
	        }
		return res;
	}

	/* (non-Javadoc)
	 * @see ddl4_L1_Maven.Calculator#divide(int, int)
	 */
	public int divide(int a, int b) {
		
	    if (b == 0) {
	        throw new ArithmeticException();
	        }
	    boolean resEstNegatif = false;
	    int res = 0;
	    if ( a < 0) {
	        resEstNegatif = !resEstNegatif;
	        a = -a;
	    }
	    if ( b < 0) {
	        resEstNegatif = !resEstNegatif;
	        b = -b;
	    }
	    while (a > 0) {
            a = substract(a, b);
	    	//a = a - b;
	        res++;
	    }
	    if (resEstNegatif) {
	        res = -res;
	        }
	    return res;
	}

	/* (non-Javadoc)
	 * @see ddl4_L1_Maven.Calculator#add(int, int)
	 */
	public int add(int a, int b) {
		
	    int res = a;
	    
	    if (b > 0) {
	        while(b-- != 0) {
	                        res++;
	                }
	        }
	    else if (b < 0) {
	        while(b++ != 0) {
	                        res--;
	                }
	        }
	    return res;
	}

	/* (non-Javadoc)
	 * @see ddl4_L1_Maven.Calculator#substract(int, int)
	 */
	public int substract(int a, int b) {
		
	    // Iterate till there is no carry
	    while (b != 0)
	    {
	        // borrow contains common set bits of y and unset
	        // bits of x
	        int borrow = (~a) & b;

	        // Subtraction of bits of x and y where at least
	        // one of the bits is not set
	        a = a ^ b;

	        // Borrow is shifted by one so that subtracting it from
	        // x gives the required sum
	        b = borrow << 1;
	    }
	    return a;
	}

}
