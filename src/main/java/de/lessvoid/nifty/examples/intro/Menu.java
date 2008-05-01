package de.lessvoid.nifty.examples.intro;

import de.lessvoid.nifty.EndNotify;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

/**
 * Menu.
 * @author void
 */
public class Menu implements ScreenController {

  /**
   * the nifty instance.
   */
  private Nifty nifty;

  /**
   * 
   */
  public void bind(Nifty newNifty, Screen screen) {
    this.nifty = newNifty;
  }

  /**
   * on start screen.
   */
  public final void onStartScreen() {
  }

  /**
   * just goto the next screen.
   */
  public final void onStartInteractive() {
  }

  /**
   * on end screen.
   */
  public final void onEndScreen() {
  }
  
  public void helloWorld() {
    nifty.getCurrentScreen().endScreen(new EndNotify() {
      public void perform() {
        nifty.fromXml("helloworld/helloworld.xml");
      }
    });
  }

  public void textfield() {
    nifty.getCurrentScreen().endScreen(new EndNotify() {
      public void perform() {
        nifty.fromXml("textfield/textfield.xml");
      }
    });
  }

  /**
   * quit.
   */
  public void quit() {
    nifty.gotoScreen("outro");
  }
}
