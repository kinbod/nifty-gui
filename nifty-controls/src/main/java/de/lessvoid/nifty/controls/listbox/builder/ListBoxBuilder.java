package de.lessvoid.nifty.controls.listbox.builder;

import de.lessvoid.nifty.builder.ControlBuilder;

import javax.annotation.Nonnull;

public class ListBoxBuilder extends ControlBuilder {
  public ListBoxBuilder() {
    super("listBox");
  }

  public ListBoxBuilder(@Nonnull final String id) {
    super(id, "listBox");
  }

  protected ListBoxBuilder(@Nonnull final String id, @Nonnull final String name) {
    super(id, name);
  }

  public void displayItems(final int displayItems) {
    set("displayItems", String.valueOf(displayItems));
  }

  public void selectionModeSingle() {
    set("selectionMode", "Single");
  }

  public void selectionModeMutliple() {
    set("selectionMode", "Multiple");
  }

  public void selectionModeDisabled() {
    set("selectionMode", "Disabled");
  }

  public void showVerticalScrollbar() {
    set("vertical", "on");
  }

  public void showHorizontalScrollbar() {
    set("horizontal", "on");
  }

  public void hideVerticalScrollbar() {
    set("vertical", "off");
  }

  public void hideHorizontalScrollbar() {
    set("horizontal", "off");
  }

  public void optionalVerticalScrollbar() {
    set("vertical", "optional");
  }

  public void optionalHorizontalScrollbar() {
    set("horizontal", "optional");
  }

  public void viewConverterClass(@Nonnull final Class<?> clazz) {
    set("viewConverterClass", clazz.getName());
  }
}
