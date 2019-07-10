package edu.cnm.deepdive.qodclient;

import android.app.Application;
import edu.cnm.deepdive.qodclient.service.GoogleSignInService;

public class QodApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    GoogleSignInService.setContext(this);
    // This is where we would initialize Stetho, Picasso, etc.
    // This is also where we could do some non-trivial DB operation to force database creation.
  }

}
