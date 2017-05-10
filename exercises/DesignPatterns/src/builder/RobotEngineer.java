package builder;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makerobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotLegs();
    }

}
