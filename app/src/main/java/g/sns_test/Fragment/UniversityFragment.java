package g.sns_test.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import g.sns_test.Activitiy.FirstActivity;
import g.sns_test.Activitiy.SwitchActivity;
import g.sns_test.Adapter.UniversityAdapter;
import g.sns_test.R;

public class UniversityFragment extends Fragment implements  View.OnClickListener {
    String TAG = "UniversityFragment";
    // private ArrayList<UniversityData> arrayList;
//    private UniversityAdapter universityadapter;
//    private RecyclerView recyclerView;
//    private RecyclerView.LayoutManager layoutmanager;
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mImageUrls = new ArrayList<>();

    LinearLayout daejeon;
    LinearLayout hannam;
    LinearLayout wusong;
    LinearLayout baejae;
    LinearLayout mockwon;
    LinearLayout chungnam;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "UniversityFragment 호출");

        View view = inflater.inflate(R.layout.fragment_university, container, false);

        daejeon = (LinearLayout) view.findViewById(R.id.daejeon);
        hannam = (LinearLayout) view.findViewById(R.id.hannam);
        wusong = (LinearLayout) view.findViewById(R.id.wusong);
        baejae = (LinearLayout) view.findViewById(R.id.baejae);
        mockwon = (LinearLayout) view.findViewById(R.id.mockwon);
        chungnam = (LinearLayout) view.findViewById(R.id.chungnam);


        daejeon.setOnClickListener(this);
        hannam.setOnClickListener(this);
        wusong.setOnClickListener(this);
        baejae.setOnClickListener(this);
        mockwon.setOnClickListener(this);
        chungnam.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.daejeon:
                intent = new Intent(getActivity(), SwitchActivity.class);
                intent.putExtra("university", 0);
                startActivity(intent);
                break;
            case R.id.hannam:
                intent = new Intent(getActivity(), SwitchActivity.class);
                intent.putExtra("university", 1);
                startActivity(intent);
                break;
            case R.id.wusong:
                intent = new Intent(getActivity(), SwitchActivity.class);
                intent.putExtra("university", 2);
                startActivity(intent);
                break;
            case R.id.baejae:
                intent = new Intent(getActivity(), SwitchActivity.class);
                intent.putExtra("university", 3);
                startActivity(intent);
                break;
            case R.id.mockwon:
                intent = new Intent(getActivity(), SwitchActivity.class);
                intent.putExtra("university", 4);
                startActivity(intent);
                break;
            case R.id.chungnam:
                intent = new Intent(getActivity(), SwitchActivity.class);
                intent.putExtra("university", 5);
                startActivity(intent);
                break;

            }
        }

}
