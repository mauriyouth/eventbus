import com.google.common.eventbus.EventBus;


public class EventBusManager {
	private final static EventBus eventbus=new EventBus();
	
	public static EventBus getEventBus(){
		return eventbus;
	}


}
