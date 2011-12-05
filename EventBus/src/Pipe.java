import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;


public class Pipe {
	EventBus eventbus;
	
	public Pipe(){
		eventbus=EventBusManager.getEventBus();
		eventbus.register(this);
	}
	
	
	@Subscribe
	void onPipeMsgEvent(PipeMsgEvent evt) {
		evt.pipeMsg.response.run();
       	//evt.pipeMsg.body;      to be serialized in JSON                                                                                                                                                                                                                                                               
    }

}
