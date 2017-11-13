package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

/*
 *  design & performance issues
 *  ---------------------------
 *  
 *  --> tight-coupling b/w dependent & dependency-impln
 *  
 *      ==> difficult to maintain & extend with new features
 *  
 *  --> too many dependency instances created & destructed
 *  
 *  		==> slow, memory/resource consumption is high
 *  
 *  --> unit-testing not possible
 *  
 *      ==> dev/bug-fix slow
 * 
 *  ------------------------------------------------------------
 *  
 *  why these issues ar raising here ?
 *  
 *  ==> dependent-obj itself creating its own dependency-obj
 *  
 *  soln:
 *  
 *  ==> don't create dependency in dependent's class, do lookup
 *  
 *  Limitation on lookup:
 *  
 *  ==> Location tight-coupling
 *  
 *  best soln :
 *  
 *  ==> don't create/lookup in dependent's class , inject by 'some-one' ( IOC )
 *  
 *  
 *  IOC ==> Inversion Of Control 
 *  
 *    how to implement IOC ?
 *    
 *    -> Dependency Injection 
 *    -> AOP
 *    
 *  --------------------------------------------------------
 *  
 *  S.O.L.I.D. STANDS FOR:
 *  
 *  S — Single responsibility principle ( srp )
 *  O — Open for extension & closed for modification principle
 *  L — Liskov substitution principle
 *  I — Interface segregation principle
 *  D — Dependency Inversion principle
 *  
 *  
 *  -----------------------------------------------------------
 *  
 *  
 * 
 */

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix;

	public double geTotalPrice(String[] cart) {
		priceMatrix = new PriceMatrixImpl_v1();
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;

	}

}
