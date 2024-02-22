package co.edu.unbosque.util;



public class LinkedList<E> {
	protected Node<E> first;

	public LinkedList() {
		this.first = null;
	}

	public Node<E> getFirst() {
		return first;
	}

	public void setFirst(Node<E> first) {
		this.first = first;
	}

	public boolean isEmpty() {
		return (this.first) == null;
	}

	public void add(E info) {
		Node<E> new_node = new Node<E>(info);
		new_node.setNext(this.first);
		this.first = new_node;
	}

	public void insert(E info, Node<E> previous) {
		if (previous != null) {
			Node<E> newNode = new Node<E>(info);
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);

		}
	}

	public void addLast(E info) {
		Node<E> lastNode = getLastNode();
		if (lastNode != null) {
			insert(info, lastNode);
		} else {
			this.first = new Node<E>(info);
		}
	}

	public Node<E> getLastNode() {
		
		return getLastNodeR(first);
	}

	public Node<E> getLastNodeR(Node<E> current) {
		
		 if (current == null || current.getNext() == null) {
		        return current;
		    }

		 return getLastNodeR(current.getNext());
	}

	public int indexOf(E info) {
	    return indexOfRecursive(first, info, 0);
	}

	public int indexOfRecursive(Node<E> currentNode, E info, int infoPosition) {
	    if (currentNode == null) {
	        return -1;
	    }
	    if (currentNode.getInfo().equals(info)) {
	        return infoPosition; 
	    }
	    return indexOfRecursive(currentNode.getNext(), info, infoPosition + 1); 
	}


	public E extract() {
		E data = null;
		if (this.first != null) {
			data = this.first.getInfo();
			this.first = this.first.getNext();
		}
		return data;
	}

	public E extract(Node<E> previous) {
		E data = null;

		if (previous != null && previous.getNext() != null) {
			data = previous.getNext().getInfo();
			previous.setNext(previous.getNext().getNext());

		}
		return data;

	}

	public int size() {
		int size = 0;

		Node<E> current = this.first;
		while (current != null) {
			size++;
			current = current.getNext();
		}

		return size;
	}

	public String print() {
		return this.toString();
	}


	
	public Node<E> get(E info) {
		Node<E> targetNode = null;
		Node<E> currentNode = this.first;

		while (currentNode != null && !currentNode.getInfo().equals(info)) {
			currentNode = currentNode.getNext();

		}

		if (currentNode != null) {
			targetNode = currentNode;
		}

		return targetNode;
	}
	
	



	
	public Node<E> get(int index) {
		Node<E> targetNode = null;
		Node<E> currentNode = this.first;

		int counter = 0;
		while (currentNode != null && counter < index) {
			currentNode = currentNode.getNext();
			counter++;
		}

		if (currentNode != null) {
			targetNode = currentNode;
		}

		return targetNode;

	}
	Node<E> currentNode = this.first;
	public int numberOfOcurrences(E info, Node<E> currentNode) {
		int count = 0;
		
		if (currentNode != null) {
			if (currentNode.getInfo().equals(info)) {
				count++;
			}
		}
		if(currentNode == null) {
			return count;
		}
		return numberOfOcurrences(info, currentNode.getNext());
	}

	public E extractLast() {
		E info = null;
		Node<E> currentNode = this.first;
		int listSize = size();
		if (!isEmpty()) {
			if (listSize == 1) {
				info = currentNode.getInfo();
				this.first = null;
			} else {
				Node<E> previousLastNode = get(listSize - 2);
				info = extract(previousLastNode);
			}
		}
		return info;
	}
	
	public String print(int position) {
	    StringBuilder sb = new StringBuilder();
	    printR(first, position, sb);
	    return sb.toString();
	}

	public void printR(Node<E> currentNode, int position, StringBuilder sb) {
	    if (currentNode == null || position <= 0) {
	        return; 
	    }
	    if (position == 1) {
	        sb.append(currentNode.getInfo().toString());
	        if (currentNode.getNext() != null) {
	            sb.append("->");
	        }
	    }
	    printR(currentNode.getNext(), position - 1, sb);
	}

	public String toString() {
	    return toStringR(first);
	}

	public String toStringR(Node<E> currentNode) {
		String textList = "";
	    if (currentNode == null) {
	        return textList;
	    }
	    String textList1 = currentNode.getInfo().toString();
	    if (currentNode.getNext() != null) {
	        textList1 += "->" + "\n";
	    }
	    return textList1 + toStringR(currentNode.getNext());
	}
	
	public boolean contains(Object o) {
		return containsR(o, first);
	}
	
	public boolean containsR(Object o, Node<E> currentNode ) {
		if (currentNode == null) {
	        return false;
	    }
		
		if(currentNode.getInfo().equals(o)) {
			return true;
		}
		
		return containsR(o, currentNode.getNext());
	}
	
	public boolean remove(E info) {
	    return removeR(first, null, info);
	}

	private boolean removeR(Node<E> currentNode, Node<E> previousNode, E info) {
	    if (currentNode == null) {
	        return false; 
	    }

	    if (currentNode.getInfo().equals(info)) {
	        if (previousNode == null) {
	            first = currentNode.getNext(); 
	        } else {
	            previousNode.setNext(currentNode.getNext()); 
	        }
	        return true; 
	    }

	    return removeR(currentNode.getNext(), currentNode, info); 
	}
}
