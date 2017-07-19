package com.example.amit.customdialogproject124;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText name, phnumber, dob;
    Button save, cancel;
    ListView lv;
    private List<Details>list;
    private Madapter adapter;
    String[]list1=new String[20];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.additem) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            builder.setTitle("Select The Details");
            name = (EditText) view.findViewById(R.id.name1);
            phnumber = (EditText) view.findViewById(R.id.phnumber1);
            dob = (EditText) view.findViewById(R.id.dob1);
            save = (Button) view.findViewById(R.id.btnsave1);
            cancel = (Button) view.findViewById(R.id.btncancel1);

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    list= new ArrayList<>();
                    final String NAM=name.getText().toString();
                    final String PHO=phnumber.getText().toString();
                    final String DBO=dob.getText().toString();
                    Details details=new Details(NAM,PHO,DBO);
                    for(int i=0;i<list1.length;i++){
                        if(list.add(details))
                        {
                            list.add(details);
                        }
                    }
                    adapter=new Madapter(MainActivity.this,list);
                    lv.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    name.setText("");
                    phnumber.setText("");
                    dob.setText("");

                    if (!name.getText().toString().isEmpty() && !phnumber.getText().toString().isEmpty() &&
                            !dob.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "Name :" + name.getText().toString() + "\n" + "PhoneNumber :"
                                + phnumber.getText().toString() + "\n" + "Date Of Birth :" +
                                dob.getText().toString(), Toast.LENGTH_SHORT).show();
                        name.setText("");
                        phnumber.setText("");
                        dob.setText("");
                    }

                    else
                    {

                        Toast.makeText(MainActivity.this,"Please Fill The All Details",Toast.LENGTH_SHORT).show();
                    }


                }

            });

            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Back To Home", Toast.LENGTH_SHORT).show();

                }
            });
            builder.setView(view);
            AlertDialog dialog1 = builder.create();
            dialog1.show();
        }

        return super.onOptionsItemSelected(item);

    }
}
