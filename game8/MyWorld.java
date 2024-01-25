import greenfoot.*;
import greenfoot.core.TextLabel;
import greenfoot.WorldVisitor;
import greenfoot.util.GraphicsUtilities;
import java.util.ArrayList;
import greenfoot.*;
import greenfoot.core.TextLabel;
import greenfoot.WorldVisitor;
import greenfoot.util.GraphicsUtilities;
import java.util.ArrayList;
import java.awt.Graphics2D;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    int X_min = 0;
    int X_max = 600;
    int X_a;
    int X_b;
    int X_c;
    private int time;
    
    //GreenfootSound bgm = null;
    
    class TextLabelEx extends TextLabel
    {
        boolean enable;
        int xpos;
        int ypos;
        int size;
        boolean bold;
        greenfoot.Color gfcolor;
        java.awt.Color color;
        String text;
        String[] lines;
        private GraphicsUtilities.MultiLineStringDimensions dimensions = null;
        
        @Override
        public int getX(){ return xpos;}
        
        @Override
        public int getY(){ return ypos;}
        
        @Override
        public String getText(){ return text;}     
        
        public TextLabelEx(String _text, int _xpos, int _ypos, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            super("", 0, 0 );
            lines = new String[1];
            xpos = _xpos;
            ypos = _ypos;
            reset( _text, _size, _bold, _gfcolor );
        }
        
        public void reset( String _text, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            if( text == _text && size == _size && bold == _bold && gfcolor == _gfcolor ) return;
            text = _text;
            size = _size;
            bold = _bold;
            gfcolor = _gfcolor;
            lines[0] = text;
            dimensions = null;
            
            if( text.length() == 0 ) enable = false;
            else enable = true;
        }

        @Override
        public void draw(Graphics2D g, int cellsize)
        {
            if( !enable ) return;
            if(dimensions == null) {
                dimensions = GraphicsUtilities.getMultiLineStringDimensions(lines, bold ? java.awt.Font.BOLD : java.awt.Font.PLAIN, size);
                color = new java.awt.Color( gfcolor.getRed(), gfcolor.getGreen(), gfcolor.getBlue(), gfcolor.getAlpha() );
            }
                
            int ydraw = ypos * cellsize - dimensions.getHeight() / 2 + cellsize / 2;
            int xdraw = xpos * cellsize - dimensions.getWidth() / 2 + cellsize / 2;
            g.translate(xdraw, ydraw);
            GraphicsUtilities.drawOutlinedText(g, dimensions, color, java.awt.Color.BLACK);
            g.translate(-xdraw, -ydraw);
        }
    }   
    
    public void showTextEx(String text, int x, int y, int size, boolean bold, greenfoot.Color color )
    {
        for( TextLabel label : WorldVisitor.getTextLabels(this) ){
            if( label.getX() == x && label.getY() == y ){
                if( label instanceof TextLabelEx ){
                    ((TextLabelEx)label).reset(text, size, bold, color);
                    return;                    
                }
            }
        }
        WorldVisitor.getTextLabels(this).add(new TextLabelEx( text, x, y, size, bold, color ) );
        
        //showText( "labels: "+WorldVisitor.getTextLabels(this).size(), 80, 20 );
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        X_a = X_min + (int)(Math.random()*((X_max-X_min)+1));
        addObject( new A(), X_a, 0 );
        X_b = X_min + (int)(Math.random()*((X_max-X_min)+1));
        addObject( new B(), X_b, 0 );
        X_c = X_min + (int)(Math.random()*((X_max-X_min)+1));
        addObject( new c(), X_c, 0 );
        
        addObject( new D(), 300, 300 );
        
        time = 2600;
        
        //bgm = new GreenfootSound( "received_813746806262011_1.mp3" );
        //bgm = new GreenfootSound( "received_813746806262011_1.mp3" );
    }
    public void act(){
        time--;
        showTime();
        if(time < 100){
            showText( "GAME Clear", 300, 200 );
            Greenfoot.stop();
        }
    }
    private void showTime()
    {
        showTextEx("Time: " + time/100, 550, 50, 30, false, Color.RED);
    }
    public void started()
    {
        //bgm.playLoop();
    }
    public void stopped()
    {
        //bgm.stop();
    }
}
