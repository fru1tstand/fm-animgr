package me.fru1t.animgr.ui

import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import me.fru1t.slik.annotations.Inject
import me.fru1t.slik.annotations.Singleton

@Inject
@Singleton
class StageManager {
  lateinit var stage: Stage

  /** Opens the [scene] within the stage (closing the old one). */
  fun openScene(scene: SceneList) {
    stage.scene = Scene(FXMLLoader.load(scene.getResource()))
  }
}
