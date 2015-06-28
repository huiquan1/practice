public class Queue{
NodeObject first,last;

public void enqueue(Object item){
	if(first == null){
		last = new NodeObject(item,null);
		first = last ;
	}else{
		last.next = new NodeObject(item,null);
		last = last.next;
	}
}
public Object dequeue(){
	if(first != null){
		Object item = first.data;
		first  = first.next;
		return item;
	}
	return null;
}

public static void main(String[] args){
Queue q = new Queue();
q.enqueue("a");
q.enqueue("b");
q.enqueue("c");

System.out.println(q.dequeue());
System.out.println(q.dequeue());
System.out.println(q.dequeue());
}
}
