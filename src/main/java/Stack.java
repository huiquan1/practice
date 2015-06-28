import java.lang.Integer;
public class Stack{

Node top;

public Integer pop(){
	if(top != null ){
		Integer item = top.data;
		top = top.next;
		return item;
	}
	return null;
}

public void push(Integer item){
	Node t= new Node(item,top);
	top =t;
}

public Integer peek(){
	if(top != null ){
		Integer item = top.data;
		return item;
	}
	return null;
}

public boolean isEmpty(){
	return top == null;
}
public void sort(){
	Stack sortedS = new Stack();
	//temp = oldstack.pop ,when oldstack is empty then stop 
	//temp compare with sortedS's items
	//if temp < sortedS' items then pop them to oldS:when sortedS is empty or temp >soteds' item then push temp to sortedS
	while(!this.isEmpty()){
		Integer temp = this.pop();
		while(!sortedS.isEmpty() && temp<sortedS.peek() ){
			this.push(sortedS.pop());
		}
		sortedS.push(temp);
	}
	this.top  = sortedS.top;
}

public static void main(String[] args){
	Stack s = new Stack();
	s.push(112);
	s.push(32);
	s.push(43);
	s.sort();
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
}
}
