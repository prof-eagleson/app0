package roy.eagleson;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class app0 extends Activity {
  public void onCreate(Bundle myAppState) {
    super.onCreate(myAppState);
    TextView textView = new TextView(this);
    textView.setText("Hello, World!");
    setContentView(textView);
  } }