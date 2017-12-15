package conductorpractice.example.com.conductorpractice.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

import conductorpractice.example.com.conductorpractice.R;

/**
 * Created by kbarfour on 14/12/2017.
 */

public class SecondSlide extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.second_slide, container, false);
        return view;
    }

    @Override
    public boolean handleBack() {
        return super.handleBack();
    }
}
