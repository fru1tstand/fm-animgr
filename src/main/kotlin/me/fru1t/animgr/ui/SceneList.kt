package me.fru1t.animgr.ui

import java.net.URL

/**
 * Defines all available scenes for the main window. [fileName] should not include folder prefix
 * or ".fxml" extension suffix.
 */
enum class SceneList(private val fileName: String) {
  SPLASH_SCREEN("splash_screen");

  companion object {
    private val RESOURCE_PATH = "/scenes/"
    private val RESOURCE_SUFFIX = ".fxml"

    private val resourceCache = HashMap<SceneList, URL>()
  }

  /** Returns the URL for the FXML file associated to this scene. */
  fun getResource() =
    resourceCache.getOrPut(
        this, { SceneList::class.java.getResource(RESOURCE_PATH + fileName + RESOURCE_SUFFIX) })
}
