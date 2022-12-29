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
import android.widget.ImageView;

import com.example.ndrdz2.R;
public class FourthFragment extends Fragment {

    private EditText inputText;
    private Button btn_fourth;
    private ImageView image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inputText = view.findViewById(R.id.ed_text_fourth);
        btn_fourth = view.findViewById(R.id.btn_fourth);
        image = view.findViewById(R.id.image_photo);

//        click();
    }
}

//    private void click() {
//        btn_fourth.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = inputText.getText().toString().trim();
//                String text_image = image.ge
//                if (text.isEmpty()) {
//                    editText.setError("Заполните поле!");
//                }else if (!editText.equals(text1) && !editText.equals(text2) && !editText.equals(text3)){
//                    editText.setError("Не правильный ввод текста");
//                }
//            }
//        });
//    }
//}

// if (!naame.equals(admin) || !pasword.equals(admin)) {
//                    if (!naame.equals(admin)) {
//                        name.setError("Не правильно введено имя!");
//                    } else if (!pasword.equals(admin)) {
//                        password.setError("Неправильный пароль!");
//                    }