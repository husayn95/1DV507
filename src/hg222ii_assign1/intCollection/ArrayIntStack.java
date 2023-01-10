package hg222ii_assign1.intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	@Override
	public void push(int n) {
values[size] = n;
size++;
if (values.length == size) {
	super.resize();
}
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		int data;
		if(size<=0) {
			throw new IndexOutOfBoundsException("Can not get index. Out of range!");

		}
		size--;
		data = values[size-1];
		
		return data;
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		int data = 0;
		try{
			
		
		data = values[size-1];
		
		}
		catch (Exception e){
			System.out.println("Wrong!!! "+e);
		}
		
		return data;
	}

}
