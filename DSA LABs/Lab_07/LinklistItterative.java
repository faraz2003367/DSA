class Node{
    int data ;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }

}
public class LinklistItterative{
    Node head;
    public void Add(int data){
     Node newnode=new Node(data);
     if(head==null){
        head=newnode;
     }   
     else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
     }
    }
    public void printItterative(){
        Node temp=head;
        while(temp!=null){
            
            System.out.print(temp.data +"-->");
            temp=temp.next;
        }
        System.out.println();
    }
public void printRecursive(Node node){
    if(node==null){
     return ;
    }
    System.out.print(node.data + "-->");
    printRecursive(node.next);
}
public void printRecursive(){
    System.out.println("Recursive Approach :");
    printRecursive(head);
    
}
    
    public static void main(String args[]){
        LinklistItterative list=new LinklistItterative();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(4);
        list.Add(5);
        System.out.println("Itteractive Approach :");
        list.printItterative();
      
        list.printRecursive();
    }
}