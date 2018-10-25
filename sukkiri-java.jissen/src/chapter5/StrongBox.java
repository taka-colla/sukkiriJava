package chapter5;

public class StrongBox<E> {
	private E data;
	private KeyType keyType;
	private int getCount = 0 ;

	StrongBox(KeyType keyType){
		this.keyType = keyType;
	}

	public void put(E d) {
		this.data = d;
	}
	public E get() {
		this.getCount++;
		switch(this.keyType) {
		case PADLOCK:
			if(getCount>=1024) {
				this.getCount=0;
				return this.data;
			}
			break;
		case BUTTON:
			if(getCount>=10000) {
				this.getCount=0;
				return this.data;
			}
			break;
		case DIAL:
			if(getCount>=30000) {
				this.getCount=0;
				return this.data;
			}
			break;
		case FINGER:
			if(getCount>=1000000) {
				this.getCount=0;
				return this.data;
			}
			break;
		}
		return null;
	}

}
