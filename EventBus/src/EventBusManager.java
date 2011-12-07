
import com.google.common.eventbus.EventBus;


public class EventBusManager {
	private static final  EventBus eventbus=new EventBus();
	
	public static EventBus getEventBus(){
		return eventbus;
	}


}
