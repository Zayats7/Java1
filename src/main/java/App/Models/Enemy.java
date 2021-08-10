package App.Models;

public class Enemy
{
        private int powerPoint;
        private int healthPoint;
        private int enemyValueMin = 10;
        private int enemyValueMax = 30;

        public Enemy()
        {
            this.powerPoint = Tools.randomRange(enemyValueMin, enemyValueMax);
            this.healthPoint = Tools.randomRange(enemyValueMin, enemyValueMax);
        }

        public int getPowerPoint()
        {
            return powerPoint;
        }

        public int getHealthPoint()
        {
            return healthPoint;
        }

        public void decreaseHealth(int value)
        {
            this.healthPoint -= value;
        }
}
