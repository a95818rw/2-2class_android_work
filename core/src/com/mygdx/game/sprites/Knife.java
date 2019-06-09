package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.awt.image.Kernel;
import java.util.Random;

public class Knife {
    public static final int TUBE_WIDTH = 31;

    private Texture knife1, knife2, knife3, knife4, knife5, knife6, knife7, knife8;
    private Vector2 posKnife1, posKnife2, posKnife3, posKnife4, posKnife5, posKnife6, posKnife7, posKnife8;
    private Rectangle boundsKnife1, boundsKnife2, boundsKnife3, boundsKnife4, boundsKnife5, boundsKnife6, boundsKnife7, boundsKnife8;
    private Random rand;


    public Knife(float x){

        knife1 = new Texture("knife.png");
        knife2 = new Texture("knife.png");
        knife3 = new Texture("knife.png");
        knife4 = new Texture("knife.png");
        knife5 = new Texture("knife.png");
        knife6 = new Texture("knife.png");
        knife7 = new Texture("knife.png");
        knife8 = new Texture("knife.png");


        rand = new Random();

        posKnife1 = new Vector2(x, (rand.nextInt(310) + 1) + 60);
        posKnife2 = new Vector2(x, (rand.nextInt(310) + 1) + 60);
        posKnife3 = new Vector2(x, (rand.nextInt(310) + 1) + 60);
        posKnife4 = new Vector2(x, (rand.nextInt(310) + 1) + 60);
        posKnife5 = new Vector2(x, (rand.nextInt(140) + 1) + 230);
        posKnife6 = new Vector2(x, 120);
        posKnife7 = new Vector2(x, 320);
        posKnife8 = new Vector2(x, 360);

        boundsKnife1 = new Rectangle(posKnife1.x, posKnife1.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife2 = new Rectangle(posKnife2.x, posKnife2.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife3 = new Rectangle(posKnife3.x, posKnife3.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife4 = new Rectangle(posKnife4.x, posKnife4.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife5 = new Rectangle(posKnife5.x, posKnife5.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife6 = new Rectangle(posKnife6.x, posKnife6.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife7 = new Rectangle(posKnife7.x, posKnife7.y, knife1.getWidth(), knife1.getHeight());
        boundsKnife8 = new Rectangle(posKnife8.x, posKnife8.y, knife1.getWidth(), knife1.getHeight());

    }

    public Texture getKnife1() { return knife1; }
    public Texture getKnife2() {
        return knife2;
    }
    public Texture getKnife3() { return knife3; }
    public Texture getKnife4() { return knife4; }
    public Texture getKnife5() { return knife5; }
    public Texture getKnife6() { return knife6; }
    public Texture getKnife7() { return knife7; }
    public Texture getKnife8() { return knife8; }


    public Vector2 getPosKnife1() {
        return posKnife1;
    }
    public Vector2 getPosKnife2() {
        return posKnife2;
    }
    public Vector2 getPosKnife3() {
        return posKnife3;
    }
    public Vector2 getPosKnife4() {
        return posKnife4;
    }
    public Vector2 getPosKnife5() {
        return posKnife5;
    }
    public Vector2 getPosKnife6() { return posKnife6; }
    public Vector2 getPosKnife7() { return posKnife7; }
    public Vector2 getPosKnife8() { return posKnife8; }


    public void reposition(float x){
        posKnife1.set(x, posKnife1.y);
        boundsKnife1.setPosition(posKnife1.x, posKnife1.y);
        posKnife2.set(x, posKnife2.y);
        boundsKnife2.setPosition(posKnife2.x, posKnife2.y);
        posKnife3.set(x, posKnife3.y);
        boundsKnife3.setPosition(posKnife3.x, posKnife3.y);
        posKnife4.set(x, posKnife4.y);
        boundsKnife4.setPosition(posKnife4.x, posKnife4.y);
        posKnife5.set(x, posKnife5.y);
        boundsKnife5.setPosition(posKnife5.x, posKnife5.y);
        posKnife6.set(x, posKnife6.y);
        boundsKnife6.setPosition(posKnife6.x, posKnife6.y);
        posKnife7.set(x, posKnife7.y);
        boundsKnife7.setPosition(posKnife7.x, posKnife7.y);
        posKnife8.set(x, posKnife8.y);
        boundsKnife8.setPosition(posKnife8.x, posKnife8.y);
    }

    public boolean collides(Rectangle player){
        boolean x,y;
        x = player.overlaps(boundsKnife1) || player.overlaps(boundsKnife2) || player.overlaps(boundsKnife3) || player.overlaps(boundsKnife8);
        y = player.overlaps(boundsKnife4) ||player.overlaps(boundsKnife5) ||player.overlaps(boundsKnife6) ||player.overlaps(boundsKnife7);
        x = x || y;
        return x;

    }

    public void dispose(){
        knife1.dispose();
        knife2.dispose();
        knife3.dispose();
        knife4.dispose();
        knife5.dispose();
        knife6.dispose();
        knife7.dispose();
        knife8.dispose();

    }

}
