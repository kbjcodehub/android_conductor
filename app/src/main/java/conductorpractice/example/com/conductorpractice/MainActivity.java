package conductorpractice.example.com.conductorpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;

import conductorpractice.example.com.conductorpractice.controllers.FirstSlide;

public class MainActivity extends AppCompatActivity {

    private Router router;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating variable to hold container viewgroup
        ViewGroup container = (ViewGroup) findViewById(R.id.controllers_container);

        router = Conductor.attachRouter(this, container,savedInstanceState);

        //setting root controller of router
        if(!router.hasRootController()){
            router.setRoot(RouterTransaction.with(new FirstSlide()));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
