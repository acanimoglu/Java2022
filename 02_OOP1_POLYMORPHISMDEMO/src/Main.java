
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
		for(BaseLogger logger:loggers) {
			logger.Log("Log mesajı");
		}
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		
	}

}
