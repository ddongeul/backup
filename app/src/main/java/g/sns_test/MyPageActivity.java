package g.sns_test;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyPageActivity extends AppCompatActivity {
    String TAG = "MyPageActivity";

    private ArrayList<MyPageData> arrayList;
    private MyPageAdapter mypageadapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        Log.d(TAG, "MypageActivity 호출");

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setHasFixedSize(true);

        arrayList = new ArrayList<>();
        arrayList.add(new MyPageData("개인정보 수정"));
        arrayList.add(new MyPageData("동아리 추천"));
        arrayList.add(new MyPageData("친구"));
        arrayList.add(new MyPageData("설정"));



        mypageadapter = new MyPageAdapter(this, arrayList);
       recyclerView.setAdapter(mypageadapter);
    }
}


