import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class burro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burro extends Actor
{
    /**
     * Act - do whatever the burro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      movimento ();  
    }
    public void movimento () {
        int speed=3;
        if  (Greenfoot.isKeyDown ("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if  (Greenfoot.isKeyDown ("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if  (Greenfoot.isKeyDown ("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if  (Greenfoot.isKeyDown ("right")){
            this.setLocation(this.getX() + speed,  this.getY());
        }
        else if (Greenfoot.isKeyDown("shift")){
            getWorld().addObject(new BOLHA(), getX()  -50, getY() + 30) ;
        }
        }
}



