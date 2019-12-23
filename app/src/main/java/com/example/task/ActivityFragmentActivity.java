package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ActivityFragmentActivity extends AppCompatActivity {
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment2);

        BottomNavigationView navigationView=findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(selectedListener);

        HomeFragment fragment1=new HomeFragment();
        FragmentTransaction fg1=getSupportFragmentManager().beginTransaction();
        fg1.replace(R.id.content,fragment1,"");
        fg1.commit();
    }

    private  BottomNavigationView.OnNavigationItemSelectedListener selectedListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId())
                    {
                        case R.id.nav_home:

                            HomeFragment fragment1=new HomeFragment();
                            FragmentTransaction fg1=getSupportFragmentManager().beginTransaction();
                            fg1.replace(R.id.content,fragment1,"");
                            fg1.commit();

                            return  true;
                        case R.id.nav_profile:
                            ProfileFragment fragment2=new ProfileFragment();
                            FragmentTransaction fg2=getSupportFragmentManager().beginTransaction();
                            fg2.replace(R.id.content,fragment2,"");
                            fg2.commit();

                            return  true;
                        case R.id.nav_user:

                            UsersFragment fragment3=new UsersFragment();
                            FragmentTransaction fg3=getSupportFragmentManager().beginTransaction();
                            fg3.replace(R.id.content,fragment3,"");
                            fg3.commit();
                            return  true;
                    }
                    return false;
                }
            };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
