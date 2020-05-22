package g.sns_test;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class FriendActivity extends AppCompatActivity {

    private static final String TAG = "Friend";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        Log.d(TAG, "FriendActivity 호출");


    }
}