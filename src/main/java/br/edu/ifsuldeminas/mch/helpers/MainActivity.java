package br.edu.ifsuldeminas.mch.helpers;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.Group;

public class MainActivity extends AppCompatActivity {

    private Group group;
    private Layer layer;
    private boolean toggled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = findViewById(R.id.groupButtons);
        layer = findViewById(R.id.layerExample);

        layer.setRotation(45f);
        layer.setScaleX(0.7f);
        layer.setScaleY(0.7f);

        findViewById(R.id.toggleButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (group.getVisibility() == View.VISIBLE) {
                    group.setVisibility(View.GONE);
                } else {
                    group.setVisibility(View.VISIBLE);
                }

                if (!toggled) {
                    layer.setRotation(0f);
                    layer.setScaleX(1.0f);
                    layer.setScaleY(1.0f);
                } else {
                    layer.setRotation(45f);
                    layer.setScaleX(0.7f);
                    layer.setScaleY(0.7f);
                }
                toggled = !toggled;
            }
        });
    }
}
