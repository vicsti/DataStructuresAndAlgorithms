package countofstrings;


  
class CountOfStrings  
{ 
      
// n is total number of characters. 
// bCount and cCount are counts of 'b' 
// and 'c' respectively. 
static int countStr(int n,  
                    int bCount,  
                    int cCount) 
{ 
    // Base cases 
    if (bCount < 0 || cCount < 0) return 0; 
    if (n == 0) return 1; 
    if (bCount == 0 && cCount == 0) return 1; 
  
    // Three cases, we choose, a or b or c 
    // In all three cases n decreases by 1. 
    int res = countStr(n - 1, bCount, cCount); 
    res += countStr(n - 1, bCount - 1, cCount); 
    res += countStr(n - 1, bCount, cCount - 1); 
  
    return res; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 3; // Total number of characters 
    System.out.println(countStr(n, 1, 2)); 
} 
} 