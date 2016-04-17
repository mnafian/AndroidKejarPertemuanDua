package kejar.android.sampletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView quantitiy, price;
    private int coffeeTotal = 0;
    private int coffeePrice = 5;
    private int coffeePriceTotal;
    private boolean isMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantitiy = (TextView) findViewById(R.id.text_view_quantity);
        price = (TextView) findViewById(R.id.text_view_price);
    }

    public void increment(View view) {
        coffeeTotal += 1;
        calculatePrice(coffeeTotal);
    }

    public void decrement(View view) {
        coffeeTotal -= 1;
        calculatePrice(coffeeTotal);
    }

    public void updateView(String coffeeTotal, String coffeePrice) {
        quantitiy.setText(coffeeTotal);
        price.setText("$ " + coffeePriceTotal);
    }

    public void calculatePrice(int coffeeTotal) {
        if (!isTotalMinus(coffeeTotal)) {
            coffeePriceTotal = coffeeTotal * coffeePrice;
            updateView(String.valueOf(coffeeTotal), String.valueOf(coffeePriceTotal));
        }
    }

    public boolean isTotalMinus(int coffeeTotal) {
        if (coffeeTotal < 0) {
            isMinus = true;
        } else {
            isMinus = false;
        }
        return isMinus;
    }

}
