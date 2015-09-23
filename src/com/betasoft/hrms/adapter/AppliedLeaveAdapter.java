
package com.betasoft.hrms.adapter;

import java.util.ArrayList;
import java.util.List;

import com.betasoft.hrmsbean.AppliedLeaveBean;
import com.example.jokerquize.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AppliedLeaveAdapter extends ArrayAdapter<AppliedLeaveBean>{
	List<AppliedLeaveBean> items;
	Activity context;
	public AppliedLeaveAdapter(Activity context, int resource,ArrayList<AppliedLeaveBean> items) {
		super(context, resource, items);
		this.context=context;
		this.items=items;

	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = mInflater.inflate(R.layout.adapter_view_applied_leave, null);
		TextView employeeIdTv = (TextView) convertView.findViewById(R.id.employee_id_txt);
		TextView employeeNameTv = (TextView) convertView.findViewById(R.id.employee_name_txt);
		TextView leaveTypeTv = (TextView) convertView.findViewById(R.id.levae_type_txt);
		TextView leaveFromTv = (TextView) convertView.findViewById(R.id.levae_from_txt);
		TextView leaveToTv = (TextView) convertView.findViewById(R.id.levae_to_txt);
		TextView totalDaysTv = (TextView) convertView.findViewById(R.id.total_days_txt);
		TextView requestedOnTv = (TextView) convertView.findViewById(R.id.requested_on_txt);
		TextView leaveStatusTv = (TextView) convertView.findViewById(R.id.leave_status_txt);
		TextView actionTv = (TextView) convertView.findViewById(R.id.action_txt);
		
		employeeIdTv.setText(items.get(position).employeeID);
		employeeNameTv.setText(items.get(position).employeeName);
		leaveTypeTv.setText(items.get(position).leaveType);
		leaveFromTv.setText(items.get(position).leaveFrom);
		leaveToTv.setText(items.get(position).leaveTo);
		totalDaysTv.setText(items.get(position).totalDays);
		requestedOnTv.setText(items.get(position).requestedOn);
		leaveStatusTv.setText(items.get(position).leaveStatus);
		actionTv.setText(items.get(position).action);
		
		return convertView;
	}

}
