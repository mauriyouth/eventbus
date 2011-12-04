
public class PipeMsg {
	Runnable response;
	Runnable error;
	final String subject;
	final String target;
	final Object body; // to be serialized in JSON
	
	public PipeMsg(Runnable response, Runnable error, String subject,
			String target, Object body) {
		super();
		this.response = response;
		this.error = error;
		this.subject = subject;
		this.target = target;
		this.body = body;
		fire();
	}

	
	
	public void fire(){
		
		new PipeMsgEvent(this).fire();
		
		
	}
	
}