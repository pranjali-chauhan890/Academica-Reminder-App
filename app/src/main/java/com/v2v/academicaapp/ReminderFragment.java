package com.v2v.academicaapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;
import java.util.Calendar;

public class ReminderFragment extends Fragment {

    EditText reminderTitle;
    Button pickDateTimeBtn;
    TextView selectedDateTime;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reminder, container, false);

        reminderTitle = view.findViewById(R.id.reminderTitle);
        pickDateTimeBtn = view.findViewById(R.id.pickDateTimeBtn);
        selectedDateTime = view.findViewById(R.id.selectedDateTime);

        pickDateTimeBtn.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            DatePickerDialog datePicker = new DatePickerDialog(getContext(), (view1, year, month, dayOfMonth) -> {
                TimePickerDialog timePicker = new TimePickerDialog(getContext(), (view2, hourOfDay, minute) -> {
                    selectedDateTime.setText("Reminder Set For: " + dayOfMonth + "/" + (month+1) + "/" + year + " " + hourOfDay + ":" + minute);
                }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true);
                timePicker.show();
            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
            datePicker.show();
        });

        return view;
    }
}
