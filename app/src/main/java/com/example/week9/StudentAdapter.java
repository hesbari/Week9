package com.example.week9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.List;

public class StudentAdapter extends ArrayAdapter {
    private List<Students> students;
    private final LayoutInflater layoutInflater;
    private final int layoutResource;

    public StudentAdapter(@NonNull Context context, int resource, List<Students> students) {
        super(context, resource);
        this.students = students;
        this.layoutInflater = LayoutInflater.from(context);
        //The LayoutInflater class is used to instantiate the contents of layout XML files into their corresponding View objects. In other words, it takes an XML file as input and builds the View objects from it.
        this.layoutResource = resource;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        v = layoutInflater.inflate(layoutResource, parent,false);
        TextView nameText = v.findViewById(R.id.name);
        TextView idText = v.findViewById(R.id.ID);
        TextView  emailText = v.findViewById(R.id.email);
        TextView marks = v.findViewById(R.id.marks);
        TextView avg = v.findViewById(R.id.average);

        nameText.setText(nameText.getText()+students.get(position).getName());
        idText.setText(idText.getText()+students.get(position).getId());
        emailText.setText(emailText.getText()+students.get(position).getEmail());
        marks.setText(marks.getText()+Arrays.toString(students.get(position).getMarks()));
        avg.setText(avg.getText()+String.valueOf(students.get(position).getAverage()));
        //  1:45 pm...


        return v;
    }
}
