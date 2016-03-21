public class Step3_3 {
	public static void moveRobot(Robot robot, int toX, int toY) {
		if (robot.getX() < toX){
			while (robot.getDirection() != Direction.RIGHT)
				robot.turnRight();
			while (robot.getX() != toX)
				robot.stepForward();
		}
		else if (robot.getX() > toX){
			while (robot.getDirection() != Direction.LEFT)
				robot.turnRight();
			while (robot.getX() != toX)
				robot.stepForward();
		}

		//  else if (robot.getX() == toX){
		if (robot.getY() < toY){
			while (robot.getDirection() != Direction.UP)
				robot.turnLeft();
			while (robot.getY() != toY)
				robot.stepForward();
		}
		else if (robot.getY() > toY){
			while (robot.getDirection() != Direction.DOWN)
				robot.turnLeft();
			while (robot.getY() != toY)
				robot.stepForward();
			//     }
		}
	}
}
