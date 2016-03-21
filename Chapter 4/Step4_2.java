/**
 * Created by Æóê on 21.03.2016.
 */
public class Step4_2 {
	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY){
		int i = 0;
		boolean b = false;
		RobotConnection asd = null;
		for (i = 0; i != 3; ++i){
			try {
				asd = robotConnectionManager.getConnection();
				asd.moveRobotTo(toX, toY);
				b = true;
				break;
			}
			catch(RobotConnectionException a){}
			catch(Throwable e){throw e;}
			finally {
				try{if(asd != null) asd.close();}
				catch (RobotConnectionException a){}
				catch (Throwable e){throw e;}
			}
		}
		if ((i == 2)|(b != true)) throw new RobotConnectionException(" ");
	}
}
