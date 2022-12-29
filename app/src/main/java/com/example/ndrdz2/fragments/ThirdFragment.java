package com.example.ndrdz2.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.example.ndrdz2.R;

public class ThirdFragment extends Fragment {

    private final String admin = "admin";
    private EditText name, password;
    private Button btn_welcome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name = view.findViewById(R.id.ed_name);
        password = view.findViewById(R.id.ed_password);
        btn_welcome = view.findViewById(R.id.btn_first);

        click();
    }

    private void click() {
        btn_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String naame = name.getText().toString().trim();
                String pasword = password.getText().toString();

                if (!naame.equals(admin) || !pasword.equals(admin)) {
                    if (!naame.equals(admin)) {
                        name.setError("Не правильно введено имя!");
                    } else if (!pasword.equals(admin)) {
                        password.setError("Неправильный пароль!");
                    }
                } else {
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, new FirstFragment())
                            .addToBackStack(ThirdFragment.class.getName())
                            .commit();
                }
            }
        });
    }
}