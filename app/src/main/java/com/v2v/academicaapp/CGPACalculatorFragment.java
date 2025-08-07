package com.v2v.academicaapp;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class CGPACalculatorFragment extends Fragment {

    EditText gpaInput;
    Button addBtn, calcBtn;
    TextView resultView;
    ArrayList<Double> gpaList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cgpa, container, false);

        gpaInput = view.findViewById(R.id.gpaInput);
        addBtn = view.findViewById(R.id.addBtn);
        calcBtn = view.findViewById(R.id.calcBtn);
        resultView = view.findViewById(R.id.resultView);

        addBtn.setOnClickListener(v -> {
            String gpa = gpaInput.getText().toString();
            if (!gpa.isEmpty()) {
                gpaList.add(Double.parseDouble(gpa));
                gpaInput.setText("");
                Toast.makeText(getContext(), "GPA Added", Toast.LENGTH_SHORT).show();
            }
        });

        calcBtn.setOnClickListener(v -> {
            double total = 0;
            for (double g : gpaList) total += g;
            double cgpa = total / gpaList.size();
            resultView.setText("Your CGPA: " + String.format("%.2f", cgpa));
        });

        return view;
    }
}
