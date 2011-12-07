



public class PipeMsg {
	ResponseRunnable response;
	ErrorRunnable error;
	final String subject;
	final String target;
	final Person body; // to be serialized in JSON
	
	public PipeMsg(ResponseRunnable response, ErrorRunnable error, String subject,
			String target, Person body) {
		super();
		this.response = response;
		this.error = error;
		this.subject = subject;
		this.target = target;
		this.body = body;

	
	}

	
	
	public void fire(){
		new PipeMsgEvent(this).fire();
		
		
	}
	
}
