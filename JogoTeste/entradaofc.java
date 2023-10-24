import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class entradaofc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class entradaofc extends World
{
     private int atraso = 0;
    /**
     * Constructor for objects of class entradaofc.
     * 
     */
    public entradaofc()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

public void act()
 {
    if(Greenfoot.isKeyDown ("shift")){
        setBackground(new GreenfootImage("img1.png"));
        atraso ++;
    }
  else{
     if(!Greenfoot.isKeyDown ("space")){
      atraso = 0;  
    }
}
if(Greenfoot.isKeyDown ("enter")){
        setBackground(new GreenfootImage("img2.png"));
    }
    
if(Greenfoot.isKeyDown ("0")){
    mundo world = new mundo(); 
    Greenfoot.setWorld(world);
}
}

/**
 *
 *
 */
  private void prepare()
{
}
}


    

