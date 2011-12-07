


import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.gson.Gson;


public class Pipe {
	EventBus eventbus;
	private  Gson gson = new Gson();
	
	public Pipe(){
		eventbus=EventBusManager.getEventBus();
		this.eventbus.register(this);
	}
	
	
	@Subscribe
	public void onPipeMsgEvent(PipeMsgEvent evt) {
		String json = gson.toJson(evt.pipeMsg.body);
		System.out.println(json);
		Object body = new Object();
		evt.pipeMsg.response.setBody(body);
		Thread response =new Thread(evt.pipeMsg.response);
		response.start();
    }

}
