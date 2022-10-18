import processing.core.*;
import static processing.core.PApplet.dist;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 333687820
 */
public class Enemies {
    protected final PApplet d;
    float enemX;
    float enemY;
    float enemaccX;
    float enemaccY;
    float enemacc;
    int health;
    int enemrad;
    int type;
    float endX1;
    float endY1;
    int Cooldownfire;
    int Maxcdf;
    public static double statscale=0;
    
    
    public Enemies(PApplet pa){
    d = pa;
		
    enemX = 0;
    enemY = 0;
    
    }
    public Enemies(PApplet pa,float xb,float yb,float acc,int h,int r,int t,int cool){
        d=pa;
        enemX=xb;
        enemY=yb;
        enemacc=acc;
        health=h;
        enemrad=r;
        type=t;
        Maxcdf=cool;
        Cooldownfire=Maxcdf;
        System.out.println("on");
        
    }
    public void Reset(){
        Cooldownfire=Maxcdf;
    }
    public int GetHealth(){
        return health;
    }
    public int getFire(){
        return this.Cooldownfire;
    }
    public void Reload(){
        Cooldownfire=Maxcdf;
    }
    public String Action(){
        if (this.type==2||this.type==3||this.type==4||this.type==5){
            return "fire";
        }
        else {
            return "nul";
        }
    }
    public boolean HitBox(float x2,float y2,int typeb){
        if ((dist(enemX, enemY, x2, y2)<39)&&((typeb==2)||(typeb==1)||(typeb==4))){
            if (typeb==1){
             float theta_radianskb = (float) Math.atan2(enemX-x2, enemY-y2);
         float endXkb   = (float) (enemX - 0.1 * Math.sin(theta_radianskb));
        float endYkb   = (float) (enemY - 0.1 * Math.cos(theta_radianskb));
        
        enemY=enemY+(endYkb-enemY)*-Weapons.power;
        enemX=enemX+(endXkb-enemX)*-Weapons.power;
            }
            else if (typeb==2){
                float theta_radianskb = (float) Math.atan2(enemX-x2, enemY-y2);
         float endXkb   = (float) (enemX - 0.1 * Math.sin(theta_radianskb));
        float endYkb   = (float) (enemY - 0.1 * Math.cos(theta_radianskb));
        
        enemY=enemY+(endYkb-enemY)*-80;
        enemX=enemX+(endXkb-enemX)*-80;
            }
            else if (typeb==4){
                float theta_radianskb = (float) Math.atan2(enemX-x2, enemY-y2);
         float endXkb   = (float) (enemX - 0.1 * Math.sin(theta_radianskb));
        float endYkb   = (float) (enemY - 0.1 * Math.cos(theta_radianskb));
        
        enemY=enemY+(endYkb-enemY)*-200;
        enemX=enemX+(endXkb-enemX)*-200;
            }
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean Hit(int typeb){
        if (typeb==1){
        health=health-Weapons.damage;
        }
        if (typeb==2){
        health=health-5;
        }
        if (typeb==4){
        health=health-50;
        }
        if ((health+statscale)<0){
            
            return true;
        }
        else{
            return false;
        }
    }
    public float getX() {
		return enemX;

	}
    public float getEndX() {
		return endX1;

	}
    public float getEndY() {
		return endY1;

	}

	public float getY() {
		return enemY;

	}
        public int getType() {
		return type;

	}
        public void Display(){
        if (this.type==2){
            double theta_radians = Math.atan2(getX()-Math.round(Player.x), getY()-Math.round(Player.y));
            endX1   = (float) (getX() - 40 * Math.sin(theta_radians));
            endY1   = (float) (getY() - 40 * Math.cos(theta_radians));
            d.line(Math.round(getX()),Math.round(getY()),Math.round(endX1),Math.round(endY1));
        }
        else if (this.type==3){
            double theta_radians = Math.atan2(getX()-Math.round(Player.x), getY()-Math.round(Player.y));
            endX1   = (float) (getX() - 55 * Math.sin(theta_radians));
            endY1   = (float) (getY() - 55 * Math.cos(theta_radians));
            d.line(Math.round(getX()),Math.round(getY()),Math.round(endX1),Math.round(endY1));
        }
        else if (this.type==4){
            double theta_radians = Math.atan2(getX()-Math.round(Player.x), getY()-Math.round(Player.y));
            endX1   = (float) (getX() - 70 * Math.sin(theta_radians));
            endY1   = (float) (getY() - 70 * Math.cos(theta_radians));
            d.line(Math.round(getX()),Math.round(getY()),Math.round(endX1),Math.round(endY1));
        }
        if (this.type==5){
            d.strokeWeight(40);
            double theta_radians = Math.atan2(getX()-Math.round(Player.x), getY()-Math.round(Player.y));
            endX1   = (float) (getX() - 100 * Math.sin(theta_radians));
            endY1   = (float) (getY() - 100 * Math.cos(theta_radians));
            d.line(Math.round(getX()),Math.round(getY()),Math.round(endX1),Math.round(endY1));
            d.strokeWeight(4);
        }
        d.fill(129, 130, 132);
        d.ellipse(getX(),getY(),enemrad,enemrad);    
        this.Cooldownfire=this.Cooldownfire-1;
        d.fill(255);
        
        
    }
        public void Pathfind(){
        float theta_radiansb = (float) Math.atan2(Player.x-enemX,Player.y-enemY);
        this.enemaccX   = (float) (0 - 2 * Math.sin(theta_radiansb));
       
        this.enemaccY   = (float) (0 - 2 * Math.cos(theta_radiansb));
        }
        public void Move(){
        
       
        
        enemX=enemX+(enemaccX-0)*-enemacc;
        enemY=enemY+(enemaccY-0)*-enemacc;
//        System.out.println(enemX);
//            System.out.println(enemY);
    }
}
