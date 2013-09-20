package com.webonise.friendsfinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.friendsfinder.R;
import com.webonise.friendsfinder.adapter.FriendsListAdapter;

public class FriendsListFragment extends Fragment {

	private MainActivity mainActivity;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mainActivity=(MainActivity)this.getActivity();
		View view = inflater.inflate(R.layout.friends_list, container, false);
		createFriendsList(view);
		return view;
	}

	private void createFriendsList(View mView) {

		ListView listView = (ListView) mView.findViewById(R.id.friends_list);
		FriendsListAdapter adapter=new FriendsListAdapter(mainActivity);

	}

}
