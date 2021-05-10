package Core;

import GoogleLogger.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements GoogleLoggerService{


	@Override
	public void Log(String email, String password) {
		GoogleLoggerManager manager = new GoogleLoggerManager();
		manager.log();
	}

}
