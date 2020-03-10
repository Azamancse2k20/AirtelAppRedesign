package com.example.airtelappredesign;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import com.google.android.material.navigation.NavigationView;

public class ProfilePage extends AppCompatActivity {

    private DrawerLayout drawerLayout;
<<<<<<< HEAD
    private NavigationView navigationView;
    private Toolbar toolbar;
=======
    private Toolbar toolbar;
    private NavigationView navigationView;
>>>>>>> 7f1d03349d6edaa243b2334924cb7688951d8c92


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

<<<<<<< HEAD
        drawerLayout = findViewById(R.id.drawerLayoutId);
        drawerLayout.setScrimColor(getResources().getColor(R.color.transparent));

        navigationView = findViewById(R.id.navId);
        toolbar = findViewById(R.id.toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        toolbar.setTitleTextColor(Color.WHITE);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open
                , R.string.navigation_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(Color.WHITE);
        actionBarDrawerToggle.syncState();

=======

        drawerLayout = findViewById(R.id.drawerLayoutId);
        toolbar = findViewById(R.id.toolbarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profile");
        toolbar.setTitleTextColor(Color.WHITE);

        navigationView = findViewById(R.id.navId);



        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(ProfilePage.this, drawerLayout, toolbar,
                R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(Color.WHITE);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.appbar_menu,menu);
        return true;
>>>>>>> 7f1d03349d6edaa243b2334924cb7688951d8c92
    }
}
