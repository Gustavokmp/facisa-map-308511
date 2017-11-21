
public class Giant {

	private Type m_type;
    private int m_id;
    private static int s_next = 0;
    
    
	public Giant() {
		this.m_id = s_next++;
	}
	public Type getM_type() {
		return m_type;
	}
	public void setM_type(Type m_type) {
		this.m_type = m_type;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public static int getS_next() {
		return s_next;
	}
	public static void setS_next(int s_next) {
		Giant.s_next = s_next;
	}
    
   
}
