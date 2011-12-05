import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.gson.Gson;


public class Pipe {
	EventBus eventbus;
	private static Gson gson = new Gson();
	
	public Pipe(){
		eventbus=EventBusManager.getEventBus();
		eventbus.register(this);
	}
	
	
	@Subscribe
	void onPipeMsgEvent(PipeMsgEvent evt) {
		evt.pipeMsg.response.run();
		String json = gson.toJson(evt.pipeMsg.body);
		System.out.println(json);
    }

}
