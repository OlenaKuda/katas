package katas.mars_rover.data;

import katas.mars_rover.data.Direction.Direction;

public class Rover {

    private Coordinate coordinate;
    private Direction direction;

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
