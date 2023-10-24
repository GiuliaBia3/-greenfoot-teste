import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (Giulia) 
 * @version (a version number or a date)
 */
public class mundo extends World
{   
    private GreenfootSound bgMusic = new GreenfootSound ("Star.mp3");
    private int speed = 3 ;
    
    public void started()
    {
        bgMusic.playLoop();
    }
    public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        sherek sherek = new sherek();
        addObject(sherek,540,352);
        burro burro = new burro();
        addObject(burro,72,74);
        sherek.setLocation(545,335);
    }
    
    }

