package com.cub.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SexualActivity extends AppCompatActivity {
    List<String> groupList;
    List<String> childList;
    Map<String, List<String>> mobileCollection;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexual);
        createGroupList();
        createCollection();
        expandableListView = findViewById(R.id.listex);
        expandableListAdapter = new SexualExpandableListAdapter(this, groupList, mobileCollection);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int lastExpandedPosition = -1;
            @Override
            public void onGroupExpand(int i) {
                if(lastExpandedPosition != -1 && i != lastExpandedPosition){
                    expandableListView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = i;
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                String selected = expandableListAdapter.getChild(i,i1).toString();

                return true;
            }
        });
    }
    private void createCollection() {
        String[] INTRODUCTIONModels = {"Canadian University of Bangladesh strives to ensure a place of study and work free from sexual abuse, in furtherance of which it maintains a 'Zero Tolerance' attitude towards the vice of sexual harassment. Whenever such an incident is reported or detected, the university takes all necessary legal and administrative actions against the perpetrators. This policy is drafted with a view to establishing legal certainty and in obedience of the of the guidelines contained in the judgment dated 14.05.2009 of the Honorable High Court Division of the Supreme Court of Bangladesh in writ petition No. 5916/2008 and the guidelines of the UGC against sexual harassment."};


        String[] aim = {"To protect everyone associated with the university, irrespective of their religion, race, caste, sex, sexual orientation, from any kind of sexual harassment.",
                "To create awareness about sexual harassment and its demerits.",
                "To convey the message that sexual harassment is a punishable offence.", "To create a mechanism for the elimination and prevention of sexual harassment."
                };
        String[] policymodel = {"All the students of Canadian University of Bangladesh.",
                "All staffs, officers and faculty members of the University.",
                "Any other persons sharing a contractual relationship with the University"};
        String[] resModels = {"To maintain effective mechanism to prevent and deter the commission of offences of sexual abuse and harassment.",
                "To provide effective measures for the prosecution of the offence of sexual harassment"};

        String[] s1Models = {"The term 'sexual harassment' denotes any intentional, unwelcome and inappropriate behavior that has any sexual connotation, whether direct or indirect, explicit or subtle and in particular shall include the following behavior:",
                "Unwelcome sexually determined behavior, e.g. physical contact and advances.",
                "Demand, request and attempt to establish physical relationship or for any other sexual favor by abuse of administrative, authoritative and professional powers.",
                "Harassing someone through letters, telephone calls, cell phone calls, SMS, e-mail, social media, photo, notice, cartoon, writing on chair-table, bench, notice-board, walls of the office, classroom and washroom having sexual implications.",
                "Sexually colored verbal representation.",
                "Displaying pornography and indecent pictures.",
                "Indecent gesture, vulgar jokes, teasing through abusive language, stalking or passing remarks having sexual connotation",
                "Making inappropriate proposals to establish amorous relationships",
                "Repeating proposal to establish amorous relationship after being refused once or to exert pressure or pose threat to accept the same.",
                "Sexually harassing or humiliating new/junior students on campus by seniors or vice versa.",
                "Taking any kind of photographs or video recording for the purpose of blackmailing or defaming any person.",
                "Spreading rumors having sexual connotation about someone.",
                "Discrimination against any person based on his/her gender or sexual orientation"};
        String[] s2Models = { "A convener, who shall be an Assistant Professor or of any person of higher rank.",
                "Three faculty members, of which at least two shall be female.",
                "Two persons from outside the institution."};
        String[] s3Models = { "Taking appropriate measures to ensure a gender discrimination free environment for all students, faculty members or staffs.",
                "Taking extensive and effective measures to notify, publish and communicate this policy to all the persons concerned.",
                "Distributing copy of this policy to all faculty members and staffs and obtaining their sign thereon.",
                "Distributing copies of the policy to all students along with their orientation documents and obtaining their signs thereon.",
                "Distributing copies of the policy to all existing students and obtaining their signs thereon.",
                "Arranging for seminars, discussions and meeting in the University for raising awareness against sexual harassment and attendance in such programs shall be mandatory.",
                "Publishing the policy in the official website of the University.",
                "Establishing a concrete procedure through which victims can avail justice.",
                "Arranging counselling for the concerned persons in appropriate cases.",
                "Ensuring a speedy and impartial investigation of all complaints.",
                "Spreading rumors having sexual connotation about someone.",
                "Discrimination against any person based on his/her gender or sexual orientation"};
        String[] s4Models = { "All complaints of sexual harassment shall be submitted to the cell within 30 working days of the occurrence. However, in exceptional cases the cell can extend the period for further 15 days.",
                "In case of serious offence, the cell can take cognizance thereof by its own initiative.",
                "It must be ensured that the identity of the complaint and that of the accused will not be disclosed until the disposal of the complaint.",
                "Security of the complainant will be ensured while the investigation continues.",
                "In case of minor incident, the cell can dispose the matter summarily with the consent of the parties.",
                "In all other cases the cell will proceed with investigation.",
                "The cell is entitled to send registered notice by email to the parties and the witnesses to appear before it and co-operate in its proceeding.",
                "The cell is entitled to consider all the relevant oral, documentary and circumstantial evidences to reach its conclusion.",
                "While interrogating the victim any question or behavior should be avoided which intentionally affect him/her adversely.",
                "The cell will submit its report to the VC within 30 working days of filing the complaint. However, in exceptional circumstances with the permission of the VC this period can be extended for further 15 days.",
                "If the complainant wishes to withdraw the complaint, the cell will investigate the reasons behind it and mention the same in its report.",
                "In case of false allegation, the cell will recommend appropriate disciplinary action against the complaint.",
                "The committee will take decision on the basis of the decision of the majority. In cases where the committee is divided equally, the decision of the convener will take precedence."};
        String[] s5Models = { "Suspend a student from attending class or a faculty or staff from taking classes or attending work on receipt of a complaint against him/her.",
                "If guilt is proved, appropriate disciplinary action will be taken and in appropriate cases the cell can refer the matter, with the consent of the VC, to the law enforcing agency.",
                "Disciplinary action can range from the issue of a warning notice to dismissal of service and in case of a student, expulsion from the university"};

        mobileCollection = new HashMap<String, List<String>>();
        for(String group : groupList){
            if (group.equals("INTRODUCTION")){
                loadChild(INTRODUCTIONModels);
            } else if (group.equals("AIMS AND OBJECTIVES"))
                loadChild(aim);
            else if (group.equals("SCOPE OF THE POLICY"))
                loadChild(policymodel);
            else if (group.equals("RESPONSIBILITIES OF THE EMPLOYER AND AUTHORITY"))
                loadChild(resModels);
            else if (group.equals("1.Sexual Harassment"))
                loadChild(s1Models);
            else if (group.equals("2. Sexual Harassment Prevention Cell"))
                loadChild(s2Models);
            else if (group.equals("MEASURES TO CURB SEXUAL HARASSMENT"))
                loadChild(s3Models);
            else if (group.equals("SEXUAL HARASSMENT PREVENTION CELL WORKING PROCEDURE"))
                loadChild(s4Models);
            else
                loadChild(s5Models);

            mobileCollection.put(group, childList);
        }
    }

    private void loadChild(String[] mobileModels) {
        childList = new ArrayList<>();
        for(String model : mobileModels){
            childList.add(model);
        }
    }

    private void createGroupList() {
        groupList = new ArrayList<>();
        groupList.add("INTRODUCTION");
        groupList.add("AIMS AND OBJECTIVES");
        groupList.add("SCOPE OF THE POLICY");
        groupList.add("RESPONSIBILITIES OF THE EMPLOYER AND AUTHORITY");
        groupList.add("1.Sexual Harassment");
        groupList.add("2. Sexual Harassment Prevention Cell");
        groupList.add("MEASURES TO CURB SEXUAL HARASSMENT");
        groupList.add("SEXUAL HARASSMENT PREVENTION CELL WORKING PROCEDURE");
        groupList.add("PUNISHMENT");


    }
}