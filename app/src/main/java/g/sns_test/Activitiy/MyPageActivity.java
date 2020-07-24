package g.sns_test.Activitiy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import g.sns_test.R;


public class MyPageActivity extends AppCompatActivity {
    String TAG = "MyPageActivity";

    private TextView privacy;
    private TextView recommendation;
    private TextView friend;
    private TextView notice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        Log.d(TAG, "MypageActivity 호출");


        privacy = (TextView)findViewById((R.id.textView5));
        recommendation = (TextView)findViewById((R.id.textView6));
        friend = (TextView)findViewById((R.id.textView7));
        notice = (TextView)findViewById((R.id.textView8));


        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PrivacyActivity.class);
                startActivity(intent);

            }
        });

        recommendation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecommendationActivity.class);
                startActivity(intent);

            }
        });


        friend.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), FriendActivity.class);
               startActivity(intent);

           }
       });


        notice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NoticeActivity.class);
                startActivity(intent);

            }
        });

    }


//        public void View()
//        {
//            privacy = (TextView)findViewById((R.id.textView5));
//            recommendation = (TextView)findViewById((R.id.textView6));
//            friend = (TextView)findViewById((R.id.textView7));
//            notice = (TextView)findViewById((R.id.textView8));
//
//        }
//
//        public void SetListener(){
//
//        View.OnClickListener Listener = new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                switch (View.getId()) {
//                    case R.id.textView5:
//                        Intent intent = new Intent(getApplicationContext(), PrivacyActivity.class);
//                        startActivity(intent);
//
//                        break;
//                    case R.id.textView6:
//                        break;
//                    case R.id.textView7:
//                        break;
//                    case R.id.textView8:
//                        break;
//
//
//                }
//            }
//        }
//  }

}


