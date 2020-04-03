package vn.edu.tbd.daotao.ui.resultstudy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import vn.edu.tbd.daotao.R;

public class ResultstudyFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_resultstudy, container, false);
        TextView textView = (TextView) root.findViewById(R.id.text_gallery);
        textView.setText("Kết quả học tập");
        return root;
    }
}
