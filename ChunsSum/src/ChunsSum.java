
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import processing.core.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.util.Collections;
/**
 * This is the template of your java Processing sketch You can use the
 * Processing API now.
 *
 * Don't forget that in java, Processing color type doesn't exist, use int
 * instead e.g. int red = color(255,0,0);
 */
public class ChunsSum extends PApplet {
public static float cooldown=20;
public static float amount=0;
public static int weapon=1; 
ArrayList<Bullets> bullets;
ArrayList<Enemies> Enemies;
ArrayList<Blood> Bloods;
public static int level=0;
public static double difficulty=1;
public static int game=0;
public static int coins=1000;
public static int coinew=0;
public static String name="";
int points=0;
int boss=0;
int play=99000;
int unlock2=0;
int unlock3=0;
int unlock4=0;
int unlock5=0;
int unlock6=0;
int unlock7=0;
int unlock8=0;
int mult=1;
int sound=0;

public static int equip=0;
double version=1.0;
String[] array;
String[] array2;
int[] arrayint;

PImage back1img;
PImage frenchimg;
PImage germanimg;
PImage titleimg;
PImage mainimg;
PImage gameimg;
PImage blood;
PImage shopimg;
PImage vendimg;
PImage shotgunimg;
PImage ak47img;
PImage minigunimg;
PImage awpimg;
PImage textimg;
PImage totemimg;
PImage protoimg;
PImage ampimg;
PImage tutimg;
PImage scrollimg;
ArrayList<String> scores;
FileWriter fw;
BufferedWriter bw;
        
//public static int maxammo=13;
//public static int ammo=13;
//public static int numbullets;
//public static int firerate=10;
//public static int cooldownfire=10;
//public static int reloadcooldown=20;

//    public static double y=400;
//    public static double accx=0;
//    public static double accy=0;
//    public static double acc2x=0;
//    public static double acc2y=0;
//    public static double ace=2;
//    public static double base=0;
//    public static double turnRight=0;
//    public static double turnLeft=0;
//    private PImage p3Img;
//    public static int forward=1;
//    public static double yalt=y;
    
    
    Player p;
    Bullets b;
    Weapons w;
    Enemies e;
    Blood c;
    
    
    @Override
    public void settings() {
        //generated size: replace this settings with yours
        size(1920, 1080);
        p= new Player(this);
        w= new Weapons();
        e= new Enemies(this);
        c= new Blood(this);
        fullScreen();
        
    }
    
    @Override
    public void setup() {
        ArrayList<String> scores=new ArrayList<String>();
        try {
    File file =new File("Scores.txt");
    //chemin = dataPath;
    // positions.txt== your file;
 
    if (!file.exists()) {
      file.createNewFile();
    }
 
    
 
    
  }
  catch(IOException ioe) {
    System.out.println("Exception ");
    ioe.printStackTrace();
  }
        try {
    File file =new File("Names.txt");
    //chemin = dataPath;
    // positions.txt== your file;
 
    if (!file.exists()) {
      file.createNewFile();
    }
 
    
 
    
  }
  catch(IOException ioe) {
    System.out.println("Exception ");
    ioe.printStackTrace();
  }

        
        Random rand = new Random();
        bullets= new ArrayList<Bullets>();
        Enemies=new ArrayList<Enemies>();
        Bloods=new ArrayList<Blood>();
        ampimg=loadImage("Amp.png");
        tutimg=loadImage("Tutorial.png");
        shotgunimg=loadImage("Shotgun.png");
        back1img = loadImage("Parisedit.jpg");
        frenchimg = loadImage("french.png");
        germanimg = loadImage("Germany.png");
        titleimg = loadImage("Title.png");
        mainimg=loadImage("Main.png");
        gameimg=loadImage("Back.png");
        shopimg=loadImage("Shop.jpg");
        vendimg=loadImage("Vendor.png");
        ak47img=loadImage("Ak47.png");
        minigunimg=loadImage("Minigun.png");
        awpimg=loadImage("Awp.png");
        textimg=loadImage("Text.png");
        totemimg=loadImage("Totem.png");
        protoimg=loadImage("Protobelt.png");
        scrollimg=loadImage("Scroll.png");
        tutimg.resize(width,height);
        scrollimg.resize(width, height);
        ampimg.resize(200,200);
        protoimg.resize(200,200);
        totemimg.resize(200, 200);
        textimg.resize(450,450);
        shotgunimg.resize(200,100);
        ak47img.resize(200,100);
        shopimg.resize(width,height);
        back1img.resize(width, height);
        gameimg.resize(width,height);
        
        blood=loadImage("blood.png");
        imageMode(CENTER);
        
        
        
        
        
        
        //replace this setup below with yours
       
       strokeWeight(4);
       ellipseMode(CENTER);
       
       }
    
