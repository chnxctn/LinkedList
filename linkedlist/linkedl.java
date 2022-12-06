package linkedlist;

public class linkedl {
    public Node head;
    public Node tail;

    public linkedl() {
        head = null;
        tail = null;

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void arayaekle(int number, int index) {
        Node newNode = new Node(number);
        if (!isEmpty()) {
            newNode.next = head;
            head = newNode;
            if (index == 0) {
                newNode.next = head;
                head = newNode;

            } else {
                Node temp = null;
                Node temp2 = head;
                int current = 0;
                while ((temp2 != null) && (current < index)) {
                    temp = temp2;
                    temp2 = temp2.next;
                    current++;

                }
                if (temp2 == null) {
                    tail.next = newNode;
                    tail = newNode;

                } else {
                    newNode.next = temp2;
                    temp.next = newNode;

                }
            }
        } else {
            head = newNode;
            tail = newNode;

        }
    }

    public void basaekle(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;

        }
    }
    public void sonaekle(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }


    }

    @Override
    public String toString(){
        return "Sonraki{"+ "head=" + head + ",tail=" + tail + "}";

    }
    public void sıraliekle(int data){
        Node newNode = new Node(data);
        Node temp;
        if(isEmpty()){
            head = newNode;
            tail = newNode;

        }
        else{
            temp = head;
            while ((temp.next != null) && (temp.next.data < newNode.data)){
                temp = temp.next;

            }
            newNode.next = temp.next;
            if(temp.next == null){
                temp.next = newNode;
                tail= newNode;

            }
            else{
                temp.next = newNode;

            }
        }
    }
    public void listeyazdir(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
    }
}}










