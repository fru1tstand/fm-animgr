package me.fru1t.animgr

import javafx.application.Application
import javafx.stage.Stage
import me.fru1t.animgr.ui.SceneList
import me.fru1t.animgr.ui.StageManager
import me.fru1t.slik.Slik
import me.fru1t.slik.annotations.Inject

/**
 * Animgr: An Anime Media Organizer with MyAnimeList Integration.
 *
 * Loads necessary dependencies and triggers first window launching.
 */
class AnimgrApplication : Application() {
  @Inject private lateinit var stageManager: StageManager

  init {
    Slik.get(AnimgrApplication::class).inject(this)
  }

  override fun start(primaryStage: Stage?) {
    stageManager.stage = primaryStage!!
    stageManager.openScene(SceneList.SPLASH_SCREEN)
    stageManager.stage.show()
  }
}
