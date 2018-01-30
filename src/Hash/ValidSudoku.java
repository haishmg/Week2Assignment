package Hash;

import java.util.HashSet;
import java.util.List;

public class ValidSudoku {

	public int isValidSudoku(final List<String> a) {
	    char[][] arr = new char[9][9];
	    int i=0,j=0;
	    for (String s:a){
	        for (j=0;j<s.length();j++){
	            arr[i][j]=s.charAt(j);
	            if (!Character.isDigit(arr[i][j]) && arr[i][j]!='.'){
	                //System.out.println("unexpected input");
	                return 0;
	            }
	        }
	        i++;
	    }
	    HashSet<Character> set = new HashSet<Character>();
	    //check row
	    for (i=0;i<9;i++){
	        set.clear();
	        for (j=0;j<9;j++){
	            if (arr[i][j]!='.' && !set.contains(arr[i][j])) {
	                set.add(arr[i][j]);
	            } else if (arr[i][j]!='.'){
	                //System.out.println("row "+i+" is invalid");
	                return 0;
	            }
	        }
	    }
	    //check column
	    for (j=0;j<9;j++){
	        set.clear();
	        for (i=0;i<9;i++){
	            if (arr[i][j]!='.' && !set.contains(arr[i][j])) {
	                set.add(arr[i][j]);
	            } else if (arr[i][j]!='.'){
	                //System.out.println("colum "+j+" is invalid");
	                return 0;
	            }
	        }
	    }
	    //check 9*9 box
	    for (i=0;i<9;i=i+3)
	        for (j=0;j<9;j=j+3){
	            set.clear();
	            for (int k=0;k<3;k++)
	                for (int l=0;l<3;l++){
	                    if (arr[i+k][j+l]!='.' && !set.contains(arr[i+k][j+l])) {
	                        set.add(arr[i+k][j+l]);
	                    } else if (arr[i+k][j+l]!='.'){
	                        //System.out.println("box "+i+ ", " +j+" is invalid");
	                        return 0;
	                    }	                    
	                }
	    }
	    return 1;
	}

}
