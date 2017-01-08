package binding_demo.coderzheaven.com.bindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import binding_demo.coderzheaven.com.bindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    User2 user2;
    User3 user3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.
                setContentView(this, R.layout.activity_main);
        user = new User("Coderz", "Heaven");
        binding.setUser(user);

        binding.b1.setText("Update");
        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Updatin BaseObservable
                user.setFirstName("New Updated First Name");
                user.setLastName("New Updated Last Name");

                // Updating ObservableFields
                user2.firstName.set("Apple");
                user2.lastName.set("iOS");

                // Updating  Observable Collections
                user3.name.put(0, "Heaven");

            }
        });

        // ObservableFields
        user2 = new User2();
        user2.firstName.set("Google");
        user2.lastName.set("Android");
        binding.setUser2(user2);

        // Observable Collections
        user3 = new User3();
        user3.name.put(0, "Coderz");
        user3.name.put(1, "Heaven");
        binding.setUser3(user3);

    }

}
