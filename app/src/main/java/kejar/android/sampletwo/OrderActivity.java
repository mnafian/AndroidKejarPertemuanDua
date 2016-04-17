package kejar.android.sampletwo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created on : April/17/2016
 * Author     : mnafian
 * Name       : M. Nafian
 * Email      : mnafian@icloud.com
 * GitHub     : https://github.com/mnafian
 * LinkedIn   : https://id.linkedin.com/in/mnafian
 * Company    : Rimbunesia.com
 * Project    : SampleTwo
 */
public class OrderActivity extends AppCompatActivity {

    private TextView totalCoffe, totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_layout);

        assert getSupportActionBar() != null;
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        totalCoffe = (TextView) findViewById(R.id.total_coffe);
        totalPrice = (TextView) findViewById(R.id.total_price);

        Bundle bundle = getIntent().getExtras();
        int coffeTotal = bundle.getInt("coffeTotal");
        int priceTotal = bundle.getInt("coffePriceTotal");

        totalCoffe.setText("TOTAL COFFE : " +coffeTotal);
        totalPrice.setText("TOTAL PRICE : " +priceTotal);
    }
}
