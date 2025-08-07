package com.v2v.academicaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class NotesFragment extends Fragment {

    EditText noteInput;
    Button addNoteBtn;
    ListView notesListView;
    ArrayList<String> notesList;
    ArrayAdapter<String> adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);

        noteInput = view.findViewById(R.id.noteInput);
        addNoteBtn = view.findViewById(R.id.addNoteBtn);
        notesListView = view.findViewById(R.id.notesListView);

        notesList = new ArrayList<>();
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, notesList);
        notesListView.setAdapter(adapter);

        addNoteBtn.setOnClickListener(v -> {
            String note = noteInput.getText().toString().trim();
            if (!note.isEmpty()) {
                notesList.add(note);
                adapter.notifyDataSetChanged();
                noteInput.setText("");
            }
        });

        return view;
    }
}
