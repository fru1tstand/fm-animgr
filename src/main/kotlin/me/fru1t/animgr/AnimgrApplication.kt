package me.fru1t.animgr

import javafx.application.Application
import javafx.stage.Stage
import me.fru1t.animgr.ui.splashscreen.SplashScreenScene
import me.fru1t.fxml.StageManager
import me.fru1t.slik.Slik
import me.fru1t.slik.annotations.Inject

fun main(args: Array<String>) {
  Application.launch(AnimgrApplication::class.java, *args)
}

/**
 * Entry point for the Animgr (Anime Manager) application. Loads necessary dependencies and
 * triggers first window launching.
 */
class AnimgrApplication : Application() {
  @Inject private lateinit var stageManager: StageManager

  init {
    Slik.get(AnimgrApplication::class).inject(this)
    System.out.println(AnimgrApplication::class.java.getResource("AnimgrApplication.class"))
  }

  override fun start(primaryStage: Stage?) {
    stageManager.stage = primaryStage!!
    primaryStage.scene = SplashScreenScene()
    primaryStage.show()
  }
}
