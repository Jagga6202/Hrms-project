package com.betasoft.hrms.fragment;

import java.util.ArrayList;

import com.betasoft.hrms.adapter.AppliedLeaveAdapter;
import com.betasoft.hrmsbean.AppliedLeaveBean;
import com.example.jokerquize.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class AppliedLeaveFragment extends Fragment{

	ListView list;
	ArrayList<AppliedLeaveBean> bean;
	AppliedLeaveAdapter ala;
	Spinner spinner;
	private String[] months = { "January", "February", "March", "April",
			   "May", "June", "July", "August",
			   "September","October","November","December" };
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView =inflater.inflate(R.layout.fragment_view_applied_leave,container,false);
		list = (ListView) rootView.findViewById(R.id.applied_leave_adapter_list);

		bean = new ArrayList<AppliedLeaveBean>();
		bean.add(new AppliedLeaveBean("44925","Jagdeep","CL","21sep2015","21sep2015","1","20sep2015","approved","view leave"));
		

		ala = new AppliedLeaveAdapter(getActivity(),android.R.layout.simple_list_item_1, bean);
		list.setAdapter(ala);
		ala.notifyDataSetChanged();
		list.invalidate();
		
		
		spinner = (Spinner) rootView.findViewById(R.id.applied_leave_spinner);
		ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(getActivity(),
			    android.R.layout.simple_spinner_item, months);
		adapter_state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter_state);
	    


		return rootView;

	}
	 public static AppliedLeaveFragment newInstance() {
		 AppliedLeaveFragment fragment = new AppliedLeaveFragment();
	       
	        return fragment;
	    }
}