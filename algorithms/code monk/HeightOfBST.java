
import java.io.*;
import java.lang.*;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        String x[]=br.readLine().split(" ");
        int inputNum[]=Arrays.stream(x).mapToInt(Integer::parseInt).toArray();
        Node root=new Node(inputNum[0]);   
        for (int i=1;i<inputNum.length;i++){
            Node currentNode=root;
            Node newNode= new Node(inputNum[i]); 
            while(true){
                if(newNode.getElement()<=currentNode.getElement() && currentNode.isLeftChildNull()){
                    currentNode.addLeftChild(newNode);
                    break;
                }
                else if(newNode.getElement()>currentNode.getElement() && currentNode.isRightChildNull()){
                    currentNode.addRightChild(newNode);
                    break;
                }
                else if(newNode.getElement()<=currentNode.getElement()){
                    currentNode=currentNode.getLeftChild();
                }
                else if(newNode.getElement()>currentNode.getElement()){
                    currentNode=currentNode.getRightChild();
                }
            }
        }
        
        System.out.println(getHeight(root));
        
    }
    static int getHeight(Node currentNode){
        if (currentNode==null)
            return 0;
            //System.out.println(currentNode.getElement()+ " "+getHeight(currentNode.leftChild)+" "+getHeight(currentNode.rightChild));
        return 1+Math.max(getHeight(currentNode.leftChild),getHeight(currentNode.rightChild));
    }
} 

class Node{
    
    Node leftChild=null;
    int element;
    Node rightChild=null;
    
    Node (int element){
        this.element=element;
    }
    public void addLeftChild(Node leftNode){
        this.leftChild=leftNode;
    }
    public void addRightChild(Node rightNode){
        this.rightChild=rightNode;
    }
    public Node getLeftChild(){
        return this.leftChild;
    }
    public Node getRightChild(){
        return this.rightChild;
    }
    public int getElement(){
        return this.element;
    }
    public boolean isLeftChildNull(){
        return this.leftChild==null;
    }
    public boolean isRightChildNull(){
        return this.rightChild==null;
    }
    
}

