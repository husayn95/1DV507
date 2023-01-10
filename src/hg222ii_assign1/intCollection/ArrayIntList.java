package hg222ii_assign1.intCollection;
import java.lang.IndexOutOfBoundsException;

public class ArrayIntList extends AbstractIntCollection implements IntList{
//int index;
@Override
public void add(int n) {
	if (values.length == size) {
		super.resize();
	}
	values[size++] = n;
	
}

@Override
public void addAt(int n, int index) throws IndexOutOfBoundsException {

	int tmp = size+1;
	
	if (size+1<values.length) { //Checks if the array is long enough.
		if (size<index) { //If there is no element in the position index, then index is equal to n and size is incremented
			values[index] = n; 
			size++;
		}
		else { // Moves the last number to the last place ++ and does the same for the number to the left until we reach index-1.
			for (int i=size; i>index-1; i--) {
				values[tmp--] = values[i];
			}
			values[index] = n;  // Puts n in the place of index.
			size++;
		}
	}
	else { // If the array is not long enough, this else method is driven.
		resize(); // doubles the size of the array.

		if (size<index) { // Same code as before in the if method above.
			values[index] = n;
			size++;
		}
		else {
			for (int i=size; i>index-1; i--) {
				values[tmp--] = values[i];
			}
			values[index] = n;
			size++;
		}
	}

}

@Override
public void remove(int index) throws IndexOutOfBoundsException {
	for (int i=index; i<size; i++) { //Takes the value of index and changes it with the value to the right.
		values[i] = values[i+1];
	}
	size--; // Reduces the list when a value is deleted
}

@Override
public int get(int index)  throws IndexOutOfBoundsException {
	if (index >= values.length) {
		throw new IndexOutOfBoundsException("Can not get index. Out of range!");
	}
	
	return values[index];
}

@Override
public int indexOf(int n) {
    int len = values.length;
    int i = 0;
    while (i < len) {  // While n is equal to any of the elements in the array, then return that elements position
        if (values[i] == n) return i;
        else i=i+1; 
    }
    return -1;

}



}
