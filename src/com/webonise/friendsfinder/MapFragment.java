package com.webonise.friendsfinder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.friendsfinder.R;
import com.google.android.gms.maps.SupportMapFragment;

public class MapFragment extends Fragment {
	MainActivity mainActivity;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.google_map, container,false);
		mainActivity=(MainActivity)getActivity();
		//initializeMap();
		return view;

	}
	private void initializeMap() {
		Object googleMap = null;
		if(googleMap==null)
		{
			SupportMapFragment supportMapFragment = ((SupportMapFragment)mainActivity.getSupportFragmentManager().findFragmentById(R.id.map));
			googleMap= supportMapFragment.getMap();
			
			if(googleMap== null ) {
				Toast.makeText(mainActivity, "Sorry the map is not initialize", Toast.LENGTH_LONG).show();
			}
		}
		
	}
}
