package com.example.activivad1mca;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textForgotPassword = findViewById(R.id.forgotPassword);

        ImageView background = findViewById(R.id.imageView2);
        Glide.with(this)
                .load(R.drawable.background)
                .transition(DrawableTransitionOptions.withCrossFade(3000))
                .centerCrop()
                .into(background);
//
        textForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showForgotPassword();
            }
        });
    }

    //APUNTES, PARA QUE SIRVE EL BUILDER EN ESTE CASO?

    // En Android, el patrón Builder también se utiliza para construir diálogos con múltiples opciones y configuraciones.

    public void showForgotPassword() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //Cambia el texto que haya para clickar
        builder.setTitle("¿Olvidaste tu contraseña?");
        //Una vez clickas sale una alerta, pues te es el mensaje
        builder.setMessage("Introduce tu dirección de correo electrónico para restablecer la contraseña:");

        builder.setPositiveButton("Cambiar contraseña", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Aquí puedes manejar la lógica de enviar el correo electrónico o realizar cualquier otra acción necesaria
                Intent intent = new Intent(MainActivity.this,UpdateRegsitro.class);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}