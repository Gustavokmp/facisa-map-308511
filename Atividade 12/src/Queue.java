import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
	
	private static final int SIZE = 8;
	private List<T> m_array = new ArrayList<T>(SIZE);
	private int m_add;
	private int m_remove;
	
	public Queue() {
		 this.m_add = this.m_remove = 0;
	}
	
	public void enque(T c)
    {
        this.m_array.add(m_add, c);
        this.m_add = (m_add + 1) % SIZE;
    }
	
	public T deque()
    {
        int temp = m_remove;
        m_remove = (m_remove + 1) % SIZE;
        return m_array.get(temp);
    }
   
	
   
}
