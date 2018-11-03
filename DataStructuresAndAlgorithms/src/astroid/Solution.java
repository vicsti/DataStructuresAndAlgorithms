package astroid;

import java.util.Iterator;
import java.util.Stack;

class Solution {
	  public static void main(String[] args) {
	    Asteroid[] case1 = new Asteroid[] {
	      new Asteroid(1, 1),
	      new Asteroid(5, -1),
	      new Asteroid(7, 1),
	      new Asteroid(3, -1),
	    };

	    Asteroid[] case2 = new Asteroid[] {
	      new Asteroid(1, 1),
	      new Asteroid(3, 1),
	      new Asteroid(5, 1),
	      new Asteroid(7, -1),
	    };

	    Asteroid[] case3 = new Asteroid[] {
	      new Asteroid(5, 1),
	      new Asteroid(1, 1),
	      new Asteroid(4, -1),
	    };

	    Asteroid[] case4 = new Asteroid[] {
	        new Asteroid(1, 1),
	        new Asteroid(5, 1),
	        new Asteroid(4, -1),
	    };


	    testCase(1, case1, 1);
	    testCase(2, case2, 0);
	    testCase(3, case3, 1);
	    testCase(4, case4, 2);
	  }

	  static void testCase(int caseNum, Asteroid[] asteroids, int expected) {
	    int result = countHits(asteroids);
	    System.out.print("Case " + caseNum + ": ");
	    if (result == expected) {
	      System.out.println("PASSED");
	    } else {
	      System.out.println("FAILED: got " + result + " expected " + expected);
	    }
	  }


	  static int countHits(Asteroid[] asteroids) {
	    Stack<Asteroid> astStack = new Stack<Asteroid>();
	    //int size=0;
	    //Iterator it=null;	    
	    for(Asteroid eachAst : asteroids){    
	        if(eachAst.getDirection() == 1) {
	        	astStack.push(eachAst);  
	        	//size++;
	        } else if (eachAst.getDirection() == -1){   
	          //it=astStack.iterator();
	          while(!astStack.isEmpty()){
	          if (astStack.pop().getMass() > eachAst.getMass()) return astStack.size()+1;            
	          }       
	          
	        }
	        
	       
	    }
	    return 0; // TODO
	  }
	}
