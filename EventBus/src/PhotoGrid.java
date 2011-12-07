
 
public class PhotoGrid {



	public static void main(String[] args){
		EventBusManager manager = new EventBusManager();
		
		Pipe pipe = new Pipe();
	


		Person body= new Person();
		body.name="iforgotmyname";
		body.age="-1";

		PipeMsg pipemsg = new PipeMsg(new ResponseRunnable() {

			Object body;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("response received");

			}

			@Override
			public void setBody(Object body) {
				this.body=body;
				// TODO Auto-generated method stub

			}
		} , new ErrorRunnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setReason(String reason) {
				// TODO Auto-generated method stub

			}
		} ,"subject","target",body);

		pipemsg.fire();
	}





}
