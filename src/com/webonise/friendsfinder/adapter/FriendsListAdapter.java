package com.webonise.friendsfinder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.friendsfinder.R;

public class FriendsListAdapter extends BaseAdapter {

	Context mContext;
	private static final String stringFriendsList[] = { "Friend1", "Friend2",
			"Friend3", "Friend4", "Friend5", "Friend6", "Friend7","Friend8","Friend9","Friend10" };

	public FriendsListAdapter(Context mContext) {
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return stringFriendsList.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = LayoutInflater.from(mContext);
		convertView = inflater.inflate(R.layout.friends_list_element, null);
		TextView textView = (TextView) convertView
				.findViewById(R.id.friendsName);
		textView.setText(stringFriendsList[position]);

		return convertView;
	}

}
