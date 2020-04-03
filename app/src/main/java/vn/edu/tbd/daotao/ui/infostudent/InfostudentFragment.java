package vn.edu.tbd.daotao.ui.infostudent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import vn.edu.tbd.daotao.R;

public class InfostudentFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_infostudent, container, false);
        TextView textView = (TextView) root.findViewById(R.id.text_slideshow);
        textView.setText("Thông tin sinh viên");
        return root;
    }
}
