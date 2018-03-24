public class Leaves {
        public int[] getLeaves(TreeNode t) {
            // replace with working code
       
        	if(t == null) return new int[0];
         int[] temp = new int[1];
         if(t.left == null && t.right == null) {
        	 temp[0] = t.info;
        	 return temp;
         }
        	if(t.left ==null) return getLeaves(t.right);
        	if(t.right ==null) return getLeaves(t.left);
        	
        	return merge(getLeaves(t.left),getLeaves(t.right)); 
        
        }
        //from stackoverflow https://stackoverflow.com/questions/4697255/combine-two-integer-arrays 
        public int[] merge(int[]array1, int[] array2) {
        	int[] array1and2 = new int[array1.length + array2.length];
        	System.arraycopy(array1, 0, array1and2, 0, array1.length);
        	System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
        return array1and2;
        }
        
    }

