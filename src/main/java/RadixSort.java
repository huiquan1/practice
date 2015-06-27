import java.lang.Math;
public class RadixSort{
	public int[] sort(int[] arr,int digitCnt){
		for(int n =1;n <= digitCnt;n++){
			arr = sortOneDigit(arr,n);	
		}
		return arr;
	}
	public int[] sortOneDigit(int[] arr,int digitPos){
		Node[] nodeArr = new Node[10];
		for(int n =0;n < arr.length;n++){
			int digit = getDigit(arr[n],digitPos);
			if(nodeArr[digit] == null){
				nodeArr[digit] = new Node(arr[n]);
			}else{
				nodeArr[digit].addNodeAtEnd(new Node(arr[n]));
			}
		}
		//outNodes(nodeArr);
		return nodesToArr(nodeArr,arr.length); 
	}

	private int getDigit(int number,int cnt){
		int tmpSplitDigit = number/(int)Math.pow(10,cnt-1) - (number/(int)Math.pow(10,cnt))*10;
		//System.out.println("tmpSplitDigit:" + tmpSplitDigit);
		return tmpSplitDigit;
	}
	private void outNodes(Node[] nodes){
		for(int n =0;n<nodes.length;n++){
			Node node = nodes[n];
			if(node == null) {
				System.out.println("node == null");
				continue;
			}
			System.out.println(node.getValue());
			for(Node next = node.next;next !=null;next = next.next){
				System.out.println(next.getValue());
			}
		}
	}

	private int[] nodesToArr(Node[] nodes,int cnt){
		int[] arr = new int[cnt];
		int m =0;
		for(int n =0;n<nodes.length;n++){
			Node node = nodes[n];
			if(node == null) continue;
			arr[m] = node.getValue();
			m++;
			for(Node next = node.next;next !=null;next = next.next){
				arr[m] = next.getValue();
				m++;
			}
		}
		return arr;
	}

	private class Node{
		private int value;
		private Node next;
		public Node(int value){
			this.value = value;
		}
		public int getValue(){
			return value;
		}

		public Node getNext(){
			return next;
		}
		public void setNext(Node next){
			this.next = next;
		}
		public void addNodeAtEnd(Node node){
			Node lastNode =this;
			//for(lastNode = next;lastNode != null;lastNode =lastNode.next ){
			while(lastNode != null){
				if(lastNode.next != null){
					lastNode = lastNode.next;
					continue;
				}
				lastNode.setNext(node);
				break;
			}
		}
	}
}
