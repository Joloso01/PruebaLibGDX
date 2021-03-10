package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PantallaJuego extends BaseScreen{

    SpriteBatch spriteBatch;
    Texture background, ballonRed, ballonGreen, ballonBlue;
    BitmapFont bitmapFont;
    int posX = 200;
    int posY = 250;

    public PantallaJuego(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        bitmapFont = new BitmapFont();

        background = new Texture("background.png");
        ballonRed = new Texture("ballon_red.png");
        ballonGreen = new Texture("ballon_green.png");
        ballonBlue = new Texture("ballon_blue.png");
    }

    @Override
    public void render(float delta) {

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            posX--;
        } else if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            posX++;
        }

        if (posX == 600){
            posX = 200;
        }

        spriteBatch.begin();
        spriteBatch.draw(background, 0, 0, 640, 480);
        spriteBatch.draw(ballonGreen, posX, posY);
        spriteBatch.end();
    }
}
