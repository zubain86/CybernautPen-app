package com.example.cybernautpen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.cybernautpen.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
        homeTrans.replace(R.id.Constraint, new HomeFragment());
        homeTrans.commit();
       binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch(item.getItemId())
               {
                   case R.id.home:
                       FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
                       homeTrans.replace(R.id.Constraint, new HomeFragment());
                       homeTrans.commit();
                       break;
                   case R.id.layers:
                       FragmentTransaction layersTrans = getSupportFragmentManager().beginTransaction();
                       layersTrans.replace(R.id.Constraint, new LayersFragment());
                       layersTrans.commit();
                       break;
               }
               return true;
           }
       });


    }

}