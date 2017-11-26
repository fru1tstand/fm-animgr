package me.fru1t.fxml

import javafx.stage.Stage
import me.fru1t.slik.annotations.Inject
import me.fru1t.slik.annotations.Singleton

@Inject
@Singleton
class StageManager {
  lateinit var stage: Stage
}
