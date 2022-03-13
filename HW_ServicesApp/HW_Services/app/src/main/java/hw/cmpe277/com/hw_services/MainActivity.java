package hw.cmpe277.com.hw_services;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDownloadPage(View view) {
        Intent insertIntent = new Intent(this, DownloadActivity.class);
        startActivity(insertIntent);
    }

    public void close(View view) {
        MainActivity.this.finish();
    }
}
