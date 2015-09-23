package com.betasoft.hrms.fragment;

import java.util.ArrayList;

import java.util.List;

import com.betasoft.hrms.adapter.TimeSheetAdapter;
import com.betasoft.hrmsbean.TimesheetBean;
import com.example.jokerquize.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class TimeSheetFragment extends Fragment{

	ListView list;
	ArrayList<TimesheetBean> bean;
	TimeSheetAdapter tsa;
	Spinner spinner;
	private String[] months = { "January", "February", "March", "April",
			   "May", "June", "July", "August",
			   "September","October","November","December" };
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView =inflater.inflate(R.layout.fragment_view_attendance,container,false);
		list = (ListView) rootView.findViewById(R.id.view_attendance_adapter_list);

		bean = new ArrayList<TimesheetBean>();
		bean.add(new TimesheetBean("03 Sep 2015 - Thursday","09:15","12:35:58","21:51:24","12:29:52","17:55:33"));
		bean.add(new TimesheetBean("02 Sep 2015 - Wednesday","09:15","12:35:58","21:51:24","12:29:52","17:55:33"));
		bean.add(new TimesheetBean("03 Sep 2015 - Thursday","09:15","12:35:58","21:51:24","12:29:52","17:55:33"));
		tsa = new TimeSheetAdapter(getActivity(),android.R.layout.simple_list_item_1, bean);
		list.setAdapter(tsa);
		tsa.notifyDataSetChanged();
		list.invalidate();

		Spinner spinner = (Spinner) rootView.findViewById(R.id.view_attendance_month_spn);
		ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(getActivity(),
			    android.R.layout.simple_spinner_item, months);
		adapter_state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter_state);
        
       
		
		
		return rootView;

	}
	


}