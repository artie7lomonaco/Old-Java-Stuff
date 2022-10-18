import processing.core.*;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chun
 */
public class Blood {
    protected final PApplet d;
    int bodyx;
     int bodyy;
     float rota;
    PImage j;
    
    
    public Blood(PApplet pa) {
		this.d = pa;
		
		
    }
    public Blood(PApplet pa,int x,int y,float rot) {
		this.d = pa;
                bodyx=x;
                bodyy=y;
                rota=rot;
               
		
		
    }
    public int getX(){
        return bodyx;
    }
    public int getY(){
        return bodyy;
    }
    public float getRota(){
        return rota;
    }
//    public void Display(){
//        
//        d.translate(bodyx, bodyy);
//        d.rotate(rota);
//        d.image(j, 0, 0);
//        d.rotate(-rota);
//        d.translate(-bodyx,-bodyy);
//    }
}
