package binding_demo.coderzheaven.com.bindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import binding_demo.coderzheaven.com.bindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.
                setContentView(this, R.layout.activity_main);
        user = new User("Coderz", "Heaven");
        binding.setUser(user);

        binding.b1.setText("Click Me");
        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setFirstName("New Name");
                user.setLastName("New Updated Name");
            }
        });


    }

}
