package App.Models;

public class Player
{
    private int health;
    private int powerPoint;
    private int playerValueMin = 10;
    private int playerValueMax = 50;
    private int x;
    private int y;
    private int step;

    public Player()
    {
        this.health = 100;
        this.step = 0;
        this.powerPoint = 50;
        this.powerPoint = Tools.randomRange(playerValueMin, playerValueMax);
    }

    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void moveUp()
    {
        this.y -= 1;
        ++step;
    }

    public void moveDown()
    {
        this.y += 1;
        ++step;
    }

    public void moveLeft()
    {
        this.x -= 1;
        ++step;
    }

    public void moveRight()
    {
        this.x += 1;
        ++step;
    }

    public void moveRightUp()
    {
        this.x += 1;
        this.y -= 1;
        ++step;
    }

    public void moveLeftDown()
    {
        this.x -= 1;
        this.y += 1;
        ++step;
    }

    public void moveLeftUp()
    {
        this.x -= 1;
        this.y -= 1;
        ++step;
    }

    public void moveRightDown()
    {
        this.x += 1;
        this.y += 1;
        ++step;
    }

    public void decreaseHealth(int value)
    {
        this.health -= value;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getHealth()
    {
        return health;
    }

    public int getStep()
    {
        return step;
    }

    public int getPowerPoint()
    {
        return powerPoint;
    }

    public boolean isPlayerAlive()
    {
        return health > 0;
    }
}
