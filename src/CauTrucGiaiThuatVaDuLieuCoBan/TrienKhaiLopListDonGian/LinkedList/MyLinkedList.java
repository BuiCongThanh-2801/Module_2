package CauTrucGiaiThuatVaDuLieuCoBan.TrienKhaiLopListDonGian.LinkedList;

import javax.xml.soap.Node;

public class MyLinkedList {
   private Node head;
   private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node (data);
    }
    public class Node {
        private Node next;
        private Object data;

        private Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
        /// phương thức add
        // Mục đích : thêm đối tượng vào vị trí index trong danh sách
        // Tham số đầu vào : vị trí thêm (index), đối tượng thêm(data)


    }
    public void add(int index, Object data){
        Node temp=head;
        Node holder;

        for (int i=0; i<index && temp.next !=null;i++){
            temp=temp.next;
        }
        holder= temp.next;
        temp.next= new Node(data);
        temp.next.next= holder;
        numNodes++;
    }


    //Thêm đối tượng vào vị trí đầu tiên trong danh sách
    //Tham số đầu vào: đối tượng thêm (data)
    //
    public void addFirst(Object data){
        Node temp= head;
        head= new Node(data);
        head.next=temp;
        numNodes++;
    }


    // Lấy phân tử ở vị trí index từ danh sách
    // Tham số đầu vào: index là vị trí cần lấy

    public Node get(int index){
        Node temp=head;
        for (int i=0; i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    //Hiển thị danh sách các phân tử trong danh sách

    public void printList(){
        Node temp= head;
        while (temp!= null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

}



