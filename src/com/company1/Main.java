package com.company1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();
        System.out.println();

        Robot[] Robot = new Robot[]{robot, coffeeRobot, robotDancer, robotCoocker};
        for(int i = 0; i < Robot.length;i++){
           Robot[i].work();
        }
    }
}
