C:\Users\Student\Desktoppackage com.example.student.advert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String[] books = {"jAKKALS","jAN","pIETPOMPIES"};
    int[] BookCovers = {R.drawable.book1,R.drawable.book2,R.drawable.bookk3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.listview);
        Myadapter myadapter= new Myadapter(MainActivity.this, books, BookCovers);
        listView.setAdapter(myadapter);
    }
}
