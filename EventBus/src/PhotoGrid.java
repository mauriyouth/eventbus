public class PhotoGrid {

	
	
	
	public static void main(String args[]){
		Object body;
		
		PipeMsg pipemsg = new PipeMsg(new ResponseRunnable() {
			
			Object body;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
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
