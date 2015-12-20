package youtube.greendust.volleylistview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebActivity extends Activity {
	private ContextWrapper context;
	private String TAG;
	private WebView webView;


	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//hide Title bar 
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_web);




		Bundle extras = getIntent().getExtras();
		String url;
		if (extras != null) {
			url = extras.getString("url");

			// this webview intialized by univirese not only for this class to use back optin properly
			webView = (WebView) findViewById(R.id.webView);
			webView.setWebViewClient(new WebViewClient());
			webView.getSettings().setJavaScriptEnabled(true);
			webView.loadUrl(url);
		}



	}
				

				
				
}
		

	
	
	