    @Override
    public void draw() {
        
        
        //replace this rendering below with yours
        frameRate(60);
         play=play-1;
            if (play<=0){
            try {
       
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Back1.wav").getAbsoluteFile()); 
          
                    // create clip reference
                    Clip clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start();
         play=10800;
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
            }
        if (game==1){
            int levels=0;
            if (p.phealth>200){
                p.phealth=200;
            }
            if (equip==3){
                mult=2;
            }
            else if(equip!=3){
                mult=1;
            }
            //acc,hp,rad,type,firerate
            if (difficulty>level){
                int randint=(int) Math.ceil(Math.random()*4);
                if (randint==1){
                Enemies.add(new Enemies(this,width, (float) (Math.random()*height),1,100,50,1,0));
                }
                else if(randint==2){
                Enemies.add(new Enemies(this,0, (float) (Math.random()*height),1,100,50,1,0));
                }
                else if(randint==3){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),0,1,100,50,1,0));
                }
                else if(randint==4){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),height,1,100,50,1,0));
                }

                levels=levels+1;
            }
            //acc,hp,rad,type,firerate
            if (difficulty>level&&difficulty>3&&level>3){
                int randint=(int) Math.ceil(Math.random()*4);
                if (randint==1){
                Enemies.add(new Enemies(this,width, (float) (Math.random()*height), (float) 0.5,60,50,2,120));
                }
                else if(randint==2){
                Enemies.add(new Enemies(this,0, (float) (Math.random()*height),(float) 0.5,60,50,2,120));
                }
                else if(randint==3){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),0,(float) 0.5,60,50,2,120));
                }
                else if(randint==4){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),height,(float) 0.5,60,50,2,120));
                }

                levels=levels+1;
            }
            //acc,hp,rad,type,firerate
            if (difficulty>level&&difficulty>5&&level>10){
                int randint=(int) Math.ceil(Math.random()*4);
                if (randint==1){
                Enemies.add(new Enemies(this,width, (float) (Math.random()*height), (float) 0.4,120,60,3,240));
                }
                else if(randint==2){
                Enemies.add(new Enemies(this,0, (float) (Math.random()*height),(float) 0.4,120,60,3,240));
                }
                else if(randint==3){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),0,(float) 0.4,120,60,3,240));
                }
                else if(randint==4){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),height,(float) 0.4,120,60,3,240));
                }

                levels=levels+1;
            }
            //acc,hp,rad,type,firerate
            if (difficulty>level&&difficulty>8&&level>15){
                int randint=(int) Math.ceil(Math.random()*4);
                if (randint==1){
                Enemies.add(new Enemies(this,width, (float) (Math.random()*height), (float) 0.7,110,85,4,20));
                }
                else if(randint==2){
                Enemies.add(new Enemies(this,0, (float) (Math.random()*height),(float) 0.7,110,85,4,20));
                }
                else if(randint==3){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),0,(float) 0.7,110,85,4,20));
                }
                else if(randint==4){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),height,(float) 0.7,110,85,4,20));
                }

                levels=levels+1;
            }
            //acc,hp,rad,type,firerate
            if (difficulty>level&&level>20&&boss==0){
                boss=1;
                int randint=(int) Math.ceil(Math.random()*4);
                if (randint==1){
                Enemies.add(new Enemies(this,width, (float) (Math.random()*height), (float) 0.7,350,150,5,1));
                }
                else if(randint==2){
                Enemies.add(new Enemies(this,0, (float) (Math.random()*height),(float) 0.7,350,150,5,1));
                }
                else if(randint==3){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),0,(float) 0.7,350,150,5,1));
                }
                else if(randint==4){
                Enemies.add(new Enemies(this, (float) (Math.random()*width),height,(float) 0.7,350,150,5,1));
                }

                levels=levels+1;
            }
            level=level+levels;
            cooldown=cooldown-1;
            if (cooldown<0){
                cooldown=0;
            }
            p.cooldown1=cooldown;
            background(gameimg);
            ellipseMode(CENTER);
            for (int x=0;x<Bloods.size();x++){
               int xb=Bloods.get(x).getX();
               int yb=Bloods.get(x).getY();
              
                       
                        image(blood, xb, yb);
                       
//               Bloods.get(x).Display();
            }
            


            


            for (int x=0;x<level;x++){
                float enemx=Enemies.get(x).getX();
                float enemy=Enemies.get(x).getY();
                if ((Enemies.get(x).HitBox(Player.x, Player.y,1)==true)&&(Enemies.get(x).getType()==1)){
                    if(p.MeleeHit()==true){
                        game=3;
                        
                    }
                }
            }



            p.Accel();

            p.Move();
            p.Barrier();
            w.WeaponCooldowns();
            if (p.proto==1){
                for (int x =0;x<9;x++){
                     bullets.add(new Bullets(this,Player.x,Player.y,mouseX,mouseY,200,4));
                     amount=amount+1;
                }
                p.proto=0;
            }
            for (int x=0;x<level;x++){
                for (int i=0;i<amount;i++){
                    float bx=bullets.get(i).getX();
                    float by=bullets.get(i).getY();
                    int bt=bullets.get(i).getType();
                if (Enemies.get(x).HitBox(bx,by,bt)==true){
                    Enemies.get(x).Reset();


                    if (Enemies.get(x).Hit(bullets.get(i).getType())==true){
                        try {
       
                            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Squish.wav").getAbsoluteFile()); 
          
                            // create clip reference
                            Clip clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
                        Bloods.add(new Blood(this,(int)Enemies.get(x).getX(),(int)Enemies.get(x).getY(),(float)Math.random()*2));
                        if (equip==1){
                            p.phealth=p.phealth+1;
                        }
                        
                        if (Enemies.get(x).getType()==1){
                            level=level-1;
                        Enemies.remove(x);
                            difficulty=difficulty+0.2;
                            points=points+100*mult;
                            e.statscale=e.statscale+3;
                            break;
                        }
                        else if(Enemies.get(x).getType()==2){
                            level=level-1;
                        Enemies.remove(x);
                         points=points+150*mult;
                            difficulty=difficulty+0.4;
                            e.statscale=e.statscale+4;
                            break;
                        }
                        if (Enemies.get(x).getType()==3){
                            level=level-1;
                        Enemies.remove(x);
                         points=points+250*mult;
                            difficulty=difficulty+0.6;
                            e.statscale=e.statscale+5;
                            break;
                        }
                        if (Enemies.get(x).getType()==4){
                            level=level-1;
                            Enemies.remove(x);
                             points=points+250*mult;
                            difficulty=difficulty+0.8;
                            e.statscale=e.statscale+5;
                            break;
                        }
                        if (Enemies.get(x).getType()==5){
                            level=level-1;
                            Enemies.remove(x);
                             points=points+1000*mult;
                             e.statscale=e.statscale+20;
                            difficulty=5;
                            boss=0;
                            break;
                        }
                    }

                    if (Enemies.get(x).GetHealth()>Weapons.damage){
                         bullets.get(i).Blood();
                    }
                }
                }
            }

            for (int i=0;i<amount;i++){
                    float bx=bullets.get(i).getX();
                    float by=bullets.get(i).getY();
                if (Player.HitBox(bx,by)==true&&bullets.get(i).getType()==2){
                    bullets.remove(i);
                    amount=amount-1;
                    if (p.Hit()==true){
                    game=3;
                    
                    
                }
                }
            }
            for (int x=0;x<amount;x++){

                 if (bullets.get(x).getType()==1){
                fill(247, 116, 9);


            }
                 if (bullets.get(x).getType()==4){
                 fill(7, 242, 234);
                 }
            if (bullets.get(x).getType()==2){
                fill(15, 13, 13);
            }
            if (bullets.get(x).getType()==3){
                fill(226, 14, 11);
            }
            noStroke();
            bullets.get(x).Display();

            }
            fill(255);
            stroke(1);
            p.Display();
             for (int x=0;x<level;x++){
                Enemies.get(x).Pathfind(); 
                Enemies.get(x).Move();
                Enemies.get(x).Display();

                if (Enemies.get(x).Action().equals("fire")&&Enemies.get(x).getFire()<0){
                    int enembul=1;
                    if (Enemies.get(x).getType()==3){
                        enembul=9;
                    }
                    if (Enemies.get(x).getType()==5){
                        enembul=4;
                    }
                    for (int i=0;i<enembul;i++){

                        amount=amount+1;
                        float enemgunx=Enemies.get(x).getEndX();
                        float enemguny=Enemies.get(x).getEndY();
                        bullets.add(new Bullets(this,enemgunx,enemguny,Player.x,Player.y,85,2));
                    }
                    Enemies.get(x).Reload();
                }
            }

            for (int x=0;x<amount;x++){
                bullets.get(x).Move();
            }
            
            for (int x=0;x<amount;x++){
                float Xb=bullets.get(x).getX();
                float Yb=bullets.get(x).getY();
                if (Xb>1920||Xb<0||Yb>1080||Yb<0){
                    bullets.remove(x);
                    amount=amount-1;


                }

            }



            p.mouseXD=mouseX;
            p.mouseYD=mouseY;
    //        b.mouseXB=mouseX;
    //        b.mouseYB=mouseY;
            p.keys=keyPressed;
            if ((mousePressed==true) && (mouseButton == RIGHT)&& (p.cooldown1==0)) {
                if (equip !=2){
                    cooldown=40;
                p.dashdis=200;
                p.dash=1;


                p.Dash();
                }
                else{
                cooldown=20;
                p.dashdis=300;
                p.dash=2;
                p.Dash();
                p.proto=1;
                }
                

            }
            if ((mouseButton == LEFT)&&(mousePressed==true)&&(w.ammo>0)&&(w.cooldownfire<0)&&(w.reloadcooldown<0)){
                p.counterkb=8;
                p.Fire();
                w.cooldownfire=w.firerate;
                AudioInputStream audioInputStream;
                Clip clip; 
                if (w.weapon==1){
                try {
       
       audioInputStream =  AudioSystem.getAudioInputStream(new File("Ak47.wav").getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }



                }
            

               
                //b.Fire();
                if (w.weapon==2){
                try {
       
       audioInputStream =  AudioSystem.getAudioInputStream(new File("Shotgun.wav").getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
                }
                if (w.weapon==3){
                try {
       
       audioInputStream =  AudioSystem.getAudioInputStream(new File("Glock18.wav").getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
               }
                if (w.weapon==5){
                try {
       
       audioInputStream =  AudioSystem.getAudioInputStream(new File("Awp.wav").getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
               }
                if (w.weapon==4){
                try {
       
       audioInputStream =  AudioSystem.getAudioInputStream(new File("Minigun.wav").getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
                }
                w.ammo=w.ammo-1;
               for (int x=0;x<w.numbullets;x++){
               amount=amount+1;
               bullets.add(new Bullets(this,p.endX1,p.endY1,p.mouseXD,p.mouseYD,Weapons.bulletace,1));
                //b.Fire();
                }
            }
            
            //INTERFACE/////////////////////////////////////////////////////////////////////////////////
            textSize(20);
            text("Health: "+p.phealth,100,100);
            text("Points: "+points,100,180);
            text("Ammo: "+(Weapons.ammo),width-250,height-125);
            fill(247, 4, 4);
            rect(100,120,200,20);

            fill(14, 119, 2);
            rect(100,120,Player.phealth,20);
            fill(255);
            fill(15, 15, 14);
            rect(width-250,height-100,200,20);
            fill(255);
            fill(224, 224, 15);

            rect(width-250,height-100,((float)Weapons.ammo/Weapons.maxammo)*200,20);
            fill(255);
            if (w.reloadcooldown>0){
                rect(Player.x-(w.reloadcooldown/2),Player.y-50,w.reloadcooldown,5);
            }

            text("Weapon: "+(Weapons.name),width-250,height-150);
            ////////////////////////////////////////////////////////////////////////////////////////////
        }
        else if(game==3){
            coinew=points/10;
            strokeWeight(4);
            fill(255);
            background(1);
            textSize(100);
            text("GAME OVER",width/2-300,550);
            textSize(50);
            text("Points: "+points,width/2-100,625);
            rect(width/2-150,700,300,100);
            text("Name:",width-400,200);
            text(name,width-200,200);
            text("You Earned "+coinew+" Coins",width/2-250,900);
            textSize(20);
            fill(1);
            
            text("Press Space to",width/2-80,745);
            text("Return to Menu",width/2-80,770);
           
        }
        else if(game==0){
            strokeWeight(4);
           
            
            fill(255);
            background(back1img);
            textSize(40);
            image(germanimg,900,700);
            image(frenchimg,1400,750);
           
            image(titleimg,450,150);
            rect(300,300,300,60);
            rect(300,600,300,60);
            rect(300,450,300,60);
            rect(300,750,300,60);
            textSize(20);
            fill(143);
            text("Release-Version:"+version,width-200,height-25);
            fill(1);
            
            text("Start",355,342);
            text("Tutorial",355,642);
            text("Shop",355,492);
            text("Highscores",355,792);
            cooldown=20;
            e.statscale=0;
            coins=coins+coinew;
            coinew=0;
            amount=0;
            w.weapon=1; 
            Enemies.clear();
            bullets.clear();
            level=0;
            difficulty=1;
            points=0;
            boss=0;
            Bloods.clear();
            c=new Blood(this);
            p= new Player(this);
            w= new Weapons();
            e= new Enemies(this);
             w.WeaponInit();
            if (mouseButton == LEFT&&mouseX>300&&mouseX<600&&mouseY>300&&mouseY<360){
               
                
               game=1;
                //b.Fire();

            }
            if (mouseButton == LEFT&&mouseX>300&&mouseX<600&&mouseY>450&&mouseY<510){
               
                
               game=2;
                //b.Fire();

            }
            if (mouseButton == LEFT&&mouseX>300&&mouseX<600&&mouseY>750&&mouseY<810){
               
                
               game=4;
                //b.Fire();

            }
            if (mouseButton == LEFT&&mouseX>300&&mouseX<600&&mouseY>600&&mouseY<660){
               
                
               game=5;
                //b.Fire();

            }
        }
        else if(game==2){
            background(shopimg);
            
            image(vendimg,150,height-200);
            image(shotgunimg,600,height-350);
            image(ak47img,800,height-350);
            image(minigunimg,1000,height-350);
            image(awpimg,1200,height-350);
            image(textimg,250,height-490);
            image(totemimg,700,height-650);
            image(protoimg,900,height-650);
            image(ampimg,1100,height-650);
            textSize(48);
            fill(143);
            rect(width-325,50,300,80);
            rect(100,50,200,80);
            fill(1);
            text("Back",110,110);
            text("Buy My Wares!",100,height-490);
            text("Coins:"+coins,width-300,110);
            if (mouseButton == LEFT&&mouseX>100&&mouseX<300&&mouseY>50&&mouseY<160){
                        game=0;

            }
            if (unlock6==1&&equip!=1){
                textSize(15);
                fill(143);
                rect(660,height-550,80,20);
                fill(255);
                text("Equip",680,height-535);
            }
            if (mouseButton == LEFT&&mouseX>660&&mouseX<740&&mouseY>(height-550)&&mouseY<height-530&&unlock6==1){
                        
                        equip=1;
                }
            if (unlock7==1&&equip!=2){
                textSize(15);
                fill(143);
                rect(860,height-550,80,20);
                fill(255);
                text("Equip",880,height-535);
            }
            if (mouseButton == LEFT&&mouseX>860&&mouseX<940&&mouseY>(height-550)&&mouseY<height-530&&unlock7==1){
                        
                        equip=2;
                }
            if (unlock8==1&&equip!=3){
                textSize(15);
                fill(143);
                rect(1060,height-550,80,20);
                fill(255);
                text("Equip",1080,height-535);
            }
            if (mouseButton == LEFT&&mouseX>1060&&mouseX<1140&&mouseY>(height-550)&&mouseY<height-530&&unlock8==1){
                        
                        equip=3;
                }
            
            
            textSize(15);
            
            if (sound==1){
                sound=0;
                try {
       
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Buy.wav").getAbsoluteFile()); 
          
                    // create clip reference
                    Clip clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
         clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
            }
            if (unlock2==0){
                fill(143);
                rect(580,height-300,80,20);
                fill(255);
                text("Buy",600,height-285);
                text("1000 Coins",580,height-260);
                if (mouseButton == LEFT&&mouseX>580&&mouseX<660&&mouseY>(height-300)&&mouseY<height-280&&coins>=1000){
                        unlock2=1;
                        coins=coins-1000;
                        sound=1;

            }
            }
             if (unlock3==0){
                fill(143);
                rect(780,height-300,80,20);
                fill(255);
                text("Buy",800,height-285);
                text("1500 Coins",780,height-260);
                if (mouseButton == LEFT&&mouseX>780&&mouseX<860&&mouseY>(height-300)&&mouseY<height-280&&coins>=1500){
                        unlock3=1;
                        coins=coins-1500;
                        sound=1;
            }
            }
              if (unlock4==0){
                fill(143);
                rect(980,height-300,80,20);
                fill(255);
                text("Buy",1000,height-285);
                text("3000 Coins",980,height-260);
                if (mouseButton == LEFT&&mouseX>980&&mouseX<1060&&mouseY>(height-300)&&mouseY<height-280&&coins>=3000){
                        unlock4=1;
                        coins=coins-3000;
                        sound=1;
            }
            }
               if (unlock5==0){
                fill(143);
                rect(1180,height-300,80,20);
                fill(255);
                text("Buy",1200,height-285);
                text("2000 Coins",1180,height-260);
                if (mouseButton == LEFT&&mouseX>1180&&mouseX<1260&&mouseY>(height-300)&&mouseY<height-280&&coins>=2000){
                        unlock5=1;
                        coins=coins-2000;
                        sound=1;
                }
               }
                if (unlock6==0){
                fill(143);
                rect(660,height-550,80,20);
                fill(255);
                text("Buy",680,height-535);
                text("2000 Coins",660,height-510);
                if (mouseButton == LEFT&&mouseX>660&&mouseX<740&&mouseY>(height-550)&&mouseY<height-530&&coins>=2000){
                        unlock6=1;
                        coins=coins-2000;
                        equip=1;
                        sound=1;
                }
            }
                if (unlock7==0){
                fill(143);
                rect(860,height-550,80,20);
                fill(255);
                text("Buy",880,height-535);
                text("2000 Coins",860,height-510);
                if (mouseButton == LEFT&&mouseX>860&&mouseX<940&&mouseY>(height-550)&&mouseY<height-530&&coins>=2000){
                        unlock7=1;
                        coins=coins-2000;
                        equip=2;
                        sound=1;
                }
            }
                if (unlock8==0){
                fill(143);
                rect(1060,height-550,80,20);
                fill(255);
                text("Buy",1080,height-535);
                text("2000 Coins",1060,height-510);
                if (mouseButton == LEFT&&mouseX>1060&&mouseX<1140&&mouseY>(height-550)&&mouseY<height-530&&coins>=2000){
                        unlock8=1;
                        coins=coins-2000;
                        equip=3;
                        sound=1;
                }
            }
                
            
        }
        else if(game==5){
            background(tutimg);
            if (mouseButton == LEFT&&mouseX>100&&mouseX<300&&mouseY>30&&mouseY<80){
                        game=0;

            }
            fill(255);
            rect(100,30,200,50);
            fill(1);
            textSize(20);
            text("Back",110,50);
        }
        else if(game==4){
            textSize(30);
            
            if (mouseButton == LEFT&&mouseX>100&&mouseX<300&&mouseY>50&&mouseY<160){
                        game=0;

            }
            
            background(scrollimg);
            fill(255);
            rect(100,50,200,80);
            fill(1);
            text("Back",110,110);
            
            File file =new File("Scores.txt");
            File file1 =new File("Names.txt");
            BufferedReader br; 
            try {
                br = new BufferedReader(new FileReader(file));
             
  
            String st; 
            
                st = br.readLine();
                    array= st.split(" ");
            } catch (IOException ex) {
                Logger.getLogger(ChunsSum.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br = new BufferedReader(new FileReader(file1));
             
  
            String st; 
            
                st = br.readLine();
                    array2= st.split(" ");
            } catch (IOException ex) {
                Logger.getLogger(ChunsSum.class.getName()).log(Level.SEVERE, null, ex);
            }
            int[] arrayint= new int[array.length];
            for (int x=0;x<array.length;x++){
                int i=Integer.parseInt(array[x].replaceAll("\\p{C}", ""));
                arrayint[x]=i;
            }
            Arrays.sort(arrayint);
            arrayint =reverse(arrayint);
            int num=array.length;
            int num2=array2.length;
            if (num>10){
                num=10;
            }
            if (num2>10){
                num2=10;
            }
            for (int x=0;x<num;x++){
                
                text(arrayint[x]+" Points",500,200+x*80);
            }
            for (int x=0;x<num2;x++){
                text(x+1+".",170,200+x*80);
                text(array2[x],200,200+x*80);
            }
        }
        

            //strokeWeight(4);
            //double theta_radians = atan2(Math.round(x)-mouseX, Math.round(y)-mouseY);
            //double endX   = x - 40 * Math.sin(theta_radians);
            //double endY   = y - 40 * Math.cos(theta_radians);
            //line(Math.round(x),Math.round(y),Math.round(endX),Math.round(endY));










                //ellipse((float) (x), (float)y, 33, 33);
                //fill(255);








    //        if (mousePressed == true) {
    //            fill(255); // White
    //             System.out.println(mouseX);
    //             strokeWeight(1);
    //             theta_radians = atan2(Math.round(x)-mouseX, Math.round(y)-mouseY);
    //            endX   = x - 5000 * Math.sin(theta_radians);
    //            endY   = y - 5000 * Math.cos(theta_radians);
    //        line(Math.round(x),Math.round(y),Math.round(endX),Math.round(endY));
    //        System.out.println(mouseY);


            //}


    }
        @Override
        public void keyPressed(){
            if ((keyPressed==true)&&game==3){
            name=name+key;
            }
            if ((key)=='0'&&(keyPressed=true)){
                game=0;
            }
            if ((key)=='1'&&(keyPressed=true)&&game==1){
                w.weapon=1;
                w.WeaponInit();

            }
            if ((key)=='2'&&(keyPressed=true)&&game==1&&unlock2==1){
                w.weapon=2;
                w.WeaponInit();
            }
            if ((key)=='3'&&(keyPressed=true)&&game==1&&unlock3==1){
                w.weapon=3;
                w.WeaponInit();

            }
            if ((key)=='4'&&(keyPressed=true)&&game==1&&unlock4==1){
                w.weapon=4;
                w.WeaponInit();


            }
            if ((key)=='5'&&(keyPressed=true)&&game==1&&unlock5==1){
                w.weapon=5;
                w.WeaponInit();


            }
            if ((key == 'r')||Weapons.ammo==0&&(keyPressed=true)&&game==1) {
                w.WeaponReload();



            }
            if ((key == 'a')&&(keyPressed=true)&&game==1) {


                p.accxl=1;

            } 

            if ((key == 'd')&&(keyPressed=true)&&game==1) {

                p.accxr=1;
            } else { // Otherwise, draw an ellipse

            }

            if ((key == 'w')&&(keyPressed=true)&&game==1) {
                p.accyt=1;

            } else { // Otherwise, draw an ellipse

            }
            if ((key == 's')&&(keyPressed=true)&&game==1) {
                p.accyd=1;

            } 
            if ((keyCode==BACKSPACE)&&(keyPressed=true)&&game==3){
                
                if (((name.length()>2))){
                    System.out.println(name.length());
                name=name.substring(0, name.length() - 2);
                }
                else{
                    name="";
                }
                
            }
            if ((key)==' '&&(keyPressed=true)&&game==3){
                game=0;
                System.out.println(points);
                if (name.equals(" ")){
                    name="player ";
                }
                try {
                File file =new File("Scores.txt");
                FileWriter fw = new FileWriter(file, true);///true = append
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);
            pw.write((Integer.toString(points)+" ").replaceAll("\n", ""));
 
            pw.close();
            }
            
            catch(IOException ioe) {
    System.out.println("Exception ");
    ioe.printStackTrace();
  }
                try {
                File file =new File("Names.txt");
                FileWriter fw = new FileWriter(file, true);///true = append
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);
            pw.write(name.replaceAll("\n", ""));
 
            pw.close();
            }
            
            catch(IOException ioe) {
    System.out.println("Exception ");
    ioe.printStackTrace();
  }

            }
            if ((key)=='g'&&(keyPressed=true)&&game==2){
                coins=coins+10000;
            }
        }
        @Override
        public void keyReleased() {
            if ((key == 'a')&&game==1) {

                p.accxl=0;
            } else { // Otherwise, draw an ellipse

            }

            if ((key == 'd')&&game==1) {

                p.accxr=0;
            } else { // Otherwise, draw an ellipse

            }

            if ((key == 'w')&&game==1) {

                p.accyt=0;
            } else { // Otherwise, draw n ellipse

            }
            if ((key == 's')&&game==1) {

                p.accyd=0;
            } else { // Otherwise, draw an ellipse

            }
    
}
    
    
    public static void main(String[] args) {
        PApplet.main("ChunsSum");
    }
    
}
