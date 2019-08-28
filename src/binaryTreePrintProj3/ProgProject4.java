package binaryTreePrintProj3;

public class ProgProject4 {

	public static void main(String[] args) {
		String[] inputs = {
				"CBDAE",
				"DACBEFMLGHJK",
				"JABCDEFISN",
				"ANIKHUSEN",
				"ONMINVRUS"
				
				
		};
		for (int k=0; k<inputs.length;k++) {
		MyAVLTreeMap<String,Integer> mytree = new MyAVLTreeMap<String,Integer>();
		// this code populates your tree
		for (int i =0 ; i< inputs[k].length(); i++) {
			mytree.put(inputs[k].substring(i,i+1), 1);
		}
		 System.out.println("Input of " + inputs[k]);
		 // this line of code call the printTree method you are to write
		 mytree.printTree();
		 System.out.println();
		  
		  
		}

	}

}
