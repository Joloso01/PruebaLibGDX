package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class PantallaIncial extends BaseScreen {
    private Stage stage;

    public PantallaIncial(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    @Override
    public void show() {
        // boton start
        BaseButton botonStart = new BaseButton("button_start_up.png","button_start_over.png",280,200,24,10,new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                setScreen(new PantallaJuego(game));
                return true;
            }
        });

        //boton salir
        BaseButton botonQuit = new BaseButton("button_quit_up.png","button_quit_over.png",280,160,24,10,new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.exit();
                System.exit(0);
                return true;
            }
        });

        //sirve para detectar los inputs
        Gdx.input.setInputProcessor(stage = new Stage());
        stage.addActor(botonStart);
        stage.addActor(botonQuit);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
    }

}
