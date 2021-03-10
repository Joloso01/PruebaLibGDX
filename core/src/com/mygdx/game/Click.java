package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.InputListener;

public interface Click {

    public default InputListener click(){
        return new Clickasion();
    }
}
