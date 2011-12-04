import com.google.common.eventbus.EventBus;


public class PipeMsgEvent {
	
	EventBus eventbus;
	PipeMsg pipeMsg;
	
	public PipeMsgEvent(PipeMsg pipeMsg) {
		// TODO Auto-generated constructor stub
		this.pipeMsg=pipeMsg;
		eventbus=EventBusManager.getEventBus();
	}

	void fire(){
		eventbus.post(this);
	}

}
