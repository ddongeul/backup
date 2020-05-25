package g.sns_test;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class UniversityTextActivity extends AppCompatActivity {
    final static String TAG = "University";
    TextView uv_name;
    ImageView uv_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_universitytext);
        Log.d(TAG, "UniversityText 호출");

        getIncomingIntent();

    }

    private void getIncomingIntent(){
        Log.d(TAG,"getIncomingIntent 호출");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG,"getIncomingIntent : found intent extras");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl, imageName);
        }
    }

    private void setImage(String imageUrl, String imageName) {
        Log.d(TAG, "setImage 호출");

        uv_name = (TextView) findViewById(R.id.textView3);
        uv_name.setText(imageName);

        uv_image = (ImageView) findViewById(R.id.imageView2);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(uv_image);


    }



}
