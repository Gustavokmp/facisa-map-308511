
public class Command {
	
	 private Giant m_object;
	 
	public Command(Giant m_object) {
		super();
		this.m_object = m_object;
		
	}
	public void execute()
    {
        System.out.println(this.m_object.getM_type().getNome());
    }
	 
	 

}
