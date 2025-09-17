package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL()
    {
        this.size=0;
    }

    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }

    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index)
    {
        if(index<0 || index>size)
        {
            return;
        }
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size-1)
        {
            insertLast(val);
            return;
        }
        else
        {
            Node node= new Node(val);
            Node temp= head;
            int counter=0;
            while(++counter != index)
            {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }

    public void insertRec(int value, int index)
    {
        head=insertRec(value, index, head);
    }

    private Node insertRec(int val, int index, Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }

    public void deleteFirst()
    {
        if(size==0)
        {
            return;
        }
        Node temp= head;
        head=head.next;
        temp.next=null;
        if(head==null)
        {
            tail=null;
        }
        size--;
    }

    public void deleteLast()
    {
        if(size==0)
        {
            return;
        }
        Node temp= head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }

    public void delete(int index) {
        if (index == 0)
        {
            deleteFirst();
            return;
        }
        if(index==size-1)
        {
            deleteLast();
            return;
        }
        if(index>size)
        {
            return;
        }
        Node temp= head;
        int counter=0;
        while(++counter != index)
        {
            temp=temp.next;
        }
        Node nxt=temp.next.next;
        temp.next.next=null;
        temp.next=nxt;
        size--;
    }

    public void display()
     {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("NULL\n");
    }

    public void length()
    {
        System.out.println(size);
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value, Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

    //Leetcode question 83: Remove Duplicates from Sorted List
    public void deleteDuplicates()
    {
        if(head==null)
        {
            return;
        }
        Node prev=head;
        Node curr=prev.next;
        while(prev.next!=null) {
            if (prev.value == curr.value) {
                prev.next = curr.next;
                curr.next = null;
                curr = prev.next;
                size--;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }

    }

    //Leetcode question:21 : merge two sorted linked lists
    public Node mergeTwoLists(LL head1, LL head2)
    {
        Node list1=head1.head;
        Node list2=head2.head;
        Node temp=list1;
        if(list1==null) return list2;
        if(list2==null) return list1;
        Node start=temp;
        while(list1!=null && list2!=null)
        {
            if(list1.value<=list2.value)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        temp.next=(list1==null)?list2:list1;
        return start.next;
    }
}
