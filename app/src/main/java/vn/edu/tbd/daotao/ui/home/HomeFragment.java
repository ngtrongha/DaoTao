package vn.edu.tbd.daotao.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import vn.edu.tbd.daotao.R;
import vn.edu.tbd.daotao.data.StudentData;

public class HomeFragment extends Fragment {
    private int count=5;
    private Button bt_login;
    private EditText usename_et, password_et;
    private ArrayList<StudentData> arrayList;
    private int numarray;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_home, container, false);
        usename_et = (EditText) root.findViewById(R.id.username);
        password_et = (EditText) root.findViewById(R.id.password);
        bt_login = (Button) root.findViewById(R.id.btn_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkuser(usename_et.getText().toString(),password_et.getText().toString());
            }
        });

        return root;
    }
    private void ListStudent (){
        arrayList = new ArrayList<StudentData>();
        arrayList.add(new StudentData("171040009","Nguyen Trong Ha","CNTT","28/06/1994","123456789","nt1712ngtrongha@gmail.com", R.drawable.logo));
        arrayList.add(new StudentData("171040010","Nguyen Xuan Lap","Ke Toan","31/02/1999","123456789","nxl1999@gmail.com", R.drawable.logo));

        numarray = arrayList.size();
    }
    private void checkuser(String userName, String userPass){
        ListStudent();
        for (int i =0;i<numarray;i++) {
            String email = arrayList.get(i).Email;
            String pass = arrayList.get(i).Password;
            if ((userName.equals(email)) && (userPass.equals(pass))) {
                Toast.makeText(getActivity(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();

            } else {
                count--;
                Toast.makeText(getActivity(), "Đăng nhập thất bại. Bạn còn " + String.valueOf(count) + " lần", Toast.LENGTH_LONG).show();
                if (count == 0) {
                    bt_login.setEnabled(false);
                }
            }
        }
    }
}
