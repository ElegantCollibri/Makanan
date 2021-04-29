/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 21/04/26 9:53                                                -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2021. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.haerul.foodsapp.R;
import com.haerul.foodsapp.view.detail.DetailActivity;
import com.haerul.foodsapp.view.home.HomeActivity;

import org.w3c.dom.Text;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.inputUsername)
    Text username;

    @BindView(R.id.inputPassword)
    Text password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void switchRegister(View view) {
        this.finish();
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void switchHome(View view) {
        this.finish();
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
