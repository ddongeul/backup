package g.sns_test;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class UniversityFragment extends Fragment {
    String TAG = "UniversityFragment";
   // private ArrayList<UniversityData> arrayList;
    private UniversityAdapter universityadapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"UniversityFragment 호출");

        View view = inflater.inflate(R.layout.fragment_university, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        layoutmanager = new GridLayoutManager(getActivity(),3);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setHasFixedSize(true);

//        arrayList = new ArrayList<>();
//        arrayList.add(new UniversityData("Huemechanic",R.drawable.daejeon));
//        arrayList.add(new UniversityData("피노키오",R.drawable.daejeon));
//        arrayList.add(new UniversityData("퍼펙트",R.drawable.daejeon));
//        arrayList.add(new UniversityData("통기타",R.drawable.daejeon));
//        arrayList.add(new UniversityData("춤",R.drawable.daejeon));
//        arrayList.add(new UniversityData("노래",R.drawable.daejeon));
//
        universityadapter = new UniversityAdapter(getContext(), mNames,mImageUrls);
        recyclerView.setAdapter(universityadapter);

        mImageUrls.add("https://cdn.pixabay.com/photo/2020/05/21/13/33/blue-flax-5200811_960_720.jpg");
        mNames.add("체육분과");

        mImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        mNames.add("봉사분과");

        mImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        mNames.add("학술분과");

        mImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        mNames.add("교양분과");

        mImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        mNames.add("문화분과");

        mImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        mNames.add("종교분과");

        return view;
    }
//
//    private void initImageBitmaps(){
//        Log.d(TAG, "initImageBitmaps");
//
//        mImageUrls.add("https://pixabay.com/photos/landscape-sea-sky-clouds-sunset-5205518/");
//        mNames.add("체육분과");
//
//        mImageUrls.add("https://pixabay.com/photos/landscape-sea-sky-clouds-sunset-5205518/");
//        mNames.add("문화분과");
//
//        mImageUrls.add("https://pixabay.com/photos/landscape-sea-sky-clouds-sunset-5205518/");
//        mNames.add("경제분과");
//
//    }

}
