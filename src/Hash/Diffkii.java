package Hash;

public class Diffkii {
    public int diffPossible(final int[] A, int B) {
        HashSet<Integer> visited = new HashSet<Integer>();
	    for (int i=0; i<A.length; i++ ) {
	        if (visited.contains(A[i] + B) || visited.contains(A[i] - B)) return 1;
	        visited.add(A[i]);
	    }
	    return 0;
    }
	

}
