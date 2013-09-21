package com.webonise.friendsfinder;


import com.example.friendsfinder.R;
import com.webonise.friendsfinder.helper.MapFragmentActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.google_map, container,false);
		MapFragmentActivity mapFragmentActivity=new MapFragmentActivity();
		mapFragmentActivity.initializeMap();
		return view;

	}

}
