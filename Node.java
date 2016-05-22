package bd;

public class Node  {
	 
    private int valor;
    private Node left;
    private Node right;

    public Node(int valor) {
        this.valor = valor;
    }
    
    public boolean isLeaf() {
        return left == null && right == null;
    }
    // funçoes set
    public void setValor(Integer valor) {
    	this.valor = valor;
    	}
    public void setLeft( Node left){
    	this.left = left;
    }
    
    public void setright( Node right){
    	this.right = right;
    }
    
    // funçoes get
    public int getValor() {
        return valor;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
    
   	

   	    
}
