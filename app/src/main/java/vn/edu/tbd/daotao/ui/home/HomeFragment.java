package vn.edu.tbd.daotao.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import vn.edu.tbd.daotao.MainActivity;
import vn.edu.tbd.daotao.R;

public class HomeFragment extends Fragment {
    private int count=5;
    private Button bt_login;
    private EditText usename_et, password_et;
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
    private void checkuser(String userName, String userPass){
        if ((userName.equals("nt1712ngtrongha@gmail.com"))&&(userPass.equals("1234"))){
            Toast.makeText(getActivity(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
        } else {
            count--;
            Toast.makeText(getActivity(),"Đăng nhập thất bại. Bạn còn "+String.valueOf(count)+" lần",Toast.LENGTH_LONG).show();
            if (count==0){
                bt_login.setEnabled(false);
            }
        }
    }
}
