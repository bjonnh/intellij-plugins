package com.intellij.lang.javascript.flex.run;

import com.intellij.ide.browsers.WebBrowser;
import com.intellij.ide.browsers.WebBrowserManager;
import com.intellij.lang.javascript.flex.FlexBundle;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.util.xmlb.annotations.OptionTag;
import com.intellij.util.xmlb.annotations.Transient;
import org.jetbrains.annotations.NotNull;

public class LauncherParameters implements Cloneable {
  public enum LauncherType {
    OSDefault, Browser, Player
  }

  private @NotNull LauncherType myLauncherType = LauncherType.OSDefault;

  private @NotNull String myPlayerPath = SystemInfo.isMac ? "/Applications/Flash Player Debugger.app"
                                                          : SystemInfo.isWindows ? "FlashPlayerDebugger.exe"
                                                                                 : "/usr/bin/flashplayerdebugger";
  private boolean myNewPlayerInstance = false;

  @NotNull
  @Transient
  private WebBrowser myBrowser = WebBrowser.FIREFOX;

  public LauncherParameters() {
  }

  public LauncherParameters(@NotNull final LauncherType launcherType,
                            @NotNull final WebBrowser browser,
                            @NotNull final String playerPath,
                            final boolean isNewPlayerInstance) {
    myLauncherType = launcherType;
    myBrowser = browser;
    myPlayerPath = playerPath;
    myNewPlayerInstance = isNewPlayerInstance;
  }

  public String getPresentableText() {
    switch (myLauncherType) {
      case OSDefault:
        return FlexBundle.message("system.default.application");
      case Browser:
        return myBrowser.getName();
      case Player:
        return FileUtil.toSystemDependentName(myPlayerPath);
      default:
        assert false;
        return "";
    }
  }

  @NotNull
  public LauncherType getLauncherType() {
    return myLauncherType;
  }

  @SuppressWarnings("UnusedDeclaration")
  public void setLauncherType(@NotNull final LauncherType launcherType) {
    myLauncherType = launcherType;
  }

  @SuppressWarnings("UnusedDeclaration")
  @OptionTag(value = "browser")
  public String getBrowserName() {
    return myBrowser.getName();
  }

  @SuppressWarnings("UnusedDeclaration")
  public void setBrowserName(String name) {
    WebBrowser browser = WebBrowserManager.getInstance().findBrowserByName(name);
    if (browser != null) {
      myBrowser = browser;
    }
  }

  @NotNull
  @Transient
  public WebBrowser getBrowser() {
    return myBrowser;
  }

  @NotNull
  public String getPlayerPath() {
    return myPlayerPath;
  }

  @SuppressWarnings("UnusedDeclaration")
  public void setPlayerPath(@NotNull final String playerPath) {
    myPlayerPath = FileUtil.toSystemIndependentName(playerPath);
  }

  public boolean isNewPlayerInstance() {
    return myNewPlayerInstance;
  }

  @SuppressWarnings("UnusedDeclaration")
  public void setNewPlayerInstance(final boolean newPlayerInstance) {
    myNewPlayerInstance = newPlayerInstance;
  }

  @Override
  public LauncherParameters clone() {
    try {
      return (LauncherParameters)super.clone();
    }
    catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    final LauncherParameters that = (LauncherParameters)o;

    if (myBrowser != that.myBrowser) return false;
    if (myLauncherType != that.myLauncherType) return false;
    if (!myPlayerPath.equals(that.myPlayerPath)) return false;

    return true;
  }

  public int hashCode() {
    assert false;
    return super.hashCode();
  }
}
