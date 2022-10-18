import processing.core.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 333687820
 */
public class Bullets {
    protected final PApplet d;
    float x;
    float y;
    float bulletx;
    float bullety;
    float bulletacx;
    float bulletacy;
    float endXb; 
    float endYb;
    int weapon=1;
    int numbul;
    float targX;
    float targY;
    float startX;
    float startY;
    int type;
    int bace;
    
    
    
    public Bullets(PApplet pa) {
		d = pa;
		
		bulletx = 0;
		bullety = 0;
                setLocation(bulletx, bullety);
	}

    public Bullets(PApplet pa,float xb,float yb,float tarx,float tary,int ace,int t){
        d=pa;
        bulletx=xb;
        bullety=yb;
//        startX=x;
//        startY=y;
        targX=tarx;
        targY=tary;
        bace=ace;
        type=t;
        Fire();
        
        
        
        
    }
    public float WeaponType(){
        if (weapon==1){
            numbul=1;
            return (numbul);
        }
        if (weapon==2){
            numbul=4;
            return (numbul);
        }
        else{
            return 0;
        }
    }
    public void Blood(){
        type=3;
    }
    
    public void setLocation(float x, float y){
      x=bulletx;
      y=bullety;
    }
    
    public void Move(){
        
       
        if (type==1){
        bulletx=bulletx+(endXb-x)*bace;
       
        bullety=bullety+(endYb-y)*bace;
        }
        if (type==2){
        bulletx=bulletx+(endXb-x)*bace;
        
        bullety=bullety+(endYb-y)*bace;
        }
         if (type==4){
        bulletx=bulletx+(endXb-x)*bace;
        
        bullety=bullety+(endYb-y)*bace;
        }
        if (type==3){
            bace=bace-20;
            
            if (bace<0){
                bace=0;
            }
        bulletx=bulletx+(endXb-x)*bace;
        
        bullety=bullety+(endYb-y)*bace;
        }
    }
    
    public float getX() {
		return bulletx;

	}

	public float getY() {
		return bullety;

	}
        public int getType() {
		return type;

	}
    public void Display(){
        
        
            d.ellipse(getX(),getY(),10,10);    
        
        
    }
    
    public void Fire(){
        
        float theta_radiansb = (float) Math.atan2(bulletx-targX,bullety-targY);
        double a;
        double c;
       if (type==1){
             a = Math.random() * Weapons.spread / 100;
             c = Math.random() * Weapons.spread / 100;
             a *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
            c *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
            this.endXb   = (float) (x - 0.1 * Math.sin(theta_radiansb)+a);
        this.endYb   = (float) (y - 0.1 * Math.cos(theta_radiansb)+c);
        }
       else if(type==2){
             a = Math.random() * 1 / 100;
             c = Math.random() * 1 / 100;
            a *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
            c *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
            this.endXb   = (float) (x - 0.1 * Math.sin(theta_radiansb)+a);
        this.endYb   = (float) (y - 0.1 * Math.cos(theta_radiansb)+c);
       } 
       else if(type==4){
             a = Math.random() * 3 / 100;
             c = Math.random() * 3 / 100;
            a *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
            c *= Math.floor(Math.random()*2) == 1 ? 1 : -1;
            this.endXb   = (float) (x - 0.1 * Math.sin(theta_radiansb)+a);
        this.endYb   = (float) (y - 0.1 * Math.cos(theta_radiansb)+c);
       } 
        
        
       
       
        
    }
//    public String Delete(String ret){
//        if (this.bulletx>1920||this.bulletx<0||this.bullety>1080||this.bullety<0){
//          return("del"); 
//    }
//        else{
//            return("keep");
//        }
              
//}
}
