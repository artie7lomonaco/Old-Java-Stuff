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
public class Weapons {
    public static int weapon=1;
    public static int maxammo=13;
    public static int ammo=13;
    int firerate=10;
    int cooldownfire=10;
    int reloadcooldown=20;
    int numbullets=1;
    public static int damage=25;
    public static int kb=25;
    public static int bulletace=200;
    public static double spread = 0.5;
    public static String name="Glock-18";
    public static int length=40;
    public static int power=40;
    public static int width=4;
    
    public Weapons(){
        
    }
    
    void WeaponCooldowns(){
        reloadcooldown=reloadcooldown-1;
        cooldownfire=cooldownfire-1;
    }
    void WeaponInit(){
        if (weapon==1){
            name="Glock-18";
            width=4;
            power=80;
            length=40;
            maxammo=13;
            ammo=maxammo;
            firerate=10;
            cooldownfire=10;
            reloadcooldown=20;
            numbullets=1;
            damage=25;
            kb=25;
            bulletace=200;
            spread=0.75;
            
        }
        if (weapon==2){
            name="Nova";
            width=6;
            power=150;
            length=45;
            maxammo=8;
            ammo=maxammo;
            firerate=50;
            cooldownfire=firerate;
            reloadcooldown=40;
            numbullets=9;
            damage=20;
            kb=250;
            bulletace=250;
            spread=1;
        }
        if (weapon==3){
            name="Ak-47";
            width=4;
            power=75;
            length=48;
            maxammo=30;
            ammo=maxammo;
            firerate=3;
            cooldownfire=firerate;
            reloadcooldown=60;
            numbullets=1;
            damage=35;
            kb=30;
            bulletace=250;
            spread=0.85;
        }
        if (weapon==4){
            name="M249";
            width=10;
            power=60;
            length=52;
            maxammo=300;
            ammo=maxammo;
            firerate=1;
            cooldownfire=firerate;
            reloadcooldown=200;
            numbullets=4;
            damage=12;
            kb=30;
            bulletace=250;
            spread=1.2;
        }
        if (weapon==5){
            name="AWP";
            width=3;
            power=500;
            length=60;
            maxammo=10;
            ammo=maxammo;
            firerate=30;
            cooldownfire=firerate;
            reloadcooldown=60;
            numbullets=1;
            damage=200;
            kb=150;
            bulletace=500;
            spread=0.05;
        }
    }
    void WeaponReload(){
        ammo=maxammo;
        if (weapon==1){
            reloadcooldown=20;
        }
        else if (weapon==2){
            reloadcooldown=40;
        }
        else if (weapon==3){
            reloadcooldown=60;
        }
        else if (weapon==4){
            reloadcooldown=200;
        }
        else if (weapon==5){
            reloadcooldown=60;
        }
    }
    
    
}
