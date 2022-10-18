import processing.core.*;
import java.util.ArrayList;
import java.util.Random;
import static processing.core.PApplet.dist;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chun
 */
public class Player{
    float endY1;
    float endX1;
    public static float x;
    float counterkb;
    boolean keys;
    float cooldown1;
    float slope;
    public static float mouseXD;
    public static float mouseYD;
    public static float y;
    float ace;
    float accxr;
    float accxl;
    float accyt;
    float accyd;
    float go;
    float dash;
    float dashdis;
    float proto=0;
    protected final PApplet d;
    boolean keyPressed;
    public static float phealth;
    PImage mainimg;
    public Player(PApplet pa){
        x=900;
        y=900;
        ace=4;
        d=pa;
        cooldown1=0;
        phealth=200;
        
        
    }
    public static boolean HitBox(float x2,float y2){
        if (dist(x, y, x2, y2)<35){
            return true;
        }
        else{
            return false;
        }
        
    }
     public boolean MeleeHit(){
        phealth=phealth-2;
        if (phealth<0){
            return true;
        }
        else {
            return false;
        }
        
    }
    public boolean Hit(){
        phealth=phealth-10;
        if (phealth<0){
            return true;
        }
        else {
            return false;
        }
        
    }
    public void Fire(){
        if (counterkb>0){
         float theta_radianskb = (float) Math.atan2(x-mouseXD, y-mouseYD);
         float endXkb   = (float) (x - 0.1 * Math.sin(theta_radianskb));
        float endYkb   = (float) (y - 0.1 * Math.cos(theta_radianskb));
        
        y=y+(endYkb-y)*-Weapons.kb;
        x=x+(endXkb-x)*-Weapons.kb;
        counterkb=counterkb-1;
        
        }
    }
    public void Dash(){
        
        float theta_radians = (float) Math.atan2(x-mouseXD, y-mouseYD);
        float endX   = (float) (x - dashdis * Math.sin(theta_radians));
        float endY   = (float) (y - dashdis * Math.cos(theta_radians));
        float interendX   = (float) (x - (dashdis/2) * Math.sin(theta_radians));
        float interendY   = (float) (y - (dashdis/2) * Math.cos(theta_radians));
        
        if (dash==1){
            d.ellipse(interendX,interendY,50,50);
            y=endY;
            x=endX;
        
        dash=0;
        cooldown1=40;
        }
        if (dash==2){
            d.ellipse(interendX,interendY,50,50);
            y=endY;
            x=endX;
        
        dash=0;
        cooldown1=20;
        
        
        }
    }
    
    public void Display(){
        if (Weapons.weapon==1){
            d.stroke(89, 64, 3);
            d.strokeWeight(Weapons.width);
        double theta_radians = Math.atan2(Math.round(x)-mouseXD, Math.round(y)-mouseYD);
        endX1   = (float) (x - Weapons.length * Math.sin(theta_radians));
        endY1   = (float) (y - Weapons.length * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
     
        }
        
        if (Weapons.weapon==2){
        double theta_radians = Math.atan2(Math.round(x)-mouseXD, Math.round(y)-mouseYD);
        d.strokeWeight(4);
        d.stroke(1);
        endX1   = (float) (x - (Weapons.length+15) * Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+15) * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
       
            
            d.strokeWeight(Weapons.width);
        
        endX1   = (float) (x - Weapons.length * Math.sin(theta_radians));
        endY1   = (float) (y - Weapons.length * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
        endX1   = (float) (x - (Weapons.length+15) * Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+15) * Math.cos(theta_radians));
        }
        
        if (Weapons.weapon==3){
           
           d.strokeWeight(2);
        double theta_radians = Math.atan2(Math.round(x)-mouseXD, Math.round(y)-mouseYD);
        endX1   = (float) (x - (Weapons.length+20) * Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+20) * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
        d.strokeWeight(Weapons.width);
      d.stroke(104, 66, 34);
        endX1   = (float) (x - Weapons.length * Math.sin(theta_radians));
        endY1   = (float) (y - Weapons.length * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
        endX1   = (float) (x - (Weapons.length+20) * Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+20) * Math.cos(theta_radians));
        }
        
        if (Weapons.weapon==4){
            d.stroke(1);
            d.strokeWeight(5);
        double theta_radians = Math.atan2(Math.round(x)-mouseXD, Math.round(y)-mouseYD);
        endX1   = (float) (x - (Weapons.length+8) * Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+8) * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
        d.strokeWeight(Weapons.width);
        endX1   = (float) (x - Weapons.length * Math.sin(theta_radians));
        endY1   = (float) (y - Weapons.length * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
        endX1   = (float) (x - (Weapons.length+8) * Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+8) * Math.cos(theta_radians));
        
        }
        
        if (Weapons.weapon==5){
           
        d.strokeWeight(3);    
        double theta_radians = Math.atan2(Math.round(x)-mouseXD, Math.round(y)-mouseYD);
        endX1   = (float) (x - (Weapons.length+15)* Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+15) * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
        d.strokeWeight(Weapons.width);
         d.stroke(49, 99, 8);
        endX1   = (float) (x - Weapons.length * Math.sin(theta_radians));
        endY1   = (float) (y - Weapons.length * Math.cos(theta_radians));
        d.line(Math.round(x),Math.round(y),Math.round(endX1),Math.round(endY1));
         endX1   = (float) (x - (Weapons.length+15)* Math.sin(theta_radians));
        endY1   = (float) (y - (Weapons.length+15) * Math.cos(theta_radians));
        }
        d.strokeWeight(4);
        d.stroke(1);
        d.image(d.loadImage("Main.png"),x,y);
        
        
    }
    public void Barrier(){
        if (x>1920){
            x=1920;
        }
        if (x<0){
            x=0;
        }
        if (y>1080){
            y=1080;
        }
        if (y<0){
            y=0;
        }
            }
    public void Move(){
        x=x+ace*(accxr-accxl);
            
        y=y+ace*(accyd-accyt);
    }
    
    public void Accel(){
        if (keys==true){
            ace=(float) (ace+0.1);
        }
        else if((keys!=true)&&(ace>2)){
            ace=(float) (ace-0.1);
        }
        if (ace>10){
            ace=10;
        }
    }
    
}
