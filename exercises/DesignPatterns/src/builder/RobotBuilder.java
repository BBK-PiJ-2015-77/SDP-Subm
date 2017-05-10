package builder;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}
