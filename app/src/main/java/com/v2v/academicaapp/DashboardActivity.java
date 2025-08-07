package com.v2v.academicaapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNav = findViewById(R.id.bottomNav);

        // Load default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameContainer, new NotesFragment())
                .commit();

        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selected = null;
            int id = item.getItemId();

            if (id == R.id.nav_notes) {
                selected = new NotesFragment();
            } else if (id == R.id.nav_reminder) {
                selected = new ReminderFragment();
            } else if (id == R.id.nav_timetable) {
                selected = new TimetableFragment();
            } else if (id == R.id.nav_cgpa) {
                selected = new CGPACalculatorFragment();
            }

            if (selected != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameContainer, selected)
                        .commit();
            }

            return true;
        });
    }
}