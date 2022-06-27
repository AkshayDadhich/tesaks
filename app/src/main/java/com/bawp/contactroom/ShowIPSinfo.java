package com.bawp.contactroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.bawp.contactroom.model.ContactViewModel;

import android.os.Bundle;
import android.widget.TextView;

public class ShowIPSinfo extends AppCompatActivity {
        private int contactId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_ipsinfo);

        TextView ips_name = (TextView) findViewById(R.id.show_ips_name);
        TextView ips_employee_id = (TextView) findViewById(R.id.show_ips_employee_id);
        TextView ips_ips_Dob = (TextView) findViewById(R.id.show_ips_Dob);
        TextView ips_MobileNo = (TextView) findViewById(R.id.show_ips_MobileNo);
        TextView ips_email = (TextView) findViewById(R.id.show_ips_email);
        TextView ips_designation = (TextView) findViewById(R.id.show_ips_designation);
        TextView ips_designation1 = (TextView) findViewById(R.id.show_ips_designation1);
        TextView ips_present_post = (TextView) findViewById(R.id.show_ips_present_post);
        TextView ips_department = (TextView) findViewById(R.id.show_ips_department);
        TextView ips_posted_district = (TextView) findViewById(R.id.show_ips_posted_district);
        TextView ips_scale = (TextView) findViewById(R.id.show_ips_scale);


       ContactViewModel contactViewModel = new ViewModelProvider.AndroidViewModelFactory(ShowIPSinfo.this
                .getApplication())
                .create(ContactViewModel.class);

        contactId = getIntent().getIntExtra(MainActivity.CONTACT_ID, 0);

        contactViewModel.get(contactId).observe(this, contact -> {
            if (contact != null) {
                ips_name.setText(contact.getName());
                ips_employee_id.setText(contact.getEmp_id());
                ips_ips_Dob.setText(contact.getDob());
                ips_MobileNo.setText(contact.getMob_no());
                ips_email.setText(contact.getEmail_id());
                ips_designation.setText(contact.getEmp_designation());
                ips_designation1.setText(contact.getEmp_designation());
                ips_present_post.setText(contact.getPresent_post());
                ips_department.setText(contact.getDepartment());
                ips_posted_district.setText(contact.getPosted_district());
                ips_scale.setText(contact.getScale());

            }
        });

    }
}