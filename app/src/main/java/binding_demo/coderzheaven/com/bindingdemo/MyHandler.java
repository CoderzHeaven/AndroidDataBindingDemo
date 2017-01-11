package binding_demo.coderzheaven.com.bindingdemo;

import android.view.View;
import android.widget.Button;

public class MyHandler {

    public void onClick(View view){
        ((Button)view).setText("New Text");
    }
}
