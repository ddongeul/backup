package g.sns_test;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    final static String TAG = "UniversityTextActivity";
    TextView uv_name;
    ImageView uv_image;

    private FirstAdapter firstAdapter;
    private RecyclerView recyclerView2;
    private RecyclerView.LayoutManager layoutmanager;
//    private ArrayList[] names = new ArrayList[12];
    private ArrayList<String> nNames = new ArrayList<>();
    private ArrayList<String> nImageUrls = new ArrayList<>();

    private int loopNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);
        Log.d(TAG, "FirstActivity 호출");

        getIncomingIntent();

        Intent intent = getIntent();
        recyclerView2 = (RecyclerView)findViewById(R.id.recycler_view2);
        layoutmanager = new GridLayoutManager(this,3);
        recyclerView2.setLayoutManager(layoutmanager);
        recyclerView2.setHasFixedSize(true);

        firstAdapter = new FirstAdapter(getApplicationContext(),nNames, nImageUrls);
        recyclerView2.setAdapter(firstAdapter);

//        String[] names = intent.getStringArrayExtra("cr_name");
//        String[] cr_name = intent.getStringArrayExtra("cr_name");
//        String[] cr_img =intent.getStringArrayExtra("cr_img");

//        int resID;
//        String pkgName = getPackageName();
//
//        for (int i=0;i<loopNum;i++) {
//
//            String num = String.valueOf(i+1);
//            resID = getResources().getIdentifier("plus" + num, "id", pkgName);
//            nImageUrls.add(cr_img[i+1]);
//            nNames.add(cr_name[i+1]);
//
//        }
//        loopNum = cr_name.length;
//
//        int resID;
//        String pkgName = getPackageName();
//
//        for (int i=0;i<loopNum;i++){
//
//            String num = String.valueOf(i+1);
//
//            resID = getResources().getIdentifier("LL_menu"+num,"id",pkgName);
//            nImageUrls.add(cr_img[i+1]);
//            nNames.add(cr_name[i+1]);
//            nNames.setVisibility(View.VISIBLE);
//
//        }

        String cr_name = intent.getStringExtra("cr_name");
        String cr_img =intent.getStringExtra("cr_img");
        nImageUrls.add(cr_img);
        nNames.add(cr_name);

        String cr_name1 = intent.getStringExtra("cr_name1");
        String cr_img1 =intent.getStringExtra("cr_img1");
        nImageUrls.add(cr_img1);
        nNames.add(cr_name1);

        String cr_name2 = intent.getStringExtra("cr_name2");
        String cr_img2 =intent.getStringExtra("cr_img2");
        nImageUrls.add(cr_img2);
        nNames.add(cr_name2);

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
