package conductorpractice.example.com.conductorpractice.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;

import conductorpractice.example.com.conductorpractice.R;

/**
 * Created by kbarfour on 14/12/2017.
 */

public class FirstSlide extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.first_slide,container,false);
        Button btn = view.findViewById(R.id.btnnext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRouter().pushController(RouterTransaction.with(new SecondSlide()));
            }
        });
        return view;
    }
}
