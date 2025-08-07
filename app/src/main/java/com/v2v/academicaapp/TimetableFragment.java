package com.v2v.academicaapp;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class TimetableFragment extends Fragment {

    EditText subjectInput, timeInput;
    Button addClassBtn;
    ListView timetableListView;
    ArrayList<String> timetableList;
    ArrayAdapter<String> adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timetable, container, false);

        subjectInput = view.findViewById(R.id.subjectInput);
        timeInput = view.findViewById(R.id.timeInput);
        addClassBtn = view.findViewById(R.id.addClassBtn);
        timetableListView = view.findViewById(R.id.timetableListView);

        timetableList = new ArrayList<>();
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, timetableList);
        timetableListView.setAdapter(adapter);

        addClassBtn.setOnClickListener(v -> {
            String subject = subjectInput.getText().toString();
            String time = timeInput.getText().toString();
            if (!subject.isEmpty() && !time.isEmpty()) {
                timetableList.add(subject + " at " + time);
                adapter.notifyDataSetChanged();
                subjectInput.setText("");
                timeInput.setText("");
            }
        });

        return view;
    }
}
