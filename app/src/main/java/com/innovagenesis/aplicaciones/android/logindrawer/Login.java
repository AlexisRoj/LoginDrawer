package com.innovagenesis.aplicaciones.android.logindrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /** Ejecuta el segundo activity*/
                lanzarActivity();
            }
        });
    }


    private void lanzarActivity() {
        /** Es el metodo que cambia de activity, el login se mata al finalizar, pero como es un layout
         * de incio siempre va a pedir la contraseña despues de q la app se va a pause*/
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
