package com.example.lab02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import static java.lang.Math.min;

public class Panel extends View {
    private final Paint tlo_pola = new Paint();
    private final Paint tlo_pola2 = new Paint();

    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        tlo_pola.setColor(Color.WHITE);
        tlo_pola2.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.GRAY);

        int size = min(getWidth(), getHeight());
        float pole = size / 8f;

        float offsetX = (getWidth() - size) / 2f;
        float offsetY = (getHeight() - size) / 2f;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Paint kolor = ((i + j) % 2 == 0) ? tlo_pola : tlo_pola2;
                canvas.drawRect(
                        offsetX + i * pole,
                        offsetY + j * pole,
                        offsetX + (i + 1) * pole,
                        offsetY + (j + 1) * pole,
                        kolor
                );
            }
        }
    }

    public void ustawKolory(int kolor1, int kolor2) {
        tlo_pola.setColor(kolor1);
        tlo_pola2.setColor(kolor2);
        invalidate();

    }
}
