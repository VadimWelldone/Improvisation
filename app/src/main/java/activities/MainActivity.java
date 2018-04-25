package activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.thefalcon.test3.R;

/**
 * @author Vadym Oliinyk
 * @email vadim.welldone@gmail.com
 * @date April 17, 2018
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}