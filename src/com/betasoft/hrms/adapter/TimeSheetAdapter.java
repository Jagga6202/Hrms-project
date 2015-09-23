package com.betasoft.hrms.adapter;


import java.util.ArrayList;
import java.util.List;

import com.betasoft.hrmsbean.TimesheetBean;
import com.example.jokerquize.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TimeSheetAdapter extends ArrayAdapter<TimesheetBean>{
	List<TimesheetBean> items;
	Activity context;
	public TimeSheetAdapter(Activity context, int resource,ArrayList<TimesheetBean> items) {
		super(context, resource, items);
		this.context=context;
		this.items=items;

	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = mInflater.inflate(R.layout.adapter_view_attendance, null);
		TextView work_days = (TextView) convertView.findViewById(R.id.view_attendance_work_days_txt);
		TextView total_hours = (TextView) convertView.findViewById(R.id.view_attendance_total_hours_txt);
		TextView in = (TextView) convertView.findViewById(R.id.view_attendance_in_txt);
		TextView out = (TextView) convertView.findViewById(R.id.view_attendance_out_txt);
		TextView from = (TextView) convertView.findViewById(R.id.view_attendance_from_txt);
		TextView to = (TextView) convertView.findViewById(R.id.view_attendance_to_txt);
		
		
		work_days.setText(items.get(position).workDays);
		total_hours.setText(items.get(position).totalHours);
		in.setText(items.get(position).In);
		out.setText(items.get(position).Out);
		from.setText(items.get(position).From);
		to.setText(items.get(position).To);
		return convertView;
	}

}
