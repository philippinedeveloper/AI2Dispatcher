package ph.bxtdev.AI2Dispatcher;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import android.util.Log;

public class AI2Dispatcher extends AndroidNonvisibleComponent {
  private String DISPATCH_TAG = "AI2Dispatcher";

  public AI2Dispatcher(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public void Dispatch(String args) {
    DispatchNewEvent(args);
  }

  @SimpleEvent
  public void DispatchNewEvent(String args) {
    boolean isDispatched = EventDispatcher.dispatchEvent(this, "DispatchNewEvent", args);
    Log.d(DISPATCH_TAG, "Event Dispatched   " + isDispatched + "     and arguments:   " + args);
  }
}

