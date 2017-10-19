package actualsolusi.com.samplegeolocation;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by erick on 19/10/2017.
 */

public class TutorialIntentServices extends IntentService{

    public TutorialIntentServices() {
        this(TutorialIntentServices.class.getName());
    }

    public TutorialIntentServices(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        showToast("Starting IntentService");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        showToast("Finishing IntentService");
    }

    protected void showToast(final String msg){
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                Log.d("IntentService",msg);
            }
        });
    }


}
