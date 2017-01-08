public class LongestPlateau { 

/*
Create start index and longest length variables.
For every item in the input, compare it to the previous, 
	if larger than previous, start a new length check
	if equal, increase length by 1, 
	if less than previous, mark that length as complete. 
		if it's larger than your largest sequence length so far (started with 0) then this is now your largest sequence, 
		if not, ignore that sequence length and move on to the next character.
*/
    public static void main(String[] args) {
    	int[] a = {1,2,3,4,4,4,3,2,5,5,5,5,4,6,7};	// should be 4 8
    	//int[] a = {1,2,3,4,4,4,4,5,2,5,5,5,5,4,6,7};	// should be 4 9
    	//int[] a = {1,2,2,2,2,2,2,1,3,4,4,4,3,2,5,5,5,5,4,6,7};	// should be 6 1
    	//int[] a = {1,2,2,2,2,2,2,3,3,4,4,4,3,2,5,5,4,6,7};	// should be 3 9
    	//int[] a = {1,2,2,2,2,5,5,5,3};	// should be 3 5
    	//int[] a = {5, 5, 5, 5, 3, 8, 8, 8, 1};	// should be 4 0
    	//int[] a = {5, 5, 5, 5, 3, 8, 8, 8, 8, 8};		// should be 5 5

    	int len = 1;
    	int maxLen = 1;
    	int start = 1;
    	int i = 0;
    	for (i = 1; i < a.length; i++) {
    		if (a[i] == a[i-1]) {
    			len++;
    		} 
    		else if (a[i-1] < a[i]) {
    			len = 1;
    		}
			else {
				if (len > maxLen) {
					maxLen = len;
					start = i - maxLen;
					len = 1;
				} 
				else
    				len = 1;
    		}

    	}
		if (len > maxLen) {
			maxLen = len;
			start = i - maxLen;
		}
    	System.out.println(maxLen + " " + start);
    }
}