import java.util.*;


public class JavaApplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*16.1 Given a sorted array of positive integers with an empty spot(zero) at the end, insert an element in sorted order
		int[] array = {1, 2, 7, 8, 9, 0};
		int x = 11;
		insertIntegerSorted(array, x);*/
		
		/*16.2 Reverse the order of elements in an array (whithout creating a new array)
		int[] array = {1, 2, 7, 8, 9, 0};
		reverseOrder(array);*/
		
		/*16.3 Given two lists (A and B) of unique strings, write a program to determine if A is a subset of B.  That is, check if all the elements from a are countained in B.*/
		/*String [] A = {"A", "B", "C"};
		String [] B = {"A", "B", "D", "C"};
		if(ifSubSet(A, B)){
			System.out.println("A is a subset of B.");
		}
		else
		{
			System.out.println("A is NOT a subset of B.");
		}*/
		
		/*16.4 You are given a two-dimenti0nal array of sales data where the first column is a product ID and the second column is quantity.
		 * Write a function to take this list of data and return a new two-dimensional array with the total sales for each product ID.
		 */
		/*int[][] array = {{1, 150}, {2, 500}, {2, 130}, {3, 10}, {2, 20}, {4, 2}, {1, 100}};
		
		int[][] newA = sumArray(array);
		
		System.out.println(Arrays.deepToString(newA));*/
		
		/*16.5 Insert an element into a binary search tree (in order). You may assume that the
		binary search tree contains integers.*/
		/*BinaryTree bt = new BinaryTree(10);
		
		int[] array = {1, 5, 9, 13, 16, 18};
		
		for(int i:array){
			bt.add(i);
		}
		
		bt.printLeafNodes(bt.getRoot());*/
		
		/*16.6 Given a binary search tree which contains integers as values, calculate the sum of all the numbers.*/
		/*int sum = bt.sumAll(bt.getRoot());
		
		System.out.println("Sum: " + Integer.toString(sum));*/
		
		/*16.7 Insert a node into a sorted linked list (in order). (Don’t forget about what happens when the new element is at the start or end!)*/
		/*LNode a = new LNode(1);
		LNode b = new LNode(3);
		LNode c = new LNode(5);
		a.setNext(b);
		b.setNext(c);
		
		LNode head = insertNode(a, 2);
		
		printNodeInOrder(head);*/
		
		/*16.8 “Sort” a linked list that contains just 0s and 1s. That is, modify the list such that all 0s come before all 1s. */
		/*LNode a = new LNode(0);
		LNode b = new LNode(1);
		LNode c = new LNode(1);
		LNode d = new LNode(0);
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		
		LNode sNode = SortLNode(a);
		
		printNodeInOrder(sNode);*/
		
		//16.9 Write a function which takes a stack as input and returns a new stack which has the elements reversed. 
		/*int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 16, 17};
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0; i<a.length; i++){
			st.push(a[i]);
		}
		
		Stack<Integer> revSt = reverseStack(st);*/
		//16.10 Write a function which removes all the even numbers from a stack. You should return the original stack, not a new one. 
		
		/*removeEven(revSt);*/
		
		//16.11 Write a function to check if two queues are identical (same values in the same order). It’s okay to modify/destroy the two queues. 
		/*int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] y = {1, 2, 4, 3};
		Queue<Integer> a = new LinkedList<Integer>();
		Queue<Integer> b = new LinkedList<Integer>();
		
		for(int i:x){
			a.add(i);
		}
		
		for (int i:y){
			b.add(i);
		}*/
		
		/*boolean bSame = compareTwoQue(a, b);
		
		System.out.println("Que A is Identical to Que B?: " + Boolean.toString(bSame));*/
		
		//16.12 Write a function to remove the 3rd element from a queue (but keep all the other elements in place and in the same order).
		
		//removeElement(a, 13);
		
		//16.13 Given two sorted arrays, write a function to merge them in sorted order into a new array. 
		/*int[] x = {1, 3, 5, 7, 9, 9, 9};
		int[] y = {2, 4, 6, 8, 10};
		
		boolean flag = mergerArrayInOrder(x, y);*/
		//16.14 Implement insertion sort
		/*int[] x = {5, 3, 1, 7, 11, 2};
		insertionSort(x);*/
		
		//16.15 Implement binary search. That is, given a sorted array of integers and a value, find the location of that value.
		//Search(x, 0);
		//16.16 You are given an integer array which was sorted, but then rotated. It contains all distinct elements. Find the minimum value. 
		//For example, the array might be 6, 8, 9, 11, 15, 20, 3, 4, 5. The minimum value would obviously be 3. 
		/*int[] x = {11, 14, 0, 1, 2, 3, 4, 5, 6, 9};
		System.out.println("Min Value is " + findMinValue(x, 0, x.length-1));*/
		
		//16.17 Using depth-first search, check if a tree contains a value.
		BinaryTree bt = new BinaryTree(10);
		
		int[] array = {1, 5, 9, 13, 16, 18};
		
		for(int i:array){
			bt.add(i);
		}
		int x = 10;
		System.out.println("The Number " + Integer.toString(x) +  " is in the Tree? " + depthFirstSearch(bt.getRoot(), x));
		
		//16.18 Write the pseudocode for breadth-first search on a binary tree. Try to be as detailed as possible
		
	}
	//=============================================================================================================
	//16.18 Write the pseudocode for breadth-first search on a binary tree. Try to be as detailed as possible
	//===============================================================================================================	
	static boolean breathFirstSearch(Node parent, int x){
		
		return false;
	}
	
	//=============================================================================================================
	//16.17 Using depth-first search, check if a tree contains a value.
	//===============================================================================================================	
	static boolean depthFirstSearch(Node parent, int x){
		if(parent ==null){
			return false;
		}
		
		if(parent.getKey()==x){
			return true;
		}
		else{
			return depthFirstSearch(parent.getLeft(), x) || depthFirstSearch(parent.getRight(), x);
		}
		
	}
	
	//=============================================================================================================
	//16.16 You are given an integer array which was sorted, but then rotated. It contains all distinct elements. Find the minimum value. 
	//For example, the array might be 6, 8, 9, 11, 15, 20, 3, 4, 5. The minimum value would obviously be 3. 
	//===============================================================================================================
	static int findMinValue(int[] x, int left, int right){
		if(x[left] <= x[right]){
			return x[left];
		}
		
		int mid = (left+right)/2;
		
		if(x[left]<=x[mid]){
			return findMinValue(x, mid+1, right);
		}else{
			return findMinValue(x, left, mid);
		}
	}
	
	//=================================================================================================================
	//16.15 Implement binary search. That is, given a sorted array of integers and a value, find the location of that value.
	//============================================================================================================
	static void Search(int[] array, int x){
		int spot = binarySearch(array, x, 0, array.length-1);
		
		if(spot <0){
			System.out.println("Number not found!");
		}else{
			spot = spot +1;
			System.out.println("Number found at spot: " + spot);
		}
	}
	
	static int binarySearch(int[] array, int x, int left, int right){
		if(left > right){
			return -1;
		}

		int middle = (left+right)/2;
		
		if(x==array[middle]){
			return middle;
		}else if(x<array[middle]){
			return binarySearch(array, x, left, middle-1);
		}else{
			return binarySearch(array, x, middle+1, right);
		}
	}
	
	//=================================================================================================================
	//16.14 Implement insertion sort
	//============================================================================================================
	static void insertionSort(int [] a){
		if(a.length>1){
			for(int i = 1; i<a.length; i++){
				int x = a[i];
				int index = i-1;
				while(index>=0 && a[index]>x){
					a[index+1]=a[index];
					index--;
				}
				a[index+1] = x;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	//=================================================================================================================
	//16.13 Given two sorted arrays, write a function to merge them in sorted order into a new array. 
	//============================================================================================================
	static boolean mergerArrayInOrder(int[] a, int[] b){
		if(a.length==0 || b.length ==0)
		{
			return false;
		}
				
		int count = 0;
		int iterA = 0;
		int iterB = 0;
		boolean endA = false;
		boolean endB = false;
		
		int arraySize = a.length+b.length;
		
		int[] iSum = new int[arraySize];
		
		while(count < arraySize)
		{
			if(endA && endB){
				return false;
			}
			else if(!endA && endB){
				iSum[count] = a[iterA];
				iterA++;
			}
			else if(endA && !endB){
				iSum[count] = b[iterB];
				iterB++;
			}
			else{//!endA && !endB
				if(a[iterA]<b[iterB]){
					iSum[count] = a[iterA];
					iterA++;
				}
				else
				{
					iSum[count] = b[iterB];
					iterB++;
				}
			}
			if(iterA>=a.length){
				endA = true;
			}
			
			if(iterB>=b.length){
				endB = true;
			}
			count++;				
		}
		System.out.println(Arrays.toString(iSum));
		return true;
	}
	
	
	//=================================================================================================================
	//16.12 Write a function to remove the 3rd element from a queue (but keep all the other elements in place and in the same order).
	//============================================================================================================
	public static void removeElement(Queue<Integer> a, int index){
		int x = a.size();
		for(int i=0; i<x;i++){
			int temp = a.poll();
			if(i!=index-1){
				a.add(temp);
			}
		}
		System.out.println(a);
	}
	
	//=================================================================================================================
	//16.11 Write a function to check if two queues are identical (same values in the same order). It’s okay to modify/destroy the two queues. 
	//============================================================================================================
	public static boolean compareTwoQue(Queue<Integer> a, Queue<Integer> b){
		if(a.size()!=b.size()){
			return false;
		}
		
		boolean check = false;
		while(!a.isEmpty() && !b.isEmpty()){
			if(a.poll()==b.poll()){
				check = true;
			}else{
				check = false;
			}
		}
		
		return check;
	}
	
	//=================================================================================================================
	//16.10 Write a function which removes all the even numbers from a stack. You should return the original stack, not a new one. 
	//============================================================================================================
	public static void removeEven(Stack<Integer> st){
		Stack<Integer> tempSt = new Stack<Integer>();
		while(!st.isEmpty()){
			if(st.peek()%2==0){
				st.pop();
			}else{
				int temp = st.pop();
				tempSt.push(temp);
			}
		}
		
		while(!tempSt.isEmpty()){
			int temp = tempSt.pop();
			st.push(temp);
		}
		System.out.println(st);
	}
	
	//=================================================================================================================
	//16.9 Write a function which takes a stack as input and returns a new stack which has the elements reversed. 
	//============================================================================================================
	public static Stack<Integer> reverseStack(Stack<Integer> st){
		Stack<Integer>newSt = new Stack<Integer>();
		while(!st.isEmpty()){
			int temp = st.pop();
			newSt.push(temp);
		}
		
		System.out.println(newSt);
		return newSt;
	}
	//===================================================================================================================
	//16.8 “Sort” a linked list that contains just 0s and 1s. That is, modify the list such that all 0s come before all 1s. 
	//====================================================================================================================
	public static LNode SortLNode(LNode a){
		LNode zeroHead = null;
		LNode zeroTail = null;
		
		LNode oneHead = null;
		LNode oneTail = null;
		
		LNode n = a;
		
		while(n!=null){
			LNode Next = n.getNext();
			n.setNext(null);
			
			if(n.getKey()==0){
				if(zeroHead==null){
					zeroHead = n;
				}else{
					zeroTail.setNext(n);
				}
				zeroTail = n;
				
			}else{ // a.getKey()==1
				if(oneHead==null){
					oneHead = n;
				}else{
					oneTail.setNext(n);
				}
				oneTail = n;		
			}
			n = Next;
		}
		
		if(zeroHead==null){
			oneTail.setNext(null);
			return oneHead;
		}else{
			zeroTail.setNext(oneHead);
			return zeroHead;		
		}
	}

	//===================================================================================================================================
	
	//16.7 Insert a node into a sorted linked list (in order). (Don’t forget about what happens when the new element is at the start or end!)
	
	//=========================================================================================================================================
	public static LNode insertNode(LNode a, int x)
	{
		LNode nNode = new LNode(x);
		if(a==null || a.getKey() > x){
			nNode.setNext(a);
			return nNode;
		}
		
		LNode iter = a;
		while(iter.getNext()!=null && iter.getNext().getKey() < x){
			iter=iter.getNext();
		}
		nNode.setNext(iter.getNext());
		iter.setNext(nNode);
		
		return a;
	}
	public static void printNodeInOrder(LNode head){
		
		LNode iter = head;
		while(iter!=null){
			System.out.println(iter.toString());
			iter = iter.getNext();
		}
		
	}
	//======================================================================================
	//16.4 You are given a two-dimentional array of sales data where the first column is a product ID and the second column is quantity.
	//Write a function to take this list of data and return a new two-dimensional array witht the total sales for each product ID.
	//=====================================================================================================================================
	
	static int[][] sumArray(int[][]array){
		
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		for (int i = 0; i<array.length; i++)
		{
			if(!hash.containsKey(array[i][0])){
				hash.put(array[i][0], array[i][1]);
			}
			else
			{
				int temp = hash.get(array[i][0]);
				hash.replace(array[i][0], temp + array[i][1]);
			}
		}
		
		int[][] newA = new int [hash.keySet().size()][2];
		
		int index = 0;
		
		for(int key: hash.keySet()){
			newA[index][0] = key;
			newA[index][1] = hash.get(key);
			index ++;
		}
		return newA;
		
	}
	//============================================================================================================================================
	//*************************************************************************************************************************************
	
	//16.3 Given two lists (A and B) of unique strings, write a program to determine if A is a subset of B.  That is, check if all the elements from a are countained in B.
	//=====================================================================================================================================
	static Boolean ifSubSet(String[] A, String [] B){
		Boolean isSubSet = false;
		
		Hashtable<Integer, String> hashB = new Hashtable<Integer, String>();
		
		for(int i=0; i<B.length; i++){
			hashB.put(i, B[i]);
		}
		
		for(int j=0; j<A.length; j++){
			if(hashB.containsValue(A[j])){
				isSubSet = true;
			}
			else
			{
				isSubSet = false;
				break;
			}
		}
		
		return isSubSet;
	}
	//====================================================================================================================
	//******************************************************************************************************************
	
	//16.1 Given a sorted array of positive integers with an empty spot(zero) at the end, insert an element in sorted order
	//=======================================================================================
	static void insertIntegerSorted(int[] array, int x)
	{
		if(array[array.length-1] != 0 || x < 0){
			System.out.println("Array is empty, please insert an new array.");
			return;
		}
		
		int temp;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > x || array[i] == 0){
				temp = array[i];
				array[i] = x;
				x = temp;
			}
			
		}
		System.out.println(Arrays.toString(array));
	}
	static void insertIntegerSorted2(int[] array, int x)
	{
		if(array[array.length-1] != 0 || x < 0){
			System.out.println("Array is empty, please insert an new array.");
			return;
		}
		
		for(int i=1; i<array.length; i++)
		{
			if(array[array.length-i-1] <= x)
			{
				array[array.length-i] =x;
				break;
			}
			else
			{
				array[array.length-i] = array[array.length-i-1];
				array[array.length-i-1] = x;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	//========================================================================================
	//*****************************************************************************************
	
	//16.2 Reverse the order of elements in an array (whithout creating a new array)
	//=========================================================================================
	static void reverseOrder(int[] array){
		if(array.length==0)
		{
			System.out.println("Array is empty, please insert a new array.");
			return;
		}
		
		int mid = array.length/2;
		int temp;
		
		for(int i=0; i<mid;i++){
			temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
	//==========================================================================================
}

/*16.5 Insert an element into a binary search tree (in order). You may assume that the
binary search tree contains integers.*/
class BinaryTree{
	private Node root;
	
	public BinaryTree(int x){
		root=new Node(x);
	}
	
	Node getRoot()
	{
		return root;
	}
	void add(int x){
		insertNode(root, x);
	}
	
	void insertNode(Node nParent, int x){
		if(nParent == null){
			//error
			System.out.println("Error! Parent Node is null");
		}
		else
		{
			if(x<= nParent.getKey()){
				if(nParent.getLeft()!=null){
					insertNode(nParent.getLeft(), x);
				}else{
					nParent.setLeft(x);
				}
			}else{
				if(nParent.getRight()!=null){
					insertNode(nParent.getRight(), x);
				}else{
					nParent.setRight(x);
				}				
			}
		}
	}
	/*16.6 Given a binary search tree which contains integers as values, calculate the sum of all the numbers.*/
	int sumAll(Node root){
		if(root == null){
			return 0;
		}
		
		int iSum = 0;
		
		iSum += root.getKey();
		iSum += sumAll(root.getLeft());
		iSum += sumAll(root.getRight());
		
		return iSum;
	}
	void printLeafNodes(Node node) {  
		  
		  if(node==null){
			  return;  
		  }
		  
		  /*******************************
		  if(node.getLeftNode() == null && node.getRightNode() == null) {  
			  System.out.printf("[" + node.toString()+"] ");//"%d ",node.toString());  
		  } 
		  */
		  
		  //print all
		  System.out.printf("[" + node.toString()+"]\n");//"%d ",node.toString());
		  
		  printLeafNodes(node.getLeft());  
		  printLeafNodes(node.getRight());  
	}  
	
}

class Node{
	int ikey;
	private Node Left;
	private Node Right;
	
	public Node(int x){
		this.ikey = x;
		this.Left = null;
		this.Right = null;
	}
	
	void setKey(int x){
		this.ikey = x;
	}
	
	int getKey(){
		return ikey;
	}
	
	void setLeft(int L){
		this.Left = new Node(L);
	}
	
	Node getLeft(){
		return Left;
	}
	
	void setRight(int R){
		this.Right = new Node(R);
	}
	
	Node getRight(){
		return Right;
	}
	
	public String toString(){
		return Integer.toString(this.ikey);	
	}	
}


//16.7 Insert a node into a sorted linked list (in order). (Don’t forget about what happens when the new element is at the start or end!)*/
//===========================================================================================
class LNode{
	int ikey;
	private LNode next;
	
	public LNode(int x){
		this.ikey = x;
		this.next = null;
	}
	
	int getKey(){
		return ikey;
	}
	
	void setKey(int x){
		this.ikey = x;
	}

	LNode getNext(){
		return next;
	}
	
	void setNext(LNode a){
		this.next= a;
	}	
	
	public String toString(){
		return Integer.toString(this.ikey);	
	}
}
