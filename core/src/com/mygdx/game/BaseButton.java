package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class BaseButton extends ImageButton {


    public BaseButton(String imagenA, String imageOver, int x, int y, int w, int h, InputListener clickasion) {
        super(new ImageButton.ImageButtonStyle());
        getStyle().up = new TextureRegionDrawable(new TextureRegion(new Texture(imagenA)));
        getStyle().over = new TextureRegionDrawable(new TextureRegion(new Texture(imageOver)));
        setPosition(x, y);
        setSize(w*3, h*3);
        addListener(clickasion);
    }
}
