package builder;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public class TestRobotBuilder {

    public static void main(String[] args){

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makerobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot built");

        System.out.println("Robot head type: " + firstRobot.getRobotHead());
        System.out.println("Robot torso type: " + firstRobot.getRobotTorso());
        System.out.println("Robot arms type: " + firstRobot.getRobotArms());
        System.out.println("Robot legs type: " + firstRobot.getRobotLegs());

    }

}
