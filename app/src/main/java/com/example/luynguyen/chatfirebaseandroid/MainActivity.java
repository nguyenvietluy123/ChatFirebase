package com.example.luynguyen.chatfirebaseandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.luynguyen.chatfirebaseandroid.fragments.ChatFragment;
import com.example.luynguyen.chatfirebaseandroid.fragments.CreateAccountFragment;
import com.example.luynguyen.chatfirebaseandroid.fragments.LoginFragment;

/**
 * A login screen that offers sign up via username.
 */
public class MainActivity extends AppCompatActivity implements ActivityCallback {

    /// Lifecycle methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, LoginFragment.newInstance())
                .commit();
    }

    /// Callback methods

    @Override
    public void openChat() {
        replaceFragment(ChatFragment.newInstance());
    }

    @Override
    public void openCreateAccount() {
        replaceFragment(CreateAccountFragment.newInstance());
    }

    @Override
    public void logout() {
        replaceFragment(LoginFragment.newInstance());
    }

    /// Private methods

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}